package com.mornsun.jsw.core.api.user.favorite.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.orm.mybatis.api.page.impl.BasePageHelperProviderApiImpl;
import com.common.util.ExceptionUtil;
import com.mornsun.jsw.api.api.user.favorite.IUserFavoriteApi;
import com.mornsun.jsw.api.model.user.favorite.UserFavoriteModelCriteria;
import com.mornsun.jsw.api.vo.user.favorite.UserFavoriteVo;
import com.mornsun.jsw.core.service.user.favorite.IUserFavoriteService;

/**
 * 用户收藏Api
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Service
public class UserFavoriteApiImpl extends BasePageHelperProviderApiImpl<UserFavoriteVo, IUserFavoriteService>
        implements IUserFavoriteApi {

    @Autowired
    private IUserFavoriteService userfavoriteService;

    /**
     * 根据条件查询总数
     *
     * @param example
     * @return
     * @throws Exception
     */
    public long countByExample(UserFavoriteModelCriteria example) throws Exception {
        try {
            return userfavoriteService.countByExample(example);
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
    public int deleteByExample(UserFavoriteModelCriteria example) throws Exception {
        try {
            return userfavoriteService.deleteByExample(example);
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
    public int insertSelective(UserFavoriteVo record) throws Exception {
        try {
            return userfavoriteService.insertSelective(record);
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
    public List<UserFavoriteVo> selectByExample(UserFavoriteModelCriteria example) throws Exception {
        try {
            return userfavoriteService.selectByExample(example);
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
    public int updateByExampleSelective(UserFavoriteVo record, UserFavoriteModelCriteria example) throws Exception {
        try {
            return userfavoriteService.updateByExampleSelective(record, example);
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
    public int updateByExample(UserFavoriteVo record, UserFavoriteModelCriteria example) throws Exception {
        try {
            return userfavoriteService.updateByExample(record, example);
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
    public int updateByPrimaryKey(UserFavoriteVo record) throws Exception {
        try {
            return userfavoriteService.updateByPrimaryKey(record);
        } catch (Exception e) {
            String msg = ExceptionUtil.getInstance().getExceptionMsg(e);
            logger.error(msg, e);
            throw new Exception(msg, e);
        }
    }

}
