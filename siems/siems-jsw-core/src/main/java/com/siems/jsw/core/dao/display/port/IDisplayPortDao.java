package com.siems.jsw.core.dao.display.port;

import com.siems.jsw.api.vo.display.port.DisplayPortVo;
import com.siems.jsw.api.model.display.port.DisplayPortModelCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.common.orm.mybatis.dao.page.IBasePageHelperDao;

/**
 * 陈列区域端口Dao
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
public interface IDisplayPortDao extends IBasePageHelperDao<DisplayPortVo> {
  /**
   * 根据条件查询总数
   * 
   * @param example
   * @return
   * @throws Exception
   */
  public long countByExample(DisplayPortModelCriteria example) throws Exception;

  /**
   * 根据条件删除数据
   * 
   * @param example
   * @return
   * @throws Exception
   */
  public int deleteByExample(DisplayPortModelCriteria example) throws Exception;

  /**
   * 根据条件插入数据
   * 
   * @param record
   * @return
   * @throws Exception
   */
  public int insertSelective(DisplayPortVo record) throws Exception;

  /**
   * 根据条件查询数据
   * 
   * @param example
   * @return
   * @throws Exception
   */
  public List<DisplayPortVo> selectByExample(DisplayPortModelCriteria example) throws Exception;

  /**
   * 根据条件更新数据
   * 
   * @param record
   * @param example
   * @return
   * @throws Exception
   */
  public int updateByExampleSelective(@Param("record") DisplayPortVo record, @Param("example") DisplayPortModelCriteria example) throws Exception;

  /**
   * 根据条件更新数据
   * 
   * @param record
   * @param example
   * @return
   * @throws Exception
   */
  public int updateByExample(@Param("record") DisplayPortVo record, @Param("example") DisplayPortModelCriteria example) throws Exception;

  /**
   * 根据主键更新数据
   * 
   * @param record
   * @return
   * @throws Exception
   */
  public int updateByPrimaryKey(DisplayPortVo record) throws Exception;
}
