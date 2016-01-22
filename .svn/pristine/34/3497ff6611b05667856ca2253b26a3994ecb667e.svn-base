package com.hengshuo.baibx.action.userb;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.type.TrueFalseType;
import org.jboss.util.MuBoolean;

import Decoder.BASE64Decoder;
import Decoder.BASE64Encoder;

import com.hengshuo.baibx.action.BaseAction;
import com.hengshuo.baibx.action.userproduct.UprelationAction;
import com.hengshuo.baibx.common.page.Base64;
import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.common.util.DateTimeUtil;
import com.hengshuo.baibx.common.util.DateUtils;
import com.hengshuo.baibx.common.util.Define;
import com.hengshuo.baibx.common.util.ExceptionUtil;
import com.hengshuo.baibx.common.util.MessageHelper;
import com.hengshuo.baibx.model.Activation;
import com.hengshuo.baibx.model.Admin;
import com.hengshuo.baibx.model.MyUser;
import com.hengshuo.baibx.model.Payinformation;
import com.hengshuo.baibx.model.Uprelation;
import com.hengshuo.baibx.model.UserMP;
import com.hengshuo.baibx.model.Userb;
import com.hengshuo.baibx.service.impl.activation.ActivationServiceI;
import com.hengshuo.baibx.service.impl.pay.PayinformationServiceI;
import com.hengshuo.baibx.service.impl.userb.UserbServiceI;
import com.hengshuo.baibx.service.impl.userproduct.UprelationServiceI;
import com.hengshuo.baibx.service.jiekou.MessageService;
import com.opensymphony.xwork2.ActionSupport;

public class UserbAction extends BaseAction implements RequestAware,SessionAware {

	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(UserbAction.class.getName());
	private List<File> honorphotos;
	private List<String> honorphotosFileName;
	private List<String> honorphotosContentType;
	private String verifycode;
	private String userids;
	public void setUserids(String userids) {
		this.userids = userids;
	}
	private String userid;
	private String password;
	private String Acticode;
	private Userb userb;
	private String type;
	private Integer id;
	private File heart;
	private String equipmentId;
	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}
	private String macaddress;
	public void setMacaddress(String macaddress) {
		this.macaddress = macaddress;
	}
	private String hearts;
	public void setHearts(String hearts) {
		this.hearts = hearts;
	}
	private String honorphotoss;
	public void setHonorphotoss(String honorphotoss) {
		this.honorphotoss = honorphotoss;
	}
	private String name;
	private String insurer;
	private String company;
	private String position;
	private String phone;
	private String employeenumber;
	private String address;
	  private String heartContentType;
	  private String heartFileName;
	  private String insurerperson;
	  public void setInsurerperson(String insurerperson) {
		this.insurerperson = insurerperson;
	}
	 
	 private UserbServiceI userbServiceI;
	 private UprelationServiceI uprelationServiceI;	
	 private ActivationServiceI activationServiceI;
	 public void setActivationServiceI(ActivationServiceI activationServiceI) {
		this.activationServiceI = activationServiceI;
	}
	 private String xpassword;
	 public void setXpassword(String xpassword) {
		this.xpassword = xpassword;
	}
	 //修改密码
	 public  String updateMiMa(){
		 try {
			 Userb userb=userbServiceI.findUserb(userid);
			 if (password.equals(userb.getPassword())) {
				 userb.setPassword(xpassword);
				 userbServiceI.saveOrUpdate(userb);
				 MessageHelper mh = new MessageHelper();
	 			 mh.setResult(Define.S);
	 			 setMessageHelper(mh);
				}else {
					MessageHelper mh = new MessageHelper();
					mh.setMessage("原密码错误");
		 			 mh.setResult("Y");
		 			 setMessageHelper(mh);
				}
			
		} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
			 MessageHelper mh = new MessageHelper();
 			 mh.setResult(Define.F);
 			 mh.setMessage(Define.F_MESSAGE);
 			 setMessageHelper(mh);
		}
 		return  "OK";
	 }
	 
	 //忘记密码
	 	public String  wangJiMiMa(){
	 		try {
	 			//Userb userb=userbServiceI.findUserb(userid);	
	 			List<Userb> userbs=	userbServiceI.findUserbRe(userid);
	 			MessageService messageService=new MessageService();
	 			String verifycode=messageService.wjiMiMa(userid);
	 			if (!verifycode.equals(Define.F)) {
	 				if (userbs.size()>0) {
	 					Userb userb=userbs.get(0);
	 					userb.setPassword(verifycode);
						userbServiceI.saveOrUpdate(userb);
						 MessageHelper mh = new MessageHelper();
			 			 mh.setResult(Define.S);
			 			 setMessageHelper(mh);
					}
	 				else {
	 					 MessageHelper mh = new MessageHelper();
	 					 mh.setResult(Define.F);
			 			 mh.setMessage("你输入的账号不存在");
			 			 setMessageHelper(mh);
					}
					
	 			}
	 			else{
	 				 MessageHelper mh = new MessageHelper();
		 			 mh.setResult(Define.F);
		 			 mh.setMessage(Define.F_MESSAGE);
		 			 setMessageHelper(mh);
	 				
	 			}
	 		} catch (Exception e) {
				log.error(Define.F_MESSAGE+e.getMessage());
			}
	 		return  "OK";
	 		
	 		
	 	}
	 
	 
	 
	 
	 
	 //获取验证码
	 	public String huoquyzm(){
	 		try {
	 		List<Userb> userbs=	userbServiceI.findUserbRe(userid);
	 			MessageService messageService=new MessageService();
	 			String verifycode=messageService.registerValidate(userid);
	 			if(verifycode.equals(Define.F))
	 			{
					 MessageHelper mh = new MessageHelper();
		 			 mh.setResult(Define.F);
		 			 mh.setMessage(Define.F_MESSAGE);
		 			 setMessageHelper(mh);
	 			}
	 		else {
	 			//Userb userb=userbServiceI.findUserb(userid);
	 			if (userbs.size()>0) {
	 				Userb userb=userbs.get(0);
	 				userb.setVerifycode(verifycode);
	 				userbServiceI.saveOrUpdate(userb);	
	 			}
	 		else {
	 			//Userb userb=userbServiceI.findUserb(userid);
	 			Userb userb=new Userb();
	 			userb.setUserid(userid);
	 			userb.setVerifycode(verifycode);
	 			
	 			userbServiceI.save(userb);
	 			}
	 			MessageHelper mh = new MessageHelper();
	 			 mh.setResult(Define.S);
	 			 setMessageHelper(mh);
	 		}
	 			} catch (Exception e) {
	 				 MessageHelper mh = new MessageHelper();
		 			 mh.setResult(Define.F);
		 			 mh.setMessage(Define.F_MESSAGE);
		 			 setMessageHelper(mh);
			}
	 		
	 		return "OK";
	 	}
	 	
	 	
		//设置保险代理人
	 	public String sZDaiLiRen(){
	 		
	 		try {
	 			Userb userb=userbServiceI.findUserb(userid);
	 				userb.setInsurerperson(insurerperson);
	 					userbServiceI.saveOrUpdate(userb);
	 		
	 			MessageHelper mh = new MessageHelper();
				mh.setResult(Define.S);
				
				setMessageHelper(mh);
	 		
	 		
	 			
			} catch (Exception e) {
				log.error(Define.F_MESSAGE+e.getMessage());
				MessageHelper mh = new MessageHelper();
				mh.setResult(Define.F);
				mh.setMessage(Define.F_MESSAGE);
				setMessageHelper(mh);
			}
	 		return "OK";
	 	}
	 
	 	//查找保险代理人
	 	public String daiLiRen(){
	 		
	 		try {
	 		List<Userb>userbs=userbServiceI.findUserbRe(insurerperson);
	 		//	Userb userb=userbServiceI.findUserb(userid);
	 			if (userbs.size()>0) {
	 			Userb userb=userbs.get(0);
	 			MessageHelper mh = new MessageHelper();
				mh.setResult(Define.S);
				mh.setEntity(userb);
				setMessageHelper(mh);
	 			}
	 			else {
	 				MessageHelper mh = new MessageHelper();
					mh.setResult(Define.F);
					mh.setMessage("你查找的用户不存在");
					setMessageHelper(mh);
				}
	 			
			} catch (Exception e) {
				log.error(Define.F_MESSAGE+e.getMessage());
				MessageHelper mh = new MessageHelper();
				mh.setResult(Define.F);
				mh.setMessage(Define.F_MESSAGE);
				setMessageHelper(mh);
			}
	 		return "OK";
	 	}
	 	
	 	//激活IOS
	 	public String jiHuoIOS(){
	 		try {
	 			Userb userb=userbServiceI.findUserb(userid);
	 			List<Activation> activations=activationServiceI.findActivation(Acticode);
	 			if (activations.size()>0) {
	 				Activation activation=activations.get(0);
	 				String jihuom=activation.getAccode();
	 				if(Acticode.equals(jihuom)){
	 					userb.setActicode(Acticode);
			 			userb.setStatus(Define.STRUTS_JIHUO);
			 			userb.setRenewaltime(DateTimeUtil.currentDatetime());
			 			userbServiceI.update(userb);
			 			activation.setUserid(userid);
			 			//绑定
			 			activation.setEquipmentId(equipmentId);
			 			activation.setFlag(Define.ACCODE_1);
			 			activationServiceI.saveOrUpdate(activation);
			 					
			 			int qixiang=1;
			 			String ac=Acticode.substring(0, 1);
			 			if (ac.equals("2")) {
			 				qixiang=2;
						}

						List<Uprelation> uprelations= uprelationServiceI.findUprelation(userid);
						
						/*Payinformation payinformation=null;*/
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
				
					MessageHelper mh = new MessageHelper();
					mh.setResult(Define.S);
					mh.setMessage("激活成功");
					setMessageHelper(mh);
	 				
	 				}
	 		}
	 		else {
	 				MessageHelper mh = new MessageHelper();
					mh.setResult(Define.F);
					mh.setMessage("激活码不对");
					setMessageHelper(mh);		
				}
			} catch (Exception e) {
				MessageHelper mh = new MessageHelper();
				mh.setResult(Define.F);
				mh.setMessage(Define.F_MESSAGE);
				setMessageHelper(mh);
			}
	 		return "OK";
	 	}
	 	
	 //激活
	 	public String jiHuo(){
	 		try {
	 			Userb userb=userbServiceI.findUserb(userid);
	 			List<Activation> activations=activationServiceI.findActivation(Acticode);
	 			if (activations.size()>0) {
	 				Activation activation=activations.get(0);
	 				String jihuom=activation.getAccode();
	 				if(Acticode.equals(jihuom)){
	 					userb.setActicode(Acticode);
			 			userb.setStatus(Define.STRUTS_JIHUO);
			 			userb.setRenewaltime(DateTimeUtil.currentDatetime());
			 			userbServiceI.update(userb);
			 		PageSupport<Payinformation> pageSupport= payinformationServiceI.getlist(userid);
			 			MessageHelper mh = new MessageHelper();
			 			List<Payinformation> list=pageSupport.result;
			 			List<Payinformation> plist=new ArrayList<Payinformation>();
			 			for (int i = 0; i < list.size(); i++) {
			 				if(list.get(i).getProductcode()==null){
			 					plist.add(list.get(i));
			 					
			 				}
						}
			 			activation.setUserid(userid);
			 			//绑定
			 		activation.setEquipmentId(equipmentId);
			 			activation.setMacaddress(macaddress);
			 			activation.setFlag(Define.ACCODE_1);
			 			activationServiceI.saveOrUpdate(activation);
			 			mh.setList(plist);
						mh.setResult(Define.S);
						setMessageHelper(mh);
						
			 		}else{
			 			MessageHelper mh = new MessageHelper();
						mh.setResult(Define.F);
						mh.setMessage("激活码不对");
						setMessageHelper(mh);	
			 			}
				}
	 			else {
	 				MessageHelper mh = new MessageHelper();
					mh.setResult(Define.F);
					mh.setMessage("激活码不对");
					setMessageHelper(mh);		
				}
				//String jihuom=userb.getActicode();
		 		
			} catch (Exception e) {
				MessageHelper mh = new MessageHelper();
				mh.setResult(Define.F);
				mh.setMessage("激活失败");
				setMessageHelper(mh);	
				log.error("激活失败"+e.getMessage());
			}
	 		return  "OK";
	 	}
	 
	 	//我的名片
	 	public String mingPian(){
	 		try {
	 			
	 			Userb userb=userbServiceI.findUserb(userid);
				request.put("userb", userb);	
	 			} catch (Exception e) {
				log.error(Define.F_MESSAGE+e.getMessage());
			}
	 		return  "OK";
	 	}
	 
	 	//用户退出
	 	public String exit(){
	 		try {
	 			ServletActionContext.getRequest().getSession().invalidate();
			} catch (Exception e) {
				// TODO: handle exception
			}
	 		return "OK";
	 	}
	 	
	 	//用户登入
		public String userLogin(){
			try {
				Userb userb=userbServiceI.findUserb(userid);
				List<Uprelation>uprelation=uprelationServiceI.findUprelation(userid);
				for (Uprelation s:uprelation) {
					boolean x=	DateTimeUtil.isBefore(DateTimeUtil.parseDatetime(DateTimeUtil.currentDatetime()), DateTimeUtil.parseDatetime(s.getMaturities()));
					if (!x) {
						
						s.setStatus(Define.RELATION_STRUTS_D);
						userb.setStatus(Define.STRUTS_WEIJIHUO);
						userbServiceI.saveOrUpdate(userb);
						uprelationServiceI.saveOrUpdate(s);
					}
				}
				
			
				String pasString=userb.getPassword();
			if(pasString.equals(password)){
				session.put("userl", userb);
				return "OK";
				}
			else{
				request.put("pass", "密码错误");
				return "error";
				}
			} catch (Exception e) {
				request.put("error", "账号不存在");
				
				return "error";
			}	
		}
	 	
	 	
	 	
	 	
		//移动端登入
	 	public String jsonLogin(){
			try {
				Userb userb=userbServiceI.findUserb(userid);
			List<Uprelation>uprelation=uprelationServiceI.findUprelation(userid);
			for (Uprelation s:uprelation) {
				boolean x=	DateTimeUtil.isBefore(DateTimeUtil.parseDatetime(DateTimeUtil.currentDatetime()), DateTimeUtil.parseDatetime(s.getMaturities()));
				if (!x) {
					
					s.setStatus(Define.RELATION_STRUTS_D);
					userb.setStatus(Define.STRUTS_WEIJIHUO);
					userbServiceI.saveOrUpdate(userb);
					uprelationServiceI.saveOrUpdate(s);
				}
			}
			
			String pasString=userb.getPassword();
				String jihuoma=userb.getActicode();
				log.debug("equipmentId----"+jihuoma);
		if (jihuoma!=null) {
				List<Activation> activations=activationServiceI.findbyaccode(jihuoma, userid);
				
				Activation activation= activations.get(0);
				String equid=activation.getEquipmentId();
				log.debug("equid----"+equid);
				log.debug("equipmentId----"+equipmentId);
			/*	String mac=activation.getMacaddress();*/
				
				/*if (!type.equals("IOS")){*/
				if(!"IOS".equals(type)){
					if (equid.equals(equipmentId)){
						if(pasString.equals(password)){
						MessageHelper mh = new MessageHelper();
						mh.setResult(Define.S);
						mh.setEntity(userb);
						setMessageHelper(mh);
						}
					else{
						MessageHelper mh = new MessageHelper();
						mh.setResult(Define.F);
						mh.setMessage("密码错误");
						setMessageHelper(mh);
						}
					}
				else {
					MessageHelper mh = new MessageHelper();
					mh.setResult(Define.F);
					mh.setMessage("此手机不是你绑定的手机");
					setMessageHelper(mh);
					}
				
				}
				else {
					if(pasString.equals(password)){
						MessageHelper mh = new MessageHelper();
						mh.setResult(Define.S);
						mh.setEntity(userb);
						setMessageHelper(mh);
						}
					else{
						MessageHelper mh = new MessageHelper();
						mh.setResult(Define.F);
						mh.setMessage("密码错误");
						setMessageHelper(mh);
						}
				}
			}
			else{
				if(pasString.equals(password)){
					MessageHelper mh = new MessageHelper();
					mh.setResult(Define.S);
					mh.setEntity(userb);
					setMessageHelper(mh);
					}
				else{			
					MessageHelper mh = new MessageHelper();
					mh.setResult(Define.F);
					mh.setMessage("密码错误");
					setMessageHelper(mh);
					}
				
			}
			
			/*if(pasString.equals(password)){
				Userb userb2=userbServiceI.findUserb(userid);
				MessageHelper mh = new MessageHelper();
				mh.setResult(Define.S);
				mh.setEntity(userb2);
				setMessageHelper(mh);
				}
			else{			
				MessageHelper mh = new MessageHelper();
				mh.setResult(Define.F);
				mh.setMessage("密码错误");
				setMessageHelper(mh);
				}*/
			
			
			} catch (Exception e) {
				
				MessageHelper mh = new MessageHelper();
				mh.setResult(Define.F);
				mh.setMessage("账号不存在");
				setMessageHelper(mh);
				log.error("账号不存在"+e.getMessage());
			}
			return "OK";
		}
		
	 	//注册
		 public String register(){
			 try {
				 //List<Userb> user=	userbServiceI.findUserbRe(userid);
				 Userb userb=userbServiceI.findUserb(userid);
				 if (userb.getStatus()==null) {
					 if(verifycode.equals(userb.getVerifycode())==false)
					 {
						MessageHelper mh = new MessageHelper();
						mh.setResult(Define.F);
						mh.setMessage("验证码错误");
						setMessageHelper(mh);
					}
					 else {
							 userb.setRegtime(DateTimeUtil.currentDatetime());
							 userb.setType(type);
							 userb.setGold(0);
							 userb.setStatus(Define.STRUTS_JIHUO);
							 userb.setPassword(password);
							 userbServiceI.saveOrUpdate(userb);
							
							 // 认证获取三天免费 
						 List<Uprelation> uprelations= uprelationServiceI.findUprelation(userid);
								if (uprelations.size()>0) {
								}
								else{
									Uprelation uprelation=new Uprelation();
										uprelation.setStatus(Define.RELATION_STRUTS_Y);
										uprelation.setUserid(userid);
										uprelation.setRenewaltime(DateTimeUtil.currentDatetime());
										uprelation.setMaturities(DateTimeUtil.formatDatetime(DateTimeUtil.getDaoQiTimeDay(3)));
										uprelation.setProductcode(Define.ALL_PRODUCT);
										uprelationServiceI.save(uprelation);
								}
								
							 MessageHelper mh = new MessageHelper();
							mh.setResult(Define.S);
							setMessageHelper(mh);
						}
				}else {
					MessageHelper mh = new MessageHelper();
					mh.setResult(Define.F);
					mh.setMessage("用户已被注册");
					setMessageHelper(mh);					
				}
				 
				 
			} catch (Exception e) {
				MessageHelper mh = new MessageHelper();
				mh.setResult(Define.F);
				mh.setMessage(Define.F_MESSAGE);
				setMessageHelper(mh);
				log.error(Define.F_MESSAGE+e.getMessage());
			}
			
			  return "OK";
		 }
		 
		//进入到认证页面
		 public String renZhenPage(){
			 try {
				 Userb userb=userbServiceI.findUserb(userid);
				 request.put("userb", userb);
			} catch (Exception e) {
				log.error(Define.F_MESSAGE+e.getMessage());
			}
				
			 return "OK";
		 }
		 
		 
		 //移动端名片编辑
		 public String bianJiMingP(){
			 
			 try {
				 Userb userb=userbServiceI.findUserb(userid);
				 UserMP userMP=new UserMP();
				 userMP.setUserid(userb.getUserid());
				 userMP.setPhone(userb.getPhone());
				 userMP.setHeart(userb.getHeart());
				 userMP.setName(userb.getName());
				 userMP.setAddress(userb.getAddress());
				 userMP.setCompany(userb.getCompany());
				 userMP.setPosition(userb.getPosition());
				 userMP.setEmployeenumber(userb.getEmployeenumber());
				 userMP.setInsurer(userb.getInsurer());
				 userMP.setHonorphotos(userb.getHonorphotos());
				
				 MessageHelper mh = new MessageHelper();
					mh.setResult(Define.S);
					mh.setEntity(userMP);
					setMessageHelper(mh); 
			} catch (Exception e) {
				log.error(ExceptionUtil.getStackMsg(e));
			}
			 	return  "OK";
		 }
		 
		 
		 //认证
		 public String renZ(){
			 Base64 base64=new Base64();
			 Userb userb=null;
		
			 
			 
			 log.debug("jinlail-----------------");
			 String root = ServletActionContext.getServletContext().getRealPath(Define.IMAGES_USERB);
			 try {
				 log.debug("userid--"+userid);
			 userb=	userbServiceI.findUserb(userid);
				userb.setStatus(Define.STRUTS_JIHUO);
				log.debug("name--"+name);
				log.debug("insurer--"+insurer);
				log.debug("phone--"+phone);
				log.debug("company--"+company);
				log.debug("position--"+position);
				log.debug("employeenumber--"+employeenumber);
				log.debug("address--"+address);
				/*log.debug("hearts--"+hearts);
				log.debug("honorphotoss--"+honorphotoss);*/
				if (!name.equals("")) {
					userb.setName(name);
				}
				if (!insurer.equals("")) {
				userb.setInsurer(insurer);
				}
				if (!phone.equals("")) {
				userb.setPhone(phone);
				}
				if (!company.equals("")) {
				userb.setCompany(company);
				}
				if (!position.equals("")) {
				userb.setPosition(position);
				}
				if (!employeenumber.equals("")) {
				userb.setEmployeenumber(employeenumber);
				}
				if (!address.equals("")) {
			    userb.setAddress(address);
			    }
				log.debug("222222222222222222--");
				userb.setRenewaltime(DateTimeUtil.currentDatetime());
				
				if(!hearts.equals("")){
					base64.GenerateImage( hearts, root + "/" +userid+ "heart.jpg");
				 	String 	url=Define.IMAGES_USERB+"/"+userid+"heart.jpg";
					userb.setHeart(url);
				 }	log.debug("333333333333--");
				 if(!honorphotoss.equals("")){    
					String[] ss=honorphotoss.split("\\|");
						
					String urlx=userb.getHonorphotos();
					
					for(int i = 0 ; i < ss.length ; i++ ){
					base64.GenerateImage(ss[i].substring(1), root + "/" +userid+"honorphotos"+ss[i].substring(0,1)+ ".jpg");
					
					if(urlx!=null){
						if (!urlx.contains(ss[i].substring(0,1)+ ".jpg")){
						urlx+=Define.IMAGES_USERB+"/"+userid+"honorphotos"+ss[i].substring(0,1)+".jpg"+"|";
							
							}
						}
					else{
						urlx=Define.IMAGES_USERB+"/"+userid+"honorphotos"+ss[i].substring(0,1)+".jpg"+"|";
						
						}
					}
					userb.setHonorphotos(urlx); 
					}
				 log.debug("4444444444--");
				  userbServiceI.update(userb);
				
				  //认证 获取三天的免费激活产品 移到注册那里去
				/*List<Uprelation> uprelations= uprelationServiceI.findUprelation(userid);
				
				if (uprelations.size()>0) {
						
					}
				else{
					Uprelation uprelation=new Uprelation();
						uprelation.setStatus(Define.RELATION_STRUTS_Y);
						uprelation.setUserid(userid);
						uprelation.setRenewaltime(DateTimeUtil.currentDatetime());
						uprelation.setMaturities(DateTimeUtil.formatDatetime(DateTimeUtil.getDaoQiTimeDay(3)));
						uprelation.setProductcode(Define.ALL_PRODUCT);
						uprelationServiceI.save(uprelation);
						
				}*/
					
				  MessageHelper mh = new MessageHelper();
					mh.setResult(Define.S);
					setMessageHelper(mh);
				} 
			 catch (Exception e){
				  MessageHelper mh = new MessageHelper();
					mh.setResult(Define.F);
					mh.setMessage(Define.F_MESSAGE);
					setMessageHelper(mh);
					log.error(ExceptionUtil.getStackMsg(e));
				  } 
		
				   
				     return "OK";
		 			}
		 
		 
		 public String renZIOS(){
			 Base64 base64=new Base64();
			 Userb userb=null;
		
			 
			 
			 log.debug("jinlail-----------------");
			 String root = ServletActionContext.getServletContext().getRealPath(Define.IMAGES_USERB);
			 log.debug("root--"+root);
			 log.debug("rootss--"+root +"/"+userid+"heart.jpg");
			 try {
				 log.debug("userid--"+userid);
			 userb=	userbServiceI.findUserb(userid);
				userb.setStatus(Define.STRUTS_JIHUO);
				log.debug("name--"+name);
				log.debug("insurer--"+insurer);
				log.debug("phone--"+phone);
				log.debug("company--"+company);
				log.debug("position--"+position);
				log.debug("employeenumber--"+employeenumber);
				log.debug("address--"+address);
				
				if (name!=null) {
					userb.setName(name);
				}
				if (insurer!=null) {
				userb.setInsurer(insurer);
				}
				if (phone!=null) {
				userb.setPhone(phone);
				}
				if (company!=null) {
				userb.setCompany(company);
				}
				if (position!=null) {
				userb.setPosition(position);
				}
				if (employeenumber!=null) {
				userb.setEmployeenumber(employeenumber);
				}
				if (address!=null) {
			    userb.setAddress(address);
			    }
				log.debug("222222222222222222--");
				userb.setRenewaltime(DateTimeUtil.currentDatetime());
				
				if(hearts!=null){
					base64.GenerateImage( hearts, root + "/" +userid+ "heart.jpg");
				 	String 	url=Define.IMAGES_USERB+"/"+userid+"heart.jpg";
					userb.setHeart(url);
				 }	log.debug("333333333333--");
				 if(honorphotoss!=null){    
					String[] ss=honorphotoss.split("\\|");
						
					String urlx=userb.getHonorphotos();
					
					for(int i = 0 ; i < ss.length ; i++ ){
					base64.GenerateImage(ss[i].substring(1), root + "/" +userid+"honorphotos"+ss[i].substring(0,1)+ ".jpg");
					
					if(urlx!=null){
						if (!urlx.contains(ss[i].substring(0,1)+ ".jpg")){
						urlx+=Define.IMAGES_USERB+"/"+userid+"honorphotos"+ss[i].substring(0,1)+".jpg"+"|";
							
							}
						}
					else{
						urlx=Define.IMAGES_USERB+"/"+userid+"honorphotos"+ss[i].substring(0,1)+".jpg"+"|";
						
						}
					}
					userb.setHonorphotos(urlx); 
					}
				 log.debug("4444444444--");
				  userbServiceI.update(userb);
				
				  //认证 获取三天的免费激活产品 移到注册那里去
				/*List<Uprelation> uprelations= uprelationServiceI.findUprelation(userid);
				
				if (uprelations.size()>0) {
						
					}
				else{
					Uprelation uprelation=new Uprelation();
						uprelation.setStatus(Define.RELATION_STRUTS_Y);
						uprelation.setUserid(userid);
						uprelation.setRenewaltime(DateTimeUtil.currentDatetime());
						uprelation.setMaturities(DateTimeUtil.formatDatetime(DateTimeUtil.getDaoQiTimeDay(3)));
						uprelation.setProductcode(Define.ALL_PRODUCT);
						uprelationServiceI.save(uprelation);
						
				}*/
					
				  MessageHelper mh = new MessageHelper();
					mh.setResult(Define.S);
					setMessageHelper(mh);
				} 
			 catch (Exception e){
				  MessageHelper mh = new MessageHelper();
					mh.setResult(Define.F);
					mh.setMessage(Define.F_MESSAGE);
					setMessageHelper(mh);
					log.error(ExceptionUtil.getStackMsg(e));
				  } 
		
				   
				     return "OK";
		 			}
		 
		 
		 
		 
		 //后台所有用户
		 	public String listUser(){
		 		try {
				 	PageSupport<Userb> pageSupport=userbServiceI.getPage(getPageNo());
		 			request.put("pageSupport", pageSupport);
				} catch (Exception e) {
					  log.error("异常错误"+e.getMessage());
				}

		 		return  "OK";
		 	}
		 	
		 	//进入修改用户状态页面
			public String updateStatusPage(){
		 		try {
		 			Userb userb=userbServiceI.get(id);
			 		request.put("userb", userb);
				} catch (Exception e) {
					  log.error("异常错误"+e.getMessage());
				}
		 		
		 		return "OK";
		 	}
		 	
		 	//修改用户状态
		 	public String updateStatus(){
		 		try {
		 			Userb userb=userbServiceI.get(id);
			 		userb.setStatus(status);
			 		userbServiceI.saveOrUpdate(userb);
				} catch (Exception e) {
					  log.error("异常错误"+e.getMessage());
				}
		 		
		 		return "OK";
		 	}
		 
		 
		 
		 	private String status;
		 	public void setStatus(String status) {
				this.status = status;
			}
		public void setId(Integer id) {
			this.id = id;
		}
		  
			  public void setHonorphotos(List<File> honorphotos) {
				this.honorphotos = honorphotos;
			}
			 
			  public void setHonorphotosFileName(List<String> honorphotosFileName) {
				this.honorphotosFileName = honorphotosFileName;
			}
			
			  public void setHonorphotosContentType(List<String> honorphotosContentType) {
				this.honorphotosContentType = honorphotosContentType;
			}
		
		public void setHeartContentType(String heartContentType) {
			this.heartContentType = heartContentType;
		}
		
		public void setHeartFileName(String heartFileName) {
			this.heartFileName = heartFileName;
		}
			
			public void setAddress(String address) {
				this.address = address;
			}
			
			public void setEmployeenumber(String employeenumber) {
				this.employeenumber = employeenumber;
			}
			public void setPhone(String phone) {
				this.phone = phone;
			}
			
			
			public void setPosition(String position) {
				this.position = position;
			}
			public void setCompany(String company) {
				this.company = company;
			}
			
			
			public void setInsurer(String insurer) {
				this.insurer = insurer;
			}
			
			
			public void setName(String name) {
				this.name = name;
			}
			
			public void setHeart(File heart) {
				this.heart = heart;
			}
			public void setType(String type) {
				this.type = type;
			}
			public void setUserb(Userb userb) {
				this.userb = userb;
			}
			public void setVerifycode(String verifycode) {
				this.verifycode = verifycode;
			}
			 private MessageHelper messageHelper;
			 public MessageHelper getMessageHelper() {
				return messageHelper;
			}
			 public void setMessageHelper(MessageHelper messageHelper) {
				this.messageHelper = messageHelper;
			}
		 
		 
		 public void setUserid(String userid) {
			this.userid = userid;
		}
		 public void setPassword(String password) {
			this.password = password;
		}
		 public void setUserbServiceI(UserbServiceI userbServiceI) {
			this.userbServiceI = userbServiceI;
		}
		
		 public void setActicode(String acticode) {
			Acticode = acticode;
		}

		 public void setUprelationServiceI(UprelationServiceI uprelationServiceI) {
				this.uprelationServiceI = uprelationServiceI;
			}
				 
	private PayinformationServiceI payinformationServiceI;
	public void setPayinformationServiceI(
			PayinformationServiceI payinformationServiceI) {
		this.payinformationServiceI = payinformationServiceI;
	}
	 private Map<String, Object> request;
	@Override
	public void setRequest(Map arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
	}
	private Map<String, Object> session;
	@Override
	public void setSession(Map arg0) {
		// TODO Auto-generated method stub
		this.session=arg0;
		
	}

	
}
