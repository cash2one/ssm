package com.mornsun.app.manager.controller.user.share;

import com.mornsun.app.core.service.user.share.IUserShareService;
import com.common.orm.mybatis.controller.BasePageHelperApiServiceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mornsun.jsw.api.vo.user.share.UserShareVo;

/**
 * 用户分享Controller
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Controller
@RequestMapping("/user/share")
public class UserShareController extends BasePageHelperApiServiceController<UserShareVo,IUserShareService> {

}
