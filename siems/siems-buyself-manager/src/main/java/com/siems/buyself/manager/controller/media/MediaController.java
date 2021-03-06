package com.siems.buyself.manager.controller.media;

import com.siems.buyself.core.service.media.IMediaService;
import com.common.orm.mybatis.controller.BasePageHelperApiServiceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.siems.jsw.api.vo.media.MediaVo;

/**
 * 多媒体Controller
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Controller
@RequestMapping("/media")
public class MediaController extends BasePageHelperApiServiceController<MediaVo,IMediaService> {

}
