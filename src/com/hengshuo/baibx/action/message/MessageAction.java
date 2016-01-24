package com.hengshuo.baibx.action.message;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.RequestAware;

import com.hengshuo.baibx.action.collection.CollectionAction;
import com.hengshuo.baibx.common.util.DateTimeUtil;
import com.hengshuo.baibx.model.Message;
import com.hengshuo.baibx.model.Userb;
import com.hengshuo.baibx.service.impl.message.MessageServiceI;
import com.hengshuo.baibx.service.impl.userb.UserbServiceI;

public class MessageAction implements RequestAware{

	private Integer id;
	private String name;
	private String content;
	private Date date;
	private String userid;
	private Date time;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}


	

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private UserbServiceI userbServiceI;
	private MessageServiceI messageServiceI;
	private static Logger log = Logger.getLogger(CollectionAction.class
			.getName());
	

	public static Logger getLog() {
		return log;
	}

	public static void setLog(Logger log) {
		MessageAction.log = log;
	}

	public MessageServiceI getMessageServiceI() {
		return messageServiceI;
	}

	public UserbServiceI getUserbServiceI() {
		return userbServiceI;
	}

	public void setUserbServiceI(UserbServiceI userbServiceI) {
		this.userbServiceI = userbServiceI;
	}

	public void setMessageServiceI(MessageServiceI messageServiceI) {
		this.messageServiceI = messageServiceI;
	}

	public String listMessage() {
		try {

			/*
			 * List userb = (ArrayList)
			 * userbServiceI.findBySQL("SELECT * FROM userb WHERE Userid="
			 * +userid+";", false); String username =(String) userb.get(0); List
			 * list1
			 * =messageServiceI.findBySQL("SELECT * FROM message WHERE Name="
			 * +username+";", false); List<Message> message=new
			 * ArrayList<Message>();
			 */
			
			
			List usernamel=userbServiceI.findBySQL("SELECT `Name` FROM userb WHERE Userid='"+userid+"';", false);
			String username=usernamel.get(0).toString();
			List list1 = messageServiceI.findBySQL(
					"SELECT * FROM message WHERE Name='" + username + "';",
					false);
			List<Message> message = new ArrayList<Message>();
			for (int i = 0; i < list1.size(); i++) {
				Object[] objects = (Object[]) list1.get(i);
				Message message2 = new Message();
				message2.setName(objects[1].toString());
				message2.setContent(objects[2].toString());
				DateTimeUtil dateTimeUtil = new DateTimeUtil();
				time = dateTimeUtil.parseDate(objects[3].toString());
				message2.setTime(time);
				message.add(message2);
				
			}
			request.put("list", message);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return "OK";
	}
	
	
	
	private Map<String, Object> request;
	
	public void setRequest(Map arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
	}
	 private Map<String, Object> session;
	public void setSession(Map arg0) {
		this.session=arg0;
		
	}

}
