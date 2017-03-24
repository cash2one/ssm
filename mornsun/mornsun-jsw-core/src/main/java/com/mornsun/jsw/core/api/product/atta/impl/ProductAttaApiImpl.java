package com.mornsun.jsw.core.api.product.atta.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.orm.mybatis.api.page.impl.BasePageHelperProviderApiImpl;
import com.common.util.ExceptionUtil;
import com.mornsun.jsw.api.api.product.atta.IProductAttaApi;
import com.mornsun.jsw.api.model.product.atta.ProductAttaModelCriteria;
import com.mornsun.jsw.api.vo.product.atta.ProductAttaVo;
import com.mornsun.jsw.core.service.product.atta.IProductAttaService;

/**
 * 产品附件Api
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Service
public class ProductAttaApiImpl extends BasePageHelperProviderApiImpl<ProductAttaVo,IProductAttaService>  implements IProductAttaApi {

  @Autowired
  private IProductAttaService productattaService;

    /**
    * 根据条件查询总数
    *
    * @param example
    * @return
    * @throws Exception
    */
  public long countByExample(ProductAttaModelCriteria example) throws Exception{
    try {
        return productattaService.countByExample(example);
    } catch (Exception e) {
        String msg = ExceptionUtil.getInstance().getExceptionMsg(e);
        logger.error(msg, e);
        throw new Exception(msg, e);
    }
  }

    /**
    * 根据条件删除数据
    *
    * @param example
    * @return
    * @throws Exception
    */
  public int deleteByExample(ProductAttaModelCriteria example) throws Exception{
    try {
        return productattaService.deleteByExample(example);
    } catch (Exception e) {
        String msg = ExceptionUtil.getInstance().getExceptionMsg(e);
        logger.error(msg, e);
        throw new Exception(msg, e);
    }
  }

    /**
    * 根据条件插入数据
    *
    * @param record
    * @return
    * @throws Exception
    */
  public int insertSelective(ProductAttaVo record) throws Exception{
    try {
        return productattaService.insertSelective(record);
    } catch (Exception e) {
        String msg = ExceptionUtil.getInstance().getExceptionMsg(e);
        logger.error(msg, e);
        throw new Exception(msg, e);
    }
  }

    /**
    * 根据条件查询数据
    *
    * @param example
    * @return
    * @throws Exception
    */
  public List<ProductAttaVo> selectByExample(ProductAttaModelCriteria example) throws Exception{
    try {
        return productattaService.selectByExample(example);
    } catch (Exception e) {
        String msg = ExceptionUtil.getInstance().getExceptionMsg(e);
        logger.error(msg, e);
        throw new Exception(msg, e);
    }
  }

    /**
    * 根据条件更新数据
    *
    * @param record
    * @param example
    * @return
    * @throws Exception
    */
  public int updateByExampleSelective(ProductAttaVo record, ProductAttaModelCriteria example) throws Exception{
    try {
        return productattaService.updateByExampleSelective(record,example);
    } catch (Exception e) {
        String msg = ExceptionUtil.getInstance().getExceptionMsg(e);
        logger.error(msg, e);
        throw new Exception(msg, e);
    }
  }

    /**
    * 根据条件更新数据
    *
    * @param record
    * @param example
    * @return
    * @throws Exception
    */
  public int updateByExample(ProductAttaVo record, ProductAttaModelCriteria example) throws Exception{
    try {
        return productattaService.updateByExample(record,example);
    } catch (Exception e) {
        String msg = ExceptionUtil.getInstance().getExceptionMsg(e);
        logger.error(msg, e);
        throw new Exception(msg, e);
    }
  }

    /**
    * 根据主键更新数据
    *
    * @param record
    * @return
    * @throws Exception
    */
  public int updateByPrimaryKey(ProductAttaVo record) throws Exception{
    try {
        return productattaService.updateByPrimaryKey(record);
    } catch (Exception e) {
        String msg = ExceptionUtil.getInstance().getExceptionMsg(e);
        logger.error(msg, e);
        throw new Exception(msg, e);
    }
  }

}
