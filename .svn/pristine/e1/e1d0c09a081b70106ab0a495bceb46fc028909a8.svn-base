package com.hengshuo.baibx.action.activation;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.RequestAware;

import com.hengshuo.baibx.action.BaseAction;
import com.hengshuo.baibx.action.admin.AdminAction;
import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.common.util.Define;
import com.hengshuo.baibx.common.util.DoubleOperationUtil;
import com.hengshuo.baibx.model.Activation;
import com.hengshuo.baibx.service.impl.activation.ActivationServiceI;

public class ActivationAction extends BaseAction implements RequestAware {
	private static Logger log = Logger.getLogger(ActivationAction.class.getName());
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String ids;
	public void setIds(String ids) {
		this.ids = ids;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private ActivationServiceI activationServiceI;
	public void setActivationServiceI(ActivationServiceI activationServiceI) {
		this.activationServiceI = activationServiceI;
	}
	
	public String deleteAll(){
 		if(ids.contains(","))
 		{
 		String[] ss=ids.split(",");
 		for(String s:ss){
 			int id=Integer.parseInt(s);
 			activationServiceI.deleteByKey(id);	
 			}
 		
 		}
 		else {
 			int id=Integer.parseInt(ids);
 			activationServiceI.deleteByKey(id);	
		}
 		return "OK";
 	}
	
	public String delete(){
		activationServiceI.deleteByKey(id);
		return "OK";
	}
	
	
	
	
	
	
	public String list(){
		try {
			PageSupport<Activation>	pageSupport=activationServiceI.getpaixu(getPageNo());
			request.put("pageSupport", pageSupport);
			} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		
		return "OK";
		}
	public String add(){
		try {
			
			for (int i = 0; i < 10; i++) {
				Activation activation=new Activation();
				activation.setFlag(Define.ACCODE_0);
				activation.setType(Define.AC_TYPE_X);
			activation.setAccode(id+DoubleOperationUtil.toRandom(8));
			activationServiceI.saveOrUpdate(activation);
			}
		} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		return  "OK";
	}
	
	
	
	

	private Map<String, Object> request;
	@Override
	public void setRequest(Map arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
	}
	
	
}
