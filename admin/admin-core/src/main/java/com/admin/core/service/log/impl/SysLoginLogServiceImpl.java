package com.admin.core.service.log.impl;

import org.springframework.stereotype.Service;

import com.admin.api.vo.log.SysLoginLogVo;
import com.admin.core.dao.log.ISysLoginLogDao;
import com.admin.core.service.log.ISysLoginLogService;
import com.common.orm.mybatis.service.page.impl.BasePageHelperControllerServiceImpl;

/**
 * 系统登录日志Service
 * 
 * @author: HuiJunLuo
 * @date:2016年1月21日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Service
public class SysLoginLogServiceImpl extends BasePageHelperControllerServiceImpl<SysLoginLogVo, ISysLoginLogDao>
        implements ISysLoginLogService {

}
