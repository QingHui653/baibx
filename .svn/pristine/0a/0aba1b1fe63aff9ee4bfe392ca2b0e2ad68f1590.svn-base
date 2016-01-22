package com.hengshuo.baibx.service.impl.pay;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.common.util.Define;
import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.model.News;
import com.hengshuo.baibx.model.Payinformation;


import com.hengshuo.baibx.service.pay.PayinformationService;

public class PayinformationServiceI extends BaseDao_I<Payinformation, Serializable> implements PayinformationService {

	private static final Logger log=Logger.getLogger(PayinformationServiceI.class.getName());
	public PayinformationServiceI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PayinformationServiceI(Class<Payinformation> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	
	public Payinformation findPayInfor(String userid,String time) {
		String[] values={userid,time};
		String queryString="From Payinformation where userid=? and ordertime=?";
		List<Payinformation> sList=this.find(queryString, values);
		Payinformation payinformation=sList.get(0);
		return payinformation;	
	}
	

	
	public PageSupport<Payinformation> getPage(Integer PageNo){
		Payinformation payinformation=new Payinformation();
		return this.findPageByExample(payinformation, PageNo, 14);
		
	}
	
	public PageSupport<Payinformation> getlist(String userid){
		Payinformation payinformation=new Payinformation();
		payinformation.setUserid(userid);
		payinformation.setProductcode(null);
		payinformation.setStatus(Define.PAY_STRUTS_Y);
		return this.findPageByExample(payinformation, 1, 100);
		
	}
	


}
