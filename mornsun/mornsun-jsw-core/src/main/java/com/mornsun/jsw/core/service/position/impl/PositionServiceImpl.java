package com.mornsun.jsw.core.service.position.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.orm.mybatis.service.page.impl.BasePageHelperServiceImpl;
import com.common.util.ExceptionUtil;
import com.mornsun.jsw.api.model.position.PositionModelCriteria;
import com.mornsun.jsw.api.vo.position.PositionVo;
import com.mornsun.jsw.core.dao.position.IPositionDao;
import com.mornsun.jsw.core.service.position.IPositionService;

/**
 * 头衔Service
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Service
public class PositionServiceImpl extends BasePageHelperServiceImpl<PositionVo, IPositionDao>
        implements IPositionService {

    @Autowired
    private IPositionDao positionDao;

    /**
     * 根据条件查询总数
     *
     * @param example
     * @return
     * @throws Exception
     */
    public long countByExample(PositionModelCriteria example) throws Exception {
        try {
            return positionDao.countByExample(example);
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
    public int deleteByExample(PositionModelCriteria example) throws Exception {
        try {
            return positionDao.deleteByExample(example);
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
    public int insertSelective(PositionVo record) throws Exception {
        try {
            return positionDao.insertSelective(record);
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
    public List<PositionVo> selectByExample(PositionModelCriteria example) throws Exception {
        try {
            return positionDao.selectByExample(example);
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
    public int updateByExampleSelective(PositionVo record, PositionModelCriteria example) throws Exception {
        try {
            return positionDao.updateByExampleSelective(record, example);
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
    public int updateByExample(PositionVo record, PositionModelCriteria example) throws Exception {
        try {
            return positionDao.updateByExample(record, example);
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
    public int updateByPrimaryKey(PositionVo record) throws Exception {
        try {
            return positionDao.updateByPrimaryKey(record);
        } catch (Exception e) {
            String msg = ExceptionUtil.getInstance().getExceptionMsg(e);
            logger.error(msg, e);
            throw new Exception(msg, e);
        }
    }

}
