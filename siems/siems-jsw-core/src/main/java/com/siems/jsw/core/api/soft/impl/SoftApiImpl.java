package com.siems.jsw.core.api.soft.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.util.ExceptionUtil;

import com.common.orm.mybatis.api.page.impl.BasePageHelperProviderApiImpl;
import com.siems.jsw.core.service.soft.ISoftService;
import com.siems.jsw.api.api.soft.ISoftApi;
import com.siems.jsw.api.vo.soft.SoftVo;

import com.siems.jsw.api.model.soft.SoftModelCriteria;
import java.util.List;

/**
 * 终端软件Api
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Service
public class SoftApiImpl extends BasePageHelperProviderApiImpl<SoftVo,ISoftService>  implements ISoftApi {  

  @Autowired
  private ISoftService softService;

    /**
    * 根据条件查询总数
    *
    * @param example
    * @return
    * @throws Exception
    */
  public long countByExample(SoftModelCriteria example) throws Exception{
    try {
        return softService.countByExample(example);
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
  public int deleteByExample(SoftModelCriteria example) throws Exception{
    try {
        return softService.deleteByExample(example);
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
  public int insertSelective(SoftVo record) throws Exception{
    try {
        return softService.insertSelective(record);
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
  public List<SoftVo> selectByExample(SoftModelCriteria example) throws Exception{
    try {
        return softService.selectByExample(example);
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
  public int updateByExampleSelective(SoftVo record, SoftModelCriteria example) throws Exception{
    try {
        return softService.updateByExampleSelective(record,example);
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
  public int updateByExample(SoftVo record, SoftModelCriteria example) throws Exception{
    try {
        return softService.updateByExample(record,example);
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
  public int updateByPrimaryKey(SoftVo record) throws Exception{
    try {
        return softService.updateByPrimaryKey(record);
    } catch (Exception e) {
        String msg = ExceptionUtil.getInstance().getExceptionMsg(e);
        logger.error(msg, e);
        throw new Exception(msg, e);
    }
  }

}
