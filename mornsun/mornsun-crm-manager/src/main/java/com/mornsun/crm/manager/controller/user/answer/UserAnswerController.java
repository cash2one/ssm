package com.mornsun.crm.manager.controller.user.answer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.orm.mybatis.controller.BasePageHelperApiServiceController;
import com.mornsun.crm.core.service.user.answer.IUserAnswerService;
import com.mornsun.jsw.api.vo.user.answer.UserAnswerVo;

/**
 * 用户回答Controller
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Controller
@RequestMapping("/user/answer")
public class UserAnswerController extends BasePageHelperApiServiceController<UserAnswerVo, IUserAnswerService> {

}
