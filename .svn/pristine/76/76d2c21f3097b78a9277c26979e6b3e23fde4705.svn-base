package com.hengshuo.baibx.action.userproduct;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.RequestAware;

import com.hengshuo.baibx.action.BaseAction;
import com.hengshuo.baibx.common.util.DateTimeUtil;
import com.hengshuo.baibx.common.util.DateUtils;
import com.hengshuo.baibx.common.util.Define;
import com.hengshuo.baibx.common.util.MessageHelper;
import com.hengshuo.baibx.model.Activation;
import com.hengshuo.baibx.model.Entity;
import com.hengshuo.baibx.model.Flag;
import com.hengshuo.baibx.model.Information;
import com.hengshuo.baibx.model.MyUser;
import com.hengshuo.baibx.model.Payinformation;
import com.hengshuo.baibx.model.Product;
import com.hengshuo.baibx.model.Uprelation;
import com.hengshuo.baibx.model.Userb;
import com.hengshuo.baibx.service.activation.ActivationService;
import com.hengshuo.baibx.service.flag.FlagService;
import com.hengshuo.baibx.service.impl.activation.ActivationServiceI;
import com.hengshuo.baibx.service.impl.pay.PayinformationServiceI;
import com.hengshuo.baibx.service.impl.study.InformationServiceI;
import com.hengshuo.baibx.service.impl.userb.UserbServiceI;
import com.hengshuo.baibx.service.impl.userproduct.ProductServiceI;
import com.hengshuo.baibx.service.impl.userproduct.UprelationServiceI;

public class UprelationAction extends BaseAction implements RequestAware {

	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(UprelationAction.class.getName());
	private UserbServiceI userbServiceI;
	private UprelationServiceI uprelationServiceI;
	private PayinformationServiceI payinformationServiceI;
	private ProductServiceI productServiceI;
	private String userid;
	private Integer id;
	private String type;
	private String productcode;
	private Map<String, Object> request;
	 private MessageHelper messageHelper;

	 public void setProductServiceI(ProductServiceI productServiceI) {
		this.productServiceI = productServiceI;
	}
	 public MessageHelper getMessageHelper() {
		return messageHelper;
	}
	 public void setMessageHelper(MessageHelper messageHelper) {
		this.messageHelper = messageHelper;
	}
	 
	 //我的账号
	 public String my(){
		 
		 try {
			 Userb userb=userbServiceI.findUserb(userid);
			MyUser myUser=new MyUser();
			myUser.setUserid(userb.getUserid());
			myUser.setStatus(userb.getStatus());
			myUser.setRenewaltime(userb.getRenewaltime());
			myUser.setGold(userb.getGold());
			 
			 List<Uprelation> uprelations=uprelationServiceI.findUprelation(userid);
			
		if(uprelations.size()>0){
			Uprelation uprelation=uprelations.get(0);
			 //判断使用剩余天数
			int day=DateTimeUtil.getIntervalDays(DateTimeUtil.parseDatetime(DateTimeUtil.currentDatetime()),DateTimeUtil.parseDatetime(uprelation.getMaturities()));

			//int day=DateTimeUtil.getIntervalDays(DateTimeUtil.parseDatetime(uprelation.getRenewaltime()),DateTimeUtil.parseDatetime(uprelation.getMaturities()));
			 //险种
			String xianzhong="";
			String gS="";
			for(Uprelation ss:uprelations){
				//code+=ss.getProductcode()+",";
				if(ss.getProductcode().equals(Define.ALL_PRODUCT)){
					xianzhong="全部产品";
					gS="中国平安";
				}
				else{
				Product	product	=productServiceI.findProduct(ss.getProductcode());
				xianzhong+=product.getProductname()+",";
				gS=product.getType();
				}
				}
			if(day>0){
				myUser.setDay(day);
			}
			else{
				myUser.setDay(0);
			}
			
			myUser.setXianzhong(xianzhong);
			myUser.setXianzhonggs(gS);
			}
		
			 MessageHelper mh = new MessageHelper();
 			 mh.setResult(Define.S);
 			 mh.setEntity(myUser);
 			 setMessageHelper(mh);
		} catch (Exception e) {
			MessageHelper mh = new MessageHelper();
		 	mh.setResult(Define.F);
		 	mh.setMessage(Define.F_MESSAGE);
			setMessageHelper(mh);
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		 
		 return "OK";
	 }
	 
	 
 public String myUser(){
		 
		 try {
			 Userb userb=userbServiceI.findUserb(userid);
			MyUser myUser=new MyUser();
			myUser.setUserid(userb.getUserid());
			myUser.setStatus(userb.getStatus());
			myUser.setRenewaltime(userb.getRenewaltime());
			myUser.setGold(userb.getGold());
			 
			 List<Uprelation> uprelations=uprelationServiceI.findUprelation(userid);
			
		if(uprelations.size()>0){
			Uprelation uprelation=uprelations.get(0);
			 //判断使用剩余天数
			int day=DateTimeUtil.getIntervalDays(DateTimeUtil.parseDatetime(DateTimeUtil.currentDatetime()),DateTimeUtil.parseDatetime(uprelation.getMaturities()));
			 //int day=DateTimeUtil.getIntervalDays(DateTimeUtil.parseDatetime(uprelation.getRenewaltime()),DateTimeUtil.parseDatetime(uprelation.getMaturities()));
			 //险种
			String xianzhong="";
			String gS="";
			for(Uprelation ss:uprelations){
				//code+=ss.getProductcode()+",";
				if(ss.getProductcode().equals(Define.ALL_PRODUCT)){
					xianzhong="全部产品";
					gS="中国平安";
				}
				else{
				Product	product	=productServiceI.findProduct(ss.getProductcode());
				xianzhong+=product.getProductname()+",";
				gS=product.getType();
				}
				}
			if(day>0){
				myUser.setDay(day);
			}
			else{
				myUser.setDay(0);
			}
			
			myUser.setXianzhong(xianzhong);
			myUser.setXianzhonggs(gS);
			}
			request.put("myUser", myUser);
			
		} catch (Exception e) {
		
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		 
		 return "OK";
	 }
	 
	 
	 
	 
	 //客户选择产品的确定 不是业务员
	public String customSelect(){
		try {
			if (type.equals(Define.CUSTOM_TYPE)) {
			String[] ss=productcode.split(",");
	 		for(String productcode:ss){
	 		List<Uprelation> uprelations=uprelationServiceI.findUp(userid, productcode);
	 	//	System.out.println(uprelations.size());
	 		
	 			if (uprelations.size()>0) {
	 				Uprelation uprelation=uprelations.get(0);
	 				if (!uprelation.getStatus().equals(Define.RELATION_STRUTS_Y)) {
						uprelation.setMaturities(DateTimeUtil.formatDatetime(DateTimeUtil.getDaoQiTime(1)));
						uprelation.setStatus(Define.RELATION_STRUTS_Y);
						uprelationServiceI.saveOrUpdate(uprelation);
					}
	 				else {
						String  time=uprelation.getMaturities();
						uprelation.setMaturities(DateTimeUtil.formatDatetime(DateTimeUtil.aa(time, 1)));
						uprelationServiceI.saveOrUpdate(uprelation);
					}
	 				
				}
	 			else {
	 				Uprelation uprelation=new Uprelation();
	 				uprelation.setStatus(Define.RELATION_STRUTS_Y);
	 				uprelation.setUserid(userid);
	 				uprelation.setRenewaltime(DateTimeUtil.currentDatetime());
	 				uprelation.setMaturities(DateTimeUtil.formatDatetime(DateTimeUtil.getDaoQiTime(1)));
	 				uprelation.setProductcode(productcode);
		 			uprelationServiceI.save(uprelation);
				}
	 		}
	 			if (id!=null) {
	 			Payinformation payinformation=payinformationServiceI.get(id);
		 		payinformation.setProductcode(productcode);
		 		payinformationServiceI.saveOrUpdate(payinformation);
	 			}
	 			
			}
			
			else{
				List<Uprelation> uprelations= uprelationServiceI.findUprelation(userid);
				int qixiang=1;
			 	Payinformation payinformation=null;
				if (id!=null) {
					 payinformation=payinformationServiceI.get(id);
			 		payinformation.setProductcode(Define.ALL_PRODUCT);
			 		payinformationServiceI.saveOrUpdate(payinformation);
					String 	time=payinformation.getProductgroup();
					if (time.equals(Define.PAY_TYPE_ONE)) {
						qixiang=1;
					}
					if (time.equals(Define.PAY_TYPE_TWO)) {
						qixiang=2;
					}
				}
				else {
					 Userb userb=userbServiceI.findUserb(userid);
					String ac=userb.getActicode().substring(0, 1);
	 				if (ac.equals("2")) {
	 				qixiang=2;
	 				}
				}
				if (uprelations.size()>0) {
					Uprelation uprelation=uprelations.get(0);
					if (!uprelation.getStatus().equals(Define.RELATION_STRUTS_Y)) {
						uprelation.setMaturities(DateTimeUtil.formatDatetime(DateTimeUtil.getDaoQiTime(qixiang)));
						uprelation.setStatus(Define.RELATION_STRUTS_Y);
						uprelationServiceI.saveOrUpdate(uprelation);			
					}
					else{
						
						String  shij=uprelation.getMaturities();
						uprelation.setMaturities(DateTimeUtil.formatDatetime(DateTimeUtil.aa(shij, qixiang)));
						uprelationServiceI.saveOrUpdate(uprelation);
			
					}
				
				}
			
				if(uprelations.size()<=0){
				
				Uprelation uprelation=new Uprelation();
				uprelation.setStatus(Define.RELATION_STRUTS_Y);
				uprelation.setUserid(userid);
				uprelation.setRenewaltime(DateTimeUtil.currentDatetime());
				uprelation.setMaturities(DateTimeUtil.formatDatetime(DateTimeUtil.getDaoQiTime(qixiang)));
				uprelation.setProductcode(Define.ALL_PRODUCT);
				uprelationServiceI.save(uprelation);
				}
			
			
			}
			
			MessageHelper mh = new MessageHelper();
		 	mh.setResult(Define.S);
			setMessageHelper(mh);
			
			
		} catch (Exception e) {
		
			MessageHelper mh = new MessageHelper();
		 	mh.setResult(Define.F);
		 	mh.setMessage(Define.F_MESSAGE);
			setMessageHelper(mh);
			log.error(Define.F_MESSAGE+e.getMessage());
		}
	
		return "OK";
	}
	
	
	public String baoXianProduct(){
		try {
			Userb userb=userbServiceI.findUserb(userid);
			List<Uprelation>uprelation=uprelationServiceI.findUprelation(userid);
			String type=userb.getType();
			String status=userb.getStatus();
			
			if(uprelation.size()>0){
			if(type.equals(Define.USER_TYPE)&&status.equals(Define.STRUTS_JIHUO)){
				if(uprelation.get(0).getStatus().equals(Define.RELATION_STRUTS_Y))
				{	boolean x=	DateTimeUtil.isBefore(DateTimeUtil.parseDatetime(DateTimeUtil.currentDatetime()), DateTimeUtil.parseDatetime(uprelation.get(0).getMaturities()));
				if (x) {
					MessageHelper mh = new MessageHelper();
					Entity entity=new Entity();
				 	entity.setType(Define.USER_TYPE);
				 	entity.setMessage(Define.ALL_PRODUCT);
				 	mh.setEntity(entity);
				 	mh.setResult(Define.S);
					setMessageHelper(mh);	
					}
				else{
					MessageHelper mh = new MessageHelper();
					Entity entity=new Entity();
				 	entity.setType(Define.USER_TYPE);
				 	entity.setMessage("");
				 	mh.setEntity(entity);
				 	mh.setResult(Define.S);
					setMessageHelper(mh);
					}
				}else{
					MessageHelper mh = new MessageHelper();
					Entity entity=new Entity();
				 	entity.setType(Define.USER_TYPE);
				 	entity.setMessage("");
				 	mh.setEntity(entity);
				 	mh.setResult(Define.S);
					setMessageHelper(mh);
				}
				
			}
			else if(type.equals(Define.CUSTOM_TYPE)&&status.equals(Define.STRUTS_JIHUO))
			{		
				String productcodes="";
				for (Uprelation s:uprelation) {
					boolean x=	DateTimeUtil.isBefore(DateTimeUtil.parseDatetime(DateTimeUtil.currentDatetime()), DateTimeUtil.parseDatetime(s.getMaturities()));		
					if (x&&s.getStatus().equals(Define.RELATION_STRUTS_Y)) {
						productcodes+=s.getProductcode()+",";
					}
				}
				
				
				//先要判断时间是否到期   				
				//List<String> product=uprelationServiceI.findProductCode(userid);
				
				MessageHelper mh = new MessageHelper();
				Entity entity=new Entity();
			 	entity.setType(Define.CUSTOM_TYPE);
			 	entity.setMessage(productcodes);
			 	//entity.setMessage(product.toString());
			 	mh.setEntity(entity);
			 	mh.setResult(Define.S);
				setMessageHelper(mh);	
			}
			else{
				MessageHelper mh = new MessageHelper();
				mh.setResult(Define.F);
				mh.setMessage(Define.F_MESSAGE);
				setMessageHelper(mh);	
				}
		}else{
		MessageHelper mh = new MessageHelper();
		Entity entity=new Entity();
	 	entity.setType(type);
	 	entity.setMessage("");
	 	mh.setEntity(entity);
	 	mh.setResult(Define.S);
		setMessageHelper(mh);
		}
		} catch (Exception e) {
			MessageHelper mh = new MessageHelper();
			mh.setResult(Define.F);
			mh.setMessage(Define.F_MESSAGE);
			setMessageHelper(mh);
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		return  "OK";
	}
	
	//IOS
	public String baoXianProductIOS(){
		try {
			MessageHelper mh = new MessageHelper();
			List<Flag> lFlags=flagService.loadAll();
				Flag flags=lFlags.get(0);
				if (flags.getFlag().equals("false")) {
					mh.setResult("1");
					setMessageHelper(mh);
					return  "OK";
				}
				if(userid==null){
					mh.setResult("6");
					setMessageHelper(mh);
					return  "OK";
				}
				Userb userb=userbServiceI.findUserb(userid);
				String jihuoma=userb.getActicode();
				if (jihuoma!=null) {
				List<Activation> activations=activationServiceI.findbyaccode(jihuoma, userid);
				Activation activation= activations.get(0);
				String equid=activation.getEquipmentId();
				if (!equid.equals(equipmentId)) {
					mh.setResult("3");
					mh.setMessage("设备不同");
					setMessageHelper(mh);
					return  "OK";
				}
				
				}
				
				
			if (userb.getStatus().equals(Define.STRUTS_WEIJIHUO)) {
				mh.setResult("2");
				mh.setMessage("未激活,是否现在激活");
				setMessageHelper(mh);
				return  "OK";
			}
			List<Uprelation>uprelation=uprelationServiceI.findUprelation(userid);
			String type=userb.getType();
			String status=userb.getStatus();
			
			if(uprelation.size()>0){
				if(uprelation.get(0).getStatus().equals(Define.RELATION_STRUTS_Y)){	
				 boolean x=	DateTimeUtil.isBefore(DateTimeUtil.parseDatetime(DateTimeUtil.currentDatetime()), DateTimeUtil.parseDatetime(uprelation.get(0).getMaturities()));
				if (x) {
					mh.setResult("4");
					mh.setMessage("可用");
					setMessageHelper(mh);
					return  "OK";
					}
				else{
					mh.setResult("5");
					mh.setMessage("激活已到期,是否现在激活");
					setMessageHelper(mh);
					return  "OK";
					}
				}else{
					mh.setResult("5");
					mh.setMessage("激活已到期,是否现在激活");
					setMessageHelper(mh);
					return  "OK";
				}
				
			}
		else{
			mh.setResult("5");
			mh.setMessage("激活已到期,是否现在激活");
			setMessageHelper(mh);
			return  "OK";
			}
	} catch (Exception e) {
			MessageHelper mh = new MessageHelper();
			mh.setResult(Define.F);
			mh.setMessage(Define.F_MESSAGE);
			setMessageHelper(mh);
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		return  "OK";
	}
	
	
	
	
	

	public void setId(Integer id) {
		this.id = id;
	}
	private FlagService flagService;
	public void setFlagService(FlagService flagService) {
		this.flagService = flagService;
	}
	
	private ActivationServiceI activationServiceI;
	public void setActivationServiceI(ActivationServiceI activationServiceI) {
		this.activationServiceI = activationServiceI;
	}
public void setPayinformationServiceI(
		PayinformationServiceI payinformationServiceI) {
	this.payinformationServiceI = payinformationServiceI;
}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public void setUserbServiceI(UserbServiceI userbServiceI) {
		this.userbServiceI = userbServiceI;
	}
	
	public void setUprelationServiceI(UprelationServiceI uprelationServiceI) {
		this.uprelationServiceI = uprelationServiceI;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String equipmentId;
	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}
	@Override
	public void setRequest(Map arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
	}

}
