package com.siems.buyself.manager.controller.display.hareware;

import com.siems.buyself.core.service.display.hareware.IDisplayHarewareService;
import com.common.orm.mybatis.controller.BasePageHelperApiServiceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.siems.jsw.api.vo.display.hareware.DisplayHarewareVo;

/**
 * 陈列区域硬件关系Controller
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Controller
@RequestMapping("/display/hareware")
public class DisplayHarewareController extends BasePageHelperApiServiceController<DisplayHarewareVo,IDisplayHarewareService> {

}
