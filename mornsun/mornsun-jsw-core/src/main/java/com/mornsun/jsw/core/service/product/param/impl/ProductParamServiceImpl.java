package com.mornsun.jsw.core.service.product.param.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.util.ExceptionUtil;

import com.common.orm.mybatis.service.page.impl.BasePageHelperServiceImpl;
import com.mornsun.jsw.core.service.product.param.IProductParamService;
import com.mornsun.jsw.core.dao.product.param.IProductParamDao;
import com.mornsun.jsw.api.vo.product.param.ProductParamVo;

import com.mornsun.jsw.api.model.product.param.ProductParamModelCriteria;
import java.util.List;

/**
 * 产品参数Service
 *
 * @author: HuiJunLuo
 * @date:2015年12月31日
 * @Copyright:Copyright (c) xxxx有限公司 2014 ~ 2015 版权所有
 */
@Service
public class ProductParamServiceImpl extends BasePageHelperServiceImpl<ProductParamVo, IProductParamDao>
		implements IProductParamService {

	@Autowired
	private IProductParamDao productparamDao;

	/**
	 * 根据条件查询总数
	 *
	 * @param example
	 * @return
	 * @throws Exception
	 */
	public long countByExample(ProductParamModelCriteria example) throws Exception {
		try {
			return productparamDao.countByExample(example);
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
	public int deleteByExample(ProductParamModelCriteria example) throws Exception {
		try {
			return productparamDao.deleteByExample(example);
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
	public int insertSelective(ProductParamVo record) throws Exception {
		try {
			return productparamDao.insertSelective(record);
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
	public List<ProductParamVo> selectByExample(ProductParamModelCriteria example) throws Exception {
		try {
			return productparamDao.selectByExample(example);
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
	public int updateByExampleSelective(ProductParamVo record, ProductParamModelCriteria example) throws Exception {
		try {
			return productparamDao.updateByExampleSelective(record, example);
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
	public int updateByExample(ProductParamVo record, ProductParamModelCriteria example) throws Exception {
		try {
			return productparamDao.updateByExample(record, example);
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
	public int updateByPrimaryKey(ProductParamVo record) throws Exception {
		try {
			return productparamDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			String msg = ExceptionUtil.getInstance().getExceptionMsg(e);
			logger.error(msg, e);
			throw new Exception(msg, e);
		}
	}

}
