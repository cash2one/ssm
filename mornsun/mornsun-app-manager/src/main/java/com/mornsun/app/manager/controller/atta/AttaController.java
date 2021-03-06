package com.mornsun.app.manager.controller.atta;

import com.mornsun.app.core.service.atta.IAttaService;
import com.common.orm.mybatis.controller.BasePageHelperApiServiceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mornsun.jsw.api.vo.atta.AttaVo;

/**
 * 附件Controller
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Controller
@RequestMapping("/atta")
public class AttaController extends BasePageHelperApiServiceController<AttaVo,IAttaService> {

}
