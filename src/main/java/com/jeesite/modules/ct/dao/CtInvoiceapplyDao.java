/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.ct.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.ct.entity.CtInvoiceapply;

/**
 * 开票申请DAO接口
 * @author tcl
 * @version 2019-11-11
 */
@MyBatisDao
public interface CtInvoiceapplyDao extends CrudDao<CtInvoiceapply> {
	
}