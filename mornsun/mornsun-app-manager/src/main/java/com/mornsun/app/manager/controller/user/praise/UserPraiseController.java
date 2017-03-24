package com.mornsun.app.manager.controller.user.praise;

import com.mornsun.app.core.service.user.praise.IUserPraiseService;
import com.common.orm.mybatis.controller.BasePageHelperApiServiceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mornsun.jsw.api.vo.user.praise.UserPraiseVo;

/**
 * 用户点赞Controller
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Controller
@RequestMapping("/user/praise")
public class UserPraiseController extends BasePageHelperApiServiceController<UserPraiseVo,IUserPraiseService> {

}
