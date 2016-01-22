package com.hengshuo.baibx.service.impl.userb;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.exception.Myexception;
import com.hengshuo.baibx.model.News;
import com.hengshuo.baibx.model.Userb;
import com.hengshuo.baibx.service.userb.UserbService;



public class UserbServiceI extends BaseDao_I<Userb, Serializable>implements UserbService {
	private static final Logger log=Logger.getLogger(UserbServiceI.class.getName());

	public UserbServiceI() {
		super();
		
	}

	public UserbServiceI(Class<Userb> entityClass) {
		super(entityClass);
	
	}	
		
		public Userb findUserb(String userid) {
				String[] values={userid};
				String queryString="From Userb where userid=?";
				List<Userb> sList=this.find(queryString, values);
				Userb userb=sList.get(0);
				return userb;	
		}
		
		public List<Userb> findUserbRe(String userid) {
			String[] values={userid};
			String queryString="From Userb where userid=? ";
			List<Userb> sList=this.find(queryString, values);	
			return sList;	
		}
		
		
		public PageSupport<Userb> getPage(Integer PageNo){
			Userb userb=new Userb();
			return this.findPageByExample(userb, PageNo, 14);
			
		}
		
		
			
	
}
