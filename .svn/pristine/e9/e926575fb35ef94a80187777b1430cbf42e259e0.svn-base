package com.hengshuo.baibx.action.pay;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.RequestAware;

import com.hengshuo.baibx.action.BaseAction;

import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.common.util.Arithmetic4Double;
import com.hengshuo.baibx.common.util.DateTimeUtil;
import com.hengshuo.baibx.common.util.DateUtils;
import com.hengshuo.baibx.common.util.Define;
import com.hengshuo.baibx.common.util.ExceptionUtil;
import com.hengshuo.baibx.common.util.MessageHelper;
import com.hengshuo.baibx.model.Activation;
import com.hengshuo.baibx.model.Payinformation;
import com.hengshuo.baibx.model.Userb;
import com.hengshuo.baibx.service.impl.activation.ActivationServiceI;
import com.hengshuo.baibx.service.impl.pay.PayinformationServiceI;
import com.hengshuo.baibx.service.impl.userb.UserbServiceI;
import com.hengshuo.baibx.service.jiekou.MessageService;

public class PayinformationAction extends BaseAction implements RequestAware {
	private static Logger log = Logger.getLogger(PayinformationAction.class.getName());
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String userid;
	private String type;
	private String productcode;
	private String productgroup;
	private String payment;
	private Integer gold;
	private String phone;
	private Double price;
	private String status;
	private ActivationServiceI activationServiceI;
	public void setActivationServiceI(ActivationServiceI activationServiceI) {
		this.activationServiceI = activationServiceI;
	}
	private PayinformationServiceI payinformationServiceI;
	private UserbServiceI userbServiceI;
	private MessageHelper messageHelper;
	public MessageHelper getMessageHelper() {
		return messageHelper;
	}
	public void setMessageHelper(MessageHelper messageHelper) {
		this.messageHelper = messageHelper;
	}
	
	
	/**
	 * 支付成功
	 * @return
	 */
	public String paySuccessAll(){
		try {
			Payinformation payinformation=new Payinformation();
			payinformation.setGold(gold);
			payinformation.setUserid(userid);
			payinformation.setPhone(userid);
			//payinformation.setProductcode(Define.ALL_PRODUCT);
			String time=DateTimeUtil.currentDatetime();
			payinformation.setPaytime(time);
			if (type.equals("1")) {
				productgroup=Define.PAY_TYPE_ONE;
				price=260.00;
			}
			if (type.equals("2")) {
				productgroup=Define.PAY_TYPE_TWO;
				price=480.00;
			}
			//payinformation.setProductgroup(productgroup);
			 if(gold!=null){
					Userb userb=userbServiceI.findUserb(userid);
					Integer goldd=userb.getGold();
					userb.setGold(goldd-gold);
					userbServiceI.saveOrUpdate(userb);
					
				Double go=Double.valueOf(String.valueOf(gold));
				Double golds=Arithmetic4Double.div(go, 100, 2);
				Double pDouble=Arithmetic4Double.sub(price, golds);
				payinformation.setPrice(pDouble);
			}else {
				payinformation.setPrice(price);
			}
			 payinformation.setProductgroup(productgroup);
			 payinformation.setStatus(Define.PAY_STRUTS_Y);
		
			 payinformationServiceI.save(payinformation);
			
			 MessageService messageService=new MessageService();
	 			//得到激活码
				String code=messageService.registerACCode(userid);
				
				Activation activation=new Activation();
				activation.setAccode(code);
				activation.setFlag(Define.ACCODE_0);
				activation.setType(Define.AC_TYPE_G);
				activationServiceI.saveOrUpdate(activation);
			
				MessageHelper mHelper=new MessageHelper();
 				mHelper.setResult(Define.S);
 				setMessageHelper(mHelper);
			
		} catch (Exception e) {
			MessageHelper mHelper=new MessageHelper();
				mHelper.setResult(Define.F);
				setMessageHelper(mHelper);
		log.error(ExceptionUtil.getStackMsg(e));
		}
		return "OK";
	}
	
	
	
		public String payPage(){
			try {
				
				Userb userb=userbServiceI.findUserb(userid);
				request.put("userb", userb);
			} catch (Exception e) {
				log.error(Define.F_MESSAGE+e.getMessage());
			}
			return "OK";
		}
		
		public String orderProduct(){
			try {
				Payinformation payinformation=new Payinformation();
				if (gold!=null) {
					payinformation.setGold(gold);
				}
				payinformation.setProductgroup(productgroup);
				payinformation.setUserid(userid);
				payinformation.setPrice(price);
				payinformation.setPhone(phone);
				payinformation.setPayment(payment);
				payinformation.setStatus(Define.PAY_STRUTS_W);
				payinformation.setOrdertime(DateTimeUtil.currentDatetime());
				String time=payinformation.getOrdertime();
				payinformationServiceI.save(payinformation);
			
				Payinformation payinformation2=payinformationServiceI.findPayInfor(userid,time);
			
				request.put("payinformation", payinformation2);
				Userb userb=userbServiceI.findUserb(userid);
				request.put("userb", userb);
			} catch (Exception e) {
			
				log.error(Define.F_MESSAGE+e.getMessage());
			}
			return "OK";
		}
			//列表
			public String payList(){
				try {
				PageSupport<Payinformation> pageSupport=payinformationServiceI.getPage(getPageNo());
					request.put("pageSupport", pageSupport);
				} catch (Exception e) {
					log.error(Define.F_MESSAGE+e.getMessage());
				}
				return  "OK";
			}
			//险种支付成功
			public String paySuccess(){
				try {
					//支付宝返回结果
					if(1==1){
						MessageService messageService=new MessageService();
			 			//得到激活码
						String code=messageService.registerACCode(phone);
						
						Activation activation=new Activation();
						activation.setAccode(code);
						activation.setFlag(Define.ACCODE_0);
						activation.setType(Define.AC_TYPE_G);
						activationServiceI.saveOrUpdate(activation);
						
			 		
			 			//userb.setActicode(code);
			 			Payinformation payinformation=payinformationServiceI.get(id);
			 			if(payinformation.getGold()!=null){
			 			Userb userb=userbServiceI.findUserb(userid);
			 			int gold=payinformation.getGold();
			 			int ugold=userb.getGold();
			 			userb.setGold(ugold-gold);
			 			userbServiceI.saveOrUpdate(userb);
			 			}
			 			
			 			
			 			payinformation.setStatus(Define.PAY_STRUTS_Y);
			 			payinformation.setPaytime(DateTimeUtil.currentDatetime());
			 			payinformationServiceI.saveOrUpdate(payinformation);
			 			
			 				MessageHelper mHelper=new MessageHelper();
			 				mHelper.setResult(Define.S);
			 				mHelper.setMessage(id.toString());
			 				setMessageHelper(mHelper);
						}
					
					else {
		 				MessageHelper mHelper=new MessageHelper();
		 				mHelper.setResult(Define.F);
		 				mHelper.setMessage(Define.F_MESSAGE);
		 				setMessageHelper(mHelper);
						}
				} catch (Exception e) {
					MessageHelper mHelper=new MessageHelper();
	 				mHelper.setResult(Define.F);
	 				mHelper.setMessage(Define.F_MESSAGE);
	 				setMessageHelper(mHelper);
					log.error(Define.F_MESSAGE+e.getMessage());
				}
				return "OK";
			}
	
			//订单有误
			public String youwu(){
				try {
					payinformationServiceI.deleteByKey(id);
				} catch (Exception e) {
					log.error(Define.F_MESSAGE+e.getMessage());
				}
				return  "OK";
			}
	
	
	
	
	
	
	
	
	
	public void setPayinformationServiceI(
				PayinformationServiceI payinformationServiceI) {
			this.payinformationServiceI = payinformationServiceI;
		}











		public void setUserbServiceI(UserbServiceI userbServiceI) {
			this.userbServiceI = userbServiceI;
		}










public void setId(Integer id) {
	this.id = id;
}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	
	public void setProductgroup(String productgroup) {
		this.productgroup = productgroup;
	}
	
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	public void setGold(Integer gold) {
		this.gold = gold;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	private Map<String, Object> request;
	@Override
	public void setRequest(Map arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
	}
}
