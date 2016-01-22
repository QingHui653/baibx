package com.hengshuo.baibx.action.feedback;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.util.SystemOutLogger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;

import com.hengshuo.baibx.action.BaseAction;
import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.common.util.DateTimeUtil;
import com.hengshuo.baibx.common.util.DateUtils;
import com.hengshuo.baibx.common.util.Define;
import com.hengshuo.baibx.common.util.MessageHelper;
import com.hengshuo.baibx.model.Admin;
import com.hengshuo.baibx.model.Feedback;
import com.hengshuo.baibx.model.Userb;
import com.hengshuo.baibx.service.impl.feedback.FeedbackServiceI;
import com.hengshuo.baibx.service.impl.userb.UserbServiceI;

public class FeedbackAction extends BaseAction implements RequestAware {

	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(FeedbackAction.class.getName());
	private FeedbackServiceI feedbackServiceI;
	private UserbServiceI userbServiceI;
	private String type;
	private String content;
	private String userid;
	private Integer id;
	private String accept;
	public void setAccept(String accept) {
		this.accept = accept;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private MessageHelper messageHelper;
	
	public String  PCPage(){
		try {
	request.put("userid", userid);
		} catch (Exception e) {
		log.error(Define.F_MESSAGE);	
		}
		return "OK";
	}
	
	
	
		public String  goPage(){
			try {
		Userb userb=userbServiceI.findUserb(userid);
		request.put("userb", userb);
			} catch (Exception e) {
			log.error(Define.F_MESSAGE);	
			}
			return "OK";
		}
	
		
		public String accept(){
			try 
			{
			Feedback feedback=	feedbackServiceI.get(id);
			feedback.setAccept(accept);
			System.out.println(accept);
			
			//关联到管理员登入的
			Admin admin	=(Admin) ServletActionContext.getRequest().getSession().getAttribute("User");
			feedback.setAdminid(admin.getAdminid());
			feedbackServiceI.saveOrUpdate(feedback);
			Userb userb=userbServiceI.findUserb(feedback.getUserid());
			int gold=userb.getGold();
			//采纳激励一百金元宝
			userb.setGold(gold+100);
			userbServiceI.saveOrUpdate(userb);
			} 
			catch (Exception e)
			{
				log.error(Define.F_MESSAGE);	
			}
			
			
			return "OK";
		}
		
		
		public String feedbackDetail(){
			
			try {
			Feedback feedback=feedbackServiceI.get(id);
			request.put("feedback", feedback);
			} catch (Exception e) {
				// TODO: handle exception
			}
			return  "OK";
		}
		
		public String listFeedback(){
				try {
					PageSupport<Feedback> pageSupport=feedbackServiceI.getpaixu(getPageNo());
					request.put("pageSupport", pageSupport);
				} catch (Exception e) {
					// TODO: handle exception
				}
				return  "OK";
			}
		
	
	
			public String addFeedback(){
				try {
					Feedback feedback=new Feedback();
					feedback.setType(type);
					feedback.setContent(content);
					feedback.setUserid(userid);
					feedback.setTime(DateTimeUtil.currentDatetime());
					feedback.setAccept(Define.FEEDBACK_ACCEPT_0);
					feedbackServiceI.save(feedback);
					MessageHelper mh=new MessageHelper();
					mh.setResult(Define.S);
					setMessageHelper(mh);
					
				} catch (Exception e) {
				log.error(Define.F_MESSAGE+e.getMessage());
				 MessageHelper mh = new MessageHelper();
	 			 mh.setResult(Define.F);
	 			 mh.setResult(Define.F_MESSAGE);
	 			 setMessageHelper(mh);
				}
				
				return "OK";
			}
	
	
	public MessageHelper getMessageHelper() {
		return messageHelper;
	}
	public void setMessageHelper(MessageHelper messageHelper) {
		this.messageHelper = messageHelper;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setFeedbackServiceI(FeedbackServiceI feedbackServiceI) {
		this.feedbackServiceI = feedbackServiceI;
	}
	public void setUserbServiceI(UserbServiceI userbServiceI) {
		this.userbServiceI = userbServiceI;
	}


	private Map<String, Object> request;
	@Override
	public void setRequest(Map arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
	}
	
	
}
