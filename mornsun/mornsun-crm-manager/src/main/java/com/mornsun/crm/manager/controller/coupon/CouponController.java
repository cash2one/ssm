package com.mornsun.crm.manager.controller.coupon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.orm.mybatis.controller.BasePageHelperApiServiceController;
import com.mornsun.crm.core.service.coupon.ICouponService;
import com.mornsun.jsw.api.vo.coupon.CouponVo;

/**
 * 优惠券Controller
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Controller
@RequestMapping("/coupon")
public class CouponController extends BasePageHelperApiServiceController<CouponVo, ICouponService> {

}
