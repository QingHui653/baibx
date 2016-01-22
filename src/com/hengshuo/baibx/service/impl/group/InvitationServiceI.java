package com.hengshuo.baibx.service.impl.group;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.model.Groupuser;
import com.hengshuo.baibx.model.Invitation;
import com.hengshuo.baibx.service.group.InvitationService;

public class InvitationServiceI extends BaseDao_I<Invitation, Serializable> implements InvitationService{
	private static final Logger log=Logger.getLogger(InvitationServiceI.class.getName());

	public InvitationServiceI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvitationServiceI(Class<Invitation> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	
	public List<Invitation> findListInvitation(String userid,String type){
		String[] values={userid,type};
		String queryString="From Invitation where userid=? and type=? ";
		List<Invitation> Invitations=this.find(queryString, values);
		return Invitations;
	}
	public List<Invitation> findListInvitationByUserid(String userid){
		String[] values={userid};
		String queryString="From Invitation where userid=?";
		List<Invitation> Invitations=this.find(queryString, values);
		return Invitations;
	}
	

}
