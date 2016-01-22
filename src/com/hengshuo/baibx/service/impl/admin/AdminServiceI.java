package com.hengshuo.baibx.service.impl.admin;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;



import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.exception.Myexception;
import com.hengshuo.baibx.model.Admin;
import com.hengshuo.baibx.model.News;
import com.hengshuo.baibx.service.admin.AdminService;


public class AdminServiceI extends BaseDao_I<Admin, Serializable>implements AdminService {
	private static final Logger log=Logger.getLogger(AdminServiceI.class.getName());

	public AdminServiceI() {
		super();
		
	}

	public AdminServiceI(Class<Admin> entityClass) {
		super(entityClass);
	
	}	
		
		public List<Admin> findAdmin(String adminid) throws Exception {
			
				String[] values={adminid};
				String queryString="From Admin where adminid=?";
				List<Admin> sList=this.find(queryString, values);
				return sList;

			
		}
	public PageSupport<Admin> getpaixu(Integer PageNo){
			
			return this.findAllWithOrder("id", "desc", PageNo, 10);
		}
		
		
		
			
	
}
