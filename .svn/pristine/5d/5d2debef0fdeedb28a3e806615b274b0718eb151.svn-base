package com.hengshuo.baibx.action.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.RequestAware;

import com.hengshuo.baibx.action.BaseAction;
import com.hengshuo.baibx.common.util.Define;
import com.hengshuo.baibx.common.util.MessageHelper;
import com.hengshuo.baibx.model.Collection;
import com.hengshuo.baibx.model.Groupuser;
import com.hengshuo.baibx.model.Invitation;
import com.hengshuo.baibx.model.Userb;
import com.hengshuo.baibx.service.impl.collection.CollectionServiceI;
import com.hengshuo.baibx.service.impl.group.InvitationServiceI;
import com.hengshuo.baibx.service.impl.userb.UserbServiceI;

public class InvitationAction extends BaseAction implements RequestAware {

	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(InvitationAction.class.getName());
	private InvitationServiceI invitationServiceI;
	private CollectionServiceI collectionServiceI;
	private UserbServiceI userbServiceI;
	private String userid;
	private Integer id;
	private Integer shoucid;
	private String scid;
	private String data;
	public void setData(String data) {
		this.data = data;
	}
	public void setScid(String scid) {
		this.scid = scid;
	}
	private String content;
	private String type;
	private MessageHelper messageHelper;
	private List<Invitation> invitationslist;
	//话术
	
	public String detail(){
		
		try {
			Invitation invitation=invitationServiceI.get(id);
			Userb userb=userbServiceI.findUserb(userid);
			request.put("invitation", invitation);
			request.put("userb", userb);
			
			if (scid!=null) {
				List<Collection> collections=new ArrayList<Collection>();
				if(scid.contains(","))
		 		{
		 		String[] ss=scid.split(",");
		 		for(String s:ss){
		 			int iid=Integer.parseInt(s);
		 			Collection collection=	collectionServiceI.get(iid);
		 			collections.add(collection);
		 			}
		 		
		 		}
		 		else {
		 			int iid=Integer.parseInt(scid);
		 			Collection collection=	collectionServiceI.get(iid);
		 			collections.add(collection);
				}
				//Collection collection=	collectionServiceI.get(shoucid);
				request.put("collections", collections);
			}
		
			
		
		} catch (Exception e) 
		{
			log.error(Define.F_MESSAGE+e.getMessage());
		}
				return "OK";
	}
	
	
	
	
		public String huaShuList(){
		try {
		List<Invitation> list=invitationServiceI.findListInvitation(userid, type);
			MessageHelper mh = new MessageHelper();
		 	mh.setResult(Define.S);
		 	mh.setList(list);
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
		public String huaShuDetail(){
			try {
				Invitation invitation=invitationServiceI.get(id);
				MessageHelper mh = new MessageHelper();
			 	mh.setResult(Define.S);
			 	mh.setEntity(invitation);
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
		
			public String deleteHuaShu(){
					try {
					invitationServiceI.deleteByKey(id);
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
			
			public String addJsonHuaShua(){
				try {
					
					JSONObject obj = JSONObject.fromObject(data);        
					Invitation invitation=	(Invitation) obj.toBean(obj, Invitation.class);
				
					
					
					//Invitation invitation=new Invitation();
					//invitation.setId(id);
					//String contents=new String(content.getBytes("iso8859-1"), "utf-8"); 
					//invitation.setContent(contents);
					//invitation.setType(type);
					//invitation.setUserid(userid);
					//invitationServiceI.saveOrUpdate(invitation);
						invitationServiceI.saveOrUpdate(invitation);
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
			
			
			
			
			
			
			public String addHuaShua(){
				try {
					Invitation invitation=new Invitation();
					invitation.setId(id);
					String contents=new String(content.getBytes("iso8859-1"), "utf-8"); 
					invitation.setContent(contents);
					invitation.setType(type);
					invitation.setUserid(userid);
					invitationServiceI.saveOrUpdate(invitation);
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
			public String updateHuaShu(){
				try {
					Invitation invitation=invitationServiceI.get(id);
					invitation.setContent(content);
					invitationServiceI.saveOrUpdate(invitation);
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
	
	
	
	
	
	
	
	
	
	public void setUserbServiceI(UserbServiceI userbServiceI) {
		this.userbServiceI = userbServiceI;
	}
	public void setCollectionServiceI(CollectionServiceI collectionServiceI) {
		this.collectionServiceI = collectionServiceI;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setShoucid(Integer shoucid) {
		this.shoucid = shoucid;
	}
	public void setId(Integer id) {
		this.id = id;
	}
		public void setMessageHelper(MessageHelper messageHelper) {
			this.messageHelper = messageHelper;
		}
		public MessageHelper getMessageHelper() {
			return messageHelper;
		}
	
		public void setInvitationslist(List<Invitation> invitationslist) {
			this.invitationslist = invitationslist;
		}


	public void setType(String type) {
		this.type = type;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setInvitationServiceI(InvitationServiceI invitationServiceI) {
		this.invitationServiceI = invitationServiceI;
	}



	private Map<String, Object> request;
	@Override
	public void setRequest(Map arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
	}
}
