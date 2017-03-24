package com.mornsun.app.manager.controller.position;

import com.mornsun.app.core.service.position.IPositionService;
import com.common.orm.mybatis.controller.BasePageHelperApiServiceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mornsun.jsw.api.vo.position.PositionVo;

/**
 * 头衔Controller
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Controller
@RequestMapping("/position")
public class PositionController extends BasePageHelperApiServiceController<PositionVo,IPositionService> {

}
