package com.mornsun.app.manager.controller.coupon;

import com.mornsun.app.core.service.coupon.ICouponService;
import com.common.orm.mybatis.controller.BasePageHelperApiServiceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mornsun.jsw.api.vo.coupon.CouponVo;

/**
 * 代金劵Controller
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Controller
@RequestMapping("/coupon")
public class CouponController extends BasePageHelperApiServiceController<CouponVo,ICouponService> {

}
