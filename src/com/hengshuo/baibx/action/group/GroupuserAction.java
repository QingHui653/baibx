package com.hengshuo.baibx.action.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.processors.JsonBeanProcessor;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.RequestAware;
import org.aspectj.apache.bcel.generic.NEW;

import com.googlecode.jsonplugin.annotations.JSON;
import com.hengshuo.baibx.action.BaseAction;
import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.common.util.Define;
import com.hengshuo.baibx.common.util.MessageHelper;
import com.hengshuo.baibx.model.Groupuser;
import com.hengshuo.baibx.model.Invitation;
import com.hengshuo.baibx.service.impl.group.GroupuserServiceI;
import com.hengshuo.baibx.service.impl.group.InvitationServiceI;
import com.hengshuo.baibx.service.impl.userb.UserbServiceI;


public class GroupuserAction extends BaseAction implements RequestAware{
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(GroupuserAction.class.getName());
	private String userid;
	private String grouptype;
	private String phoneid;
	private String group;
	private String list;
public void setList(String list) {
	this.list = list;
}
	private String name;
	private String sex;
	private String age;
	private String birth;
	private String address;
	private String insurer;
	private String company;
	private String type;
	private String occupation;
	private String remarks;
	private String usertag;
	private String lastvisit;
	private String data;
	public void setData(String data) {
		this.data = data;
	}
	private String nextappointment;
	private Long id;
	private MessageHelper messageHelper;
	private List<Groupuser> listgroupusers;
	private Groupuser groupuser;
	private GroupuserServiceI groupuserServiceI;
	private InvitationServiceI invitationServiceI;
	public void setInvitationServiceI(InvitationServiceI invitationServiceI) {
		this.invitationServiceI = invitationServiceI;
	}
	private UserbServiceI userbServiceI;
	private String ids;
	public void setIds(String ids) {
		this.ids = ids;
	}
	 //删除 
	 public String deleteGroup(){
		 
		 try {
				groupuserServiceI.deleteByKey(id);
				
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		 return "OK";
	 }
	 
	//批量删除
	 public String deleteAllgroup(){
	
		 try {
			 if(ids.contains(","))
		 		{
		 		String[] ss=ids.split(",");
		 		for(String s:ss){
		 			int id=Integer.parseInt(s);
		 			groupuserServiceI.deleteByKey(id);	
		 			}
		 		
		 		}
		 		else {
		 			int id=Integer.parseInt(ids);
		 			groupuserServiceI.deleteByKey(id);	
				}
			 
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
		 return "OK";
	 }
	 
	
	//备份
	public String allGroupByUserid(){
		try {
			listgroupusers=groupuserServiceI.findListGroupByUserid(userid);
			List<Invitation> invitations=invitationServiceI.findListInvitationByUserid(userid);
			MessageHelper mh = new MessageHelper();
		 	mh.setResult(Define.S);
		
		 	mh.setList(invitations);
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
	 
	 
	
	//后台群组
	public String group(){
		
		try {
		PageSupport<Groupuser> pageSupport=	groupuserServiceI.getPage(getPageNo(), grouptype, 10);
			request.put("pageSupport", pageSupport);
		} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		return "OK";
	}
	
	
	public String deleteGroupUser(){
		try {
			
			String quString="delete Groupuser where id=? and userid=? and grouptype=? ";
			Object [] values={id,userid,grouptype};
			System.out.println("id"+id);
			System.out.println("userid"+userid);
			System.out.println("grouptype"+grouptype);
			int x=	groupuserServiceI.bulkUpdate(quString, values);
			if (x>0) {
				MessageHelper mh = new MessageHelper();
			 	mh.setResult(Define.S);
				setMessageHelper(mh);
			}else{
				MessageHelper mh = new MessageHelper();
			 	mh.setResult(Define.F);
			 	mh.setMessage("删除失败");
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
	
	
		public String  update(){
			try {
				
				StringBuilder updateSql=new StringBuilder();
				updateSql.append("update Groupuser set ");
				
				if(name!=null && !name.equals("")){
					//String names=new String(name.getBytes("iso8859-1"), "utf-8");
					updateSql.append("name='"+name+"'");
				}
				if(phoneid!=null && !phoneid.equals("")){
					//String names=new String(phoneid.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",phoneid='"+phoneid+"'");
				}
				if(sex!=null && !sex.equals("")){
					//String sexss=new String(sex.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",sex='"+sex+"'");
				}
				if (age!=null && !age.equals("")) {
					updateSql.append(",age='"+age+"'");
				}
				if (birth!=null && !birth.equals("")) {
					updateSql.append(",birth='"+birth+"'");
				}
				if(occupation!=null && !occupation.equals("")){
					//String occupations=new String(occupation.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",occupation='"+occupation+"'");
				}
				if(address!=null && !address.equals("")){
					//String addresss=new String(address.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",address='"+address+"'");
				}
				if(insurer!=null && !insurer.equals("")){
					//String addresss=new String(insurer.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",insurer='"+insurer+"'");
				}
				if(company!=null && !company.equals("")){
					//String addresss=new String(company.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",company='"+company+"'");
				}
				if(type!=null && !type.equals("")){
					//String types=new String(type.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",type='"+type+"'");
				}
				if(remarks!=null && !remarks.equals("")){
					//String types=new String(remarks.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",remarks='"+remarks+"'");
				}
				if(usertag!=null && !usertag.equals("")){
					//String types=new String(usertag.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",usertag='"+usertag+"'");
				}
				if(lastvisit!=null && !lastvisit.equals("")){
					//String types=new String(lastvisit.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",lastvisit='"+lastvisit+"'");
				}
				if(nextappointment!=null && !nextappointment.equals("")){
					//String types=new String(lastvisit.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",nextappointment='"+nextappointment+"'");
				}
				updateSql.append("where id='"+id+"'"+"and userid='"+userid+"'"+"and grouptype='"+grouptype+"'");
				int x=groupuserServiceI.bulkUpdate(updateSql.toString());
				
				if (x>0) {
					MessageHelper mh = new MessageHelper();
				 	mh.setResult(Define.S);
					setMessageHelper(mh);
				}else {
					MessageHelper mh = new MessageHelper();
				 	mh.setResult(Define.F);
				 	mh.setMessage("修改失败");
					setMessageHelper(mh);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return "OK";
		}
	
	
	
		public String updateGroupUser(){
			try {/*
			Groupuser groupuser=new Groupuser();
			groupuser.setId(id);
			String names=new String(name.getBytes("iso8859-1"), "utf-8"); 
			
			groupuser.setName(names);
			groupuser.setPhoneid(phoneid);
			String sexs=new String(sex.getBytes("iso8859-1"), "utf-8"); 
			groupuser.setSex(sexs);
			groupuser.setAge(age);
			groupuser.setBirth(birth);
			String addresss=new String(address.getBytes("iso8859-1"), "utf-8"); 
			String insurers=new String(insurer.getBytes("iso8859-1"), "utf-8"); 
			String companys=new String(company.getBytes("iso8859-1"), "utf-8"); 
			String occupations=new String(occupation.getBytes("iso8859-1"), "utf-8"); 
			String remarkss=new String(remarks.getBytes("iso8859-1"), "utf-8"); 
				
			groupuser.setAddress(addresss);
			groupuser.setInsurer(insurers);
			groupuser.setCompany(companys);
			groupuser.setType(type);
			groupuser.setOccupation(occupations);
			groupuser.setRemarks(remarkss);
			groupuser.setUsertag(usertag);
			groupuser.setGrouptype(grouptype);
			groupuser.setUserid(userid);
			groupuser.setLastvisit(lastvisit);
			groupuser.setNextappointment(nextappointment);
			System.out.println(lastvisit);
			System.out.println(nextappointment);
				groupuserServiceI.saveOrUpdate(groupuser);
				MessageHelper mh = new MessageHelper();
			 	mh.setResult(Define.S);
				setMessageHelper(mh);
			*/


				//JSONArray json = JSONArray.fromObject(list);
				System.out.println(data);
				JSONObject obj = JSONObject.fromObject(data); 
				
				Groupuser groupuser=	(Groupuser) obj.toBean(obj, Groupuser.class);
			
				
				
				StringBuilder updateSql=new StringBuilder();
				updateSql.append("update Groupuser set ");
				if(groupuser.getName()!=null && !groupuser.getName().equals("")){
					//String names=new String(name.getBytes("iso8859-1"), "utf-8");
					updateSql.append("name='"+groupuser.getName()+"'");
				}
				if(groupuser.getPhoneid()!=null && !groupuser.getPhoneid().equals("")){
					//String names=new String(phoneid.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",phoneid='"+groupuser.getPhoneid()+"'");
				}
				if(groupuser.getSex()!=null && !groupuser.getSex().equals("")){
					//String sexss=new String(sex.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",sex='"+groupuser.getSex()+"'");
				}
				if (groupuser.getAge()!=null && !groupuser.getAge().equals("")) {
					updateSql.append(",age='"+groupuser.getAge()+"'");
				}
				if (groupuser.getBirth()!=null && !groupuser.getBirth().equals("")) {
					updateSql.append(",birth='"+groupuser.getBirth()+"'");
				}
				if(groupuser.getOccupation()!=null && !groupuser.getOccupation().equals("")){
					//String occupations=new String(occupation.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",occupation='"+groupuser.getOccupation()+"'");
				}
				if(groupuser.getAddress()!=null && !groupuser.getAddress().equals("")){
					//String addresss=new String(address.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",address='"+groupuser.getAddress()+"'");
				}
				if(groupuser.getInsurer()!=null && !groupuser.getInsurer().equals("")){
					//String addresss=new String(insurer.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",insurer='"+groupuser.getInsurer()+"'");
				}
				if(groupuser.getCompany()!=null && !groupuser.getCompany().equals("")){
					//String addresss=new String(company.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",company='"+groupuser.getCompany()+"'");
				}
				if(groupuser.getType()!=null && !groupuser.getType().equals("")){
					//String types=new String(type.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",type='"+groupuser.getType()+"'");
				}
				if(groupuser.getRemarks()!=null && !groupuser.getRemarks().equals("")){
					//String types=new String(remarks.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",remarks='"+groupuser.getRemarks()+"'");
				}
				if(groupuser.getUsertag()!=null && !groupuser.getUsertag().equals("")){
					//String types=new String(usertag.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",usertag='"+groupuser.getUsertag()+"'");
				}
				if(groupuser.getLastvisit()!=null && !groupuser.getLastvisit().equals("")){
					//String types=new String(lastvisit.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",lastvisit='"+groupuser.getLastvisit()+"'");
				}
				if(groupuser.getNextappointment()!=null && !groupuser.getNextappointment().equals("")){
					//String types=new String(lastvisit.getBytes("iso8859-1"), "utf-8");
					updateSql.append(",nextappointment='"+groupuser.getNextappointment()+"'");
				}
				updateSql.append("where id='"+groupuser.getId()+"'"+"and userid='"+groupuser.getUserid()+"'"+"and grouptype='"+groupuser.getGrouptype()+"'");
				int x=groupuserServiceI.bulkUpdate(updateSql.toString());
				
				if (x>0) {
					MessageHelper mh = new MessageHelper();
				 	mh.setResult(Define.S);
					setMessageHelper(mh);
				}else {
					MessageHelper mh = new MessageHelper();
				 	mh.setResult(Define.F);
				 	mh.setMessage("修改失败");
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
		
			
		public String addJsonGroup(){
			try {	
			
				JSONArray json = JSONArray.fromObject(list);
				List<Groupuser> cgList=(List<Groupuser>) JSONArray.toCollection(json, Groupuser.class);
				for (Groupuser s:cgList) {
					groupuserServiceI.save(s);
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
		
		
		
		
	
		public String addGroupUser(){
			try {
			
				List<Groupuser> cgList=new ArrayList<Groupuser>();
				String[] ss=group.split("\\|");
				for(String s:ss){
					Groupuser groupUser=new Groupuser();
					String[] aa=s.split(",");
					for(String a:aa){
						String[] bb=a.split("=");
						if(bb[0].equals("id")){
							
							
							Long idd=Long.valueOf(bb[1]);
						
							groupUser.setId(idd);
						}
						else if(bb[0].equals("phoneid")){
							groupUser.setPhoneid(bb[1]);
						}
						else if(bb[0].equals("name"))
						{
							groupUser.setName(bb[1]);
						}else if(bb[0].equals("sex"))
						{
							groupUser.setSex(bb[1]);
						}else if(bb[0].equals("age"))
						{
							groupUser.setAge(bb[1]);
						}else if(bb[0].equals("birth"))
						{
							groupUser.setBirth(bb[1]);
						}else if(bb[0].equals("address"))
						{
							groupUser.setAddress(bb[1]);
						}else if(bb[0].equals("insurer"))
						{
							groupUser.setInsurer(bb[1]);
						}else if(bb[0].equals("company"))
						{
							groupUser.setCompany(bb[1]);
						}else if(bb[0].equals("type"))
						{
							groupUser.setType(bb[1]);
						}else if(bb[0].equals("occupation"))
						{
							groupUser.setOccupation(bb[1]);
						}else if(bb[0].equals("remarks"))
						{
							groupUser.setRemarks(bb[1]);
						}else if(bb[0].equals("usertag"))
						{
							groupUser.setUsertag(bb[1]);	
						}
						else if(bb[0].equals("grouptype"))
						{
							groupUser.setGrouptype(bb[1]);	
						}else if(bb[0].equals("userid"))
						{
							groupUser.setUserid(bb[1]);
						}else if(bb[0].equals("lastvisit"))
						{
							groupUser.setLastvisit(bb[1]);
						}else if(bb[0].equals("nextappointment"))
						{
							groupUser.setNextappointment(bb[1]);
						}
					}
						cgList.add(groupUser);
					}	
				for(Groupuser s:cgList){
					groupuserServiceI.save(s);	
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
			
		public String findGroupUser(){
				try {
					//Groupuser groupuser=groupuserServiceI.get(id);
					
					
					String quString="from Groupuser where id=? and userid=? and grouptype=? ";
					Object [] values={id,userid,grouptype};
					List<Groupuser> list=groupuserServiceI.find(quString,values);
					MessageHelper mh = new MessageHelper();
				 	mh.setResult(Define.S);
				 	if (list.size()>0) {
				 		mh.setEntity(list.get(0));
					}else {
						mh.setEntity(null);
					}
				 	
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
		
		
		public String findListGroupUser(){
			try {
				List<Groupuser> list=groupuserServiceI.findListGroup(userid, grouptype);
				MessageHelper mh = new MessageHelper();
			 	mh.setResult(Define.S);
			 	mh.setList(list);
				setMessageHelper(mh);	
				} 
			catch (Exception e) {
					MessageHelper mh = new MessageHelper();
				 	mh.setResult(Define.F);
				 	mh.setMessage(Define.F_MESSAGE);
					setMessageHelper(mh);
					log.error(Define.F_MESSAGE+e.getMessage());
				}
				return "OK";	
		}
		
		
		public void setLastvisit(String lastvisit) {
			this.lastvisit = lastvisit;
		}
		public void setNextappointment(String nextappointment) {
			this.nextappointment = nextappointment;
		}
		public void setUserbServiceI(UserbServiceI userbServiceI) {
			this.userbServiceI = userbServiceI;
		}
		public void setGroupuserServiceI(GroupuserServiceI groupuserServiceI) {
			this.groupuserServiceI = groupuserServiceI;
		}
		/*public Groupuser getGroupuser() {
			return groupuser;
		}*/
		public void setName(String name) {
			this.name = name;
		}
		
		public void setSex(String sex) {
			this.sex = sex;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public void setBirth(String birth) {
			this.birth = birth;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setInsurer(String insurer) {
			this.insurer = insurer;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public void setType(String type) {
			this.type = type;
		}
		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
		public void setUsertag(String usertag) {
			this.usertag = usertag;
		}
		public void setGroupuser(Groupuser groupuser) {
			this.groupuser = groupuser;
		}
		public void setGrouptype(String grouptype) {
			this.grouptype = grouptype;
		}
		
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public void setPhoneid(String phoneid) {
			this.phoneid = phoneid;
		}
		public void setGroup(String group) {
			this.group = group;
		}
		
		 public MessageHelper getMessageHelper() {
				return messageHelper;
			}
			 public void setMessageHelper(MessageHelper messageHelper) {
				this.messageHelper = messageHelper;
			}
			 public List<Groupuser> getListgroupusers() {
				return listgroupusers;
			}
		public void setListgroupusers(List<Groupuser> listgroupusers) {
			this.listgroupusers = listgroupusers;
		}
		private Map<String, Object> request;
		@Override
		public void setRequest(Map arg0) {
			// TODO Auto-generated method stub
			this.request=arg0;
		}
	
}
