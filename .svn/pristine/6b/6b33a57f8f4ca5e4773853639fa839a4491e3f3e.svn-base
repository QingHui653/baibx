package com.hengshuo.baibx.action.admin;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.hengshuo.baibx.action.BaseAction;

import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.common.util.Define;
import com.hengshuo.baibx.common.util.MessageHelper;
import com.hengshuo.baibx.model.Admin;
import com.hengshuo.baibx.service.impl.admin.AdminServiceI;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends BaseAction implements RequestAware,SessionAware {
	private static Logger log = Logger.getLogger(AdminAction.class.getName());
	private static final long serialVersionUID = 1L;
	private String adminid;
	private String password;
	 private String phone;
	 private String name;
	 private Integer id;
	 private String stringid;
	 private Admin admin;
	 private MessageHelper messageHelper;
	 public MessageHelper getMessageHelper() {
		return messageHelper;
	}
	 public void setMessageHelper(MessageHelper messageHelper) {
		this.messageHelper = messageHelper;
	}
	 public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	 private AdminServiceI adminServiceI;
	 
	 	public String deleteAllAdmin(){
	 		try {
	 			if(stringid.contains(","))
		 		{
		 		String[] ss=stringid.split(",");
		 		for(String s:ss){
		 			int id=Integer.parseInt(s);
		 			adminServiceI.deleteByKey(id);	
		 			}
		 		}
		 		else{
		 			int id=Integer.parseInt(stringid);
		 			adminServiceI.deleteByKey(id);	
				}
				
			} catch (Exception e) {
				
				log.error(Define.F_MESSAGE+e.getMessage());
			}
	 		
	 		return "OK";
	 	}
	 
	 
	 
	 	public String deleteAdmin(){
	 		try {
	 			adminServiceI.deleteByKey(id);
			} catch (Exception e) {
				
				log.error(Define.F_MESSAGE+e.getMessage());
			}
	 		
	 		return "OK";
	 	}
	 	public String loginAdmin(){
	 		return "OK";
	 	}
	 	
	 	public String findAdmin(){	
	 		try {
	 			Admin admin=adminServiceI.get(id);
	 		 	request.put("admin", admin);
			} catch (Exception e) {
			
				log.error(Define.F_MESSAGE+e.getMessage());
			}
	 	
	 		return "OK";
	 	}
	 	
	 	
	 	public String findAll(){
	 		try {
	 		/*	List<Admin> adminlist=adminServiceI.loadAll();*/
	 			PageSupport<Admin> pageSupport=adminServiceI.getpaixu(getPageNo());
		 		request.put("pageSupport", pageSupport);
			} catch (Exception e) {
				
				log.error(Define.F_MESSAGE+e.getMessage());
			}
	 	
	 		return "OK";
	 	}
	 	
	 	public String jsonLogin(){
			try {
			List<Admin> adminlList=	adminServiceI.findAdmin(adminid);
			Admin admin=adminlList.get(0);
			String pasString=adminlList.get(0).getPassword();
			if(pasString.equals(password)){
				session.put("User", admin);
				MessageHelper mh = new MessageHelper();
				mh.setResult(Define.S);
				setMessageHelper(mh);
				}
			else{
				request.put("pass", "密码错误");
				MessageHelper mh = new MessageHelper();
				mh.setResult(Define.F);
				mh.setMessage("密码错误");
				setMessageHelper(mh);
				}
			} catch (Exception e) {
				request.put("error", "账号不存在");
				MessageHelper mh = new MessageHelper();
				mh.setResult(Define.F);
				mh.setMessage("账号不存在");
				setMessageHelper(mh);
				
			}
			return "OK";
		}
	 	
	 	
	 	
	 	
		public String login(){
			try {
			List<Admin> adminlList=	adminServiceI.findAdmin(adminid);
			Admin admin=adminlList.get(0);
			String pasString=adminlList.get(0).getPassword();
			if(pasString.equals(password)){
				session.put("User", admin);
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
		
		 public String saveOrUpdate(){
			 try {
				 admin.setAdminid(adminid);
				 admin.setPassword(password);
				 admin.setPhone(phone);
				 admin.setName(name);
				 admin.setId(id);
				 adminServiceI.saveOrUpdate(admin);
			} catch (Exception e) {
			
				log.error(Define.F_MESSAGE+e.getMessage());
			}
			
			  return "OK";
		 }
		
	public void setId(Integer id) {
		this.id = id;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdminServiceI(AdminServiceI adminServiceI) {
		this.adminServiceI = adminServiceI;
	}
	public void setStringid(String stringid) {
		this.stringid = stringid;
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
