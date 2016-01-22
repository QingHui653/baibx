package com.hengshuo.baibx.service.impl.activation;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.model.Activation;
import com.hengshuo.baibx.model.Collection;
import com.hengshuo.baibx.model.Userb;
import com.hengshuo.baibx.service.activation.ActivationService;
import com.hengshuo.baibx.service.impl.admin.AdminServiceI;

public class ActivationServiceI extends BaseDao_I<Activation, Serializable> implements ActivationService {
	private static final Logger log=Logger.getLogger(ActivationServiceI.class.getName());

	public ActivationServiceI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActivationServiceI(Class<Activation> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

	public PageSupport<Activation> getpaixu(Integer PageNo){
		Activation activation=new Activation();
		return this.findPageByExampleAndOrder(activation, "id", "desc", PageNo, 20);
		
	}
	public List<Activation> findActivation(String accode) {
		String[] values={accode};
		String queryString="From Activation where accode=? and flag='0' ";
		List<Activation> sList=this.find(queryString, values);	
		return sList;	
	}
	
	public List<Activation> findbyaccode(String accode,String userid) {
		String[] values={accode,userid};
		String queryString="From Activation where accode=? and userid=? ";
		List<Activation> sList=this.find(queryString, values);	
		return sList;	
	}
	
	
	
}
