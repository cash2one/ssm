package com.mornsun.jsw.api.api.user.footprint;

import com.common.api.page.IBasePageHelperReferenceApi;
import com.mornsun.jsw.api.vo.user.footprint.UserFootprintVo;

import com.mornsun.jsw.api.model.user.footprint.UserFootprintModelCriteria;
import java.util.List;

/**
 * 用户足迹Api
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
public interface IUserFootprintApi extends IBasePageHelperReferenceApi<UserFootprintVo>  {

    /**
    * 根据条件查询总数
    *
    * @param example
    * @return
    * @throws Exception
    */
    public long countByExample(UserFootprintModelCriteria example) throws Exception;

    /**
    * 根据条件删除数据
    *
    * @param example
    * @return
    * @throws Exception
    */
    public int deleteByExample(UserFootprintModelCriteria example) throws Exception;

    /**
    * 根据条件插入数据
    *
    * @param record
    * @return
    * @throws Exception
    */
    public int insertSelective(UserFootprintVo record) throws Exception;

    /**
    * 根据条件查询数据
    *
    * @param example
    * @return
    * @throws Exception
    */
    public List<UserFootprintVo> selectByExample(UserFootprintModelCriteria example) throws Exception;

    /**
    * 根据条件更新数据
    *
    * @param record
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExampleSelective(UserFootprintVo record, UserFootprintModelCriteria example) throws Exception;

    /**
    * 根据条件更新数据
    *
    * @param record
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(UserFootprintVo record, UserFootprintModelCriteria example) throws Exception;

    /**
    * 根据主键更新数据
    *
    * @param record
    * @return
    * @throws Exception
    */
    public int updateByPrimaryKey(UserFootprintVo record) throws Exception;

}
