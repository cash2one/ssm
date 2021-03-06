package com.admin.manager.aop;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.admin.core.util.LoginUtil;
import com.common.base.common.BaseLogger;
import com.common.base.constant.PrivilegeConstant;
import com.common.base.model.base.BaseModel;
import com.common.base.model.user.BaseUserModel;
import com.common.base.vo.base.ResultVo;
import com.common.cache.memcache.service.IMemcacheService;

/**
 * 签名切面拦截（主要拦截controller）
 * 
 * @author: HuiJunLuo
 * @date:2016年3月2日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Component
@Aspect
@Order(value = Ordered.LOWEST_PRECEDENCE + 1000)
public class ServiceAspect extends BaseLogger {

    @Autowired
    private IMemcacheService memcacheService;

    @Around("execution(* com..service..Base*ServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {

        Object result = null;

        // 获取request
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();

        // session
        Object sessionId = request.getAttribute(PrivilegeConstant.SESSION_LOGIN_USER_SESSION_ID);
        if (sessionId != null) {
            // 获取登录信息
            BaseUserModel baseUserModel = LoginUtil.getInstance().getLoginUser(BaseUserModel.class, memcacheService,
                    sessionId.toString(), request);

            // 传递参数
            Object paramsTmp[] = point.getArgs();
            for (Object object : paramsTmp) {
                if (object instanceof BaseModel) {
                    BaseModel baseModel = (BaseModel) object;
                    baseModel.setSessionId(sessionId.toString());

                    MethodSignature methodSignature = (MethodSignature) (point.getStaticPart().getSignature());
                    if (methodSignature.getReturnType().getName().equals(ResultVo.class.getName())) {
                        if (point.getSignature().getName().equalsIgnoreCase("save")
                                || point.getSignature().getName().equalsIgnoreCase("batch")) {
                            baseModel.setCreateBy(baseUserModel.getUserId());
                        }
                        if (point.getSignature().getName().equalsIgnoreCase("update")
                                || point.getSignature().getName().equalsIgnoreCase("batch")) {
                            baseModel.setUpdateBy(baseUserModel.getUserId());
                        }
                    }
                }

            }
        }
        result = point.proceed();

        logger.info("[SignAspect][around]" + point);
        return result;
    }

}
