package com.siems.jsw.api.api.shop;

import com.common.api.page.IBasePageHelperReferenceApi;
import com.siems.jsw.api.vo.shop.ShopVo;

import com.siems.jsw.api.model.shop.ShopModelCriteria;
import java.util.List;

/**
 * 门店Api
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
public interface IShopApi extends IBasePageHelperReferenceApi<ShopVo>  {

    /**
    * 根据条件查询总数
    *
    * @param example
    * @return
    * @throws Exception
    */
    public long countByExample(ShopModelCriteria example) throws Exception;

    /**
    * 根据条件删除数据
    *
    * @param example
    * @return
    * @throws Exception
    */
    public int deleteByExample(ShopModelCriteria example) throws Exception;

    /**
    * 根据条件插入数据
    *
    * @param record
    * @return
    * @throws Exception
    */
    public int insertSelective(ShopVo record) throws Exception;

    /**
    * 根据条件查询数据
    *
    * @param example
    * @return
    * @throws Exception
    */
    public List<ShopVo> selectByExample(ShopModelCriteria example) throws Exception;

    /**
    * 根据条件更新数据
    *
    * @param record
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExampleSelective(ShopVo record, ShopModelCriteria example) throws Exception;

    /**
    * 根据条件更新数据
    *
    * @param record
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(ShopVo record, ShopModelCriteria example) throws Exception;

    /**
    * 根据主键更新数据
    *
    * @param record
    * @return
    * @throws Exception
    */
    public int updateByPrimaryKey(ShopVo record) throws Exception;

}
