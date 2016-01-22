package com.hengshuo.baibx.service.impl.group;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.model.Collection;
import com.hengshuo.baibx.model.Groupuser;
import com.hengshuo.baibx.model.Information;
import com.hengshuo.baibx.service.group.GroupuserService;

public class GroupuserServiceI extends BaseDao_I<Groupuser, Serializable> implements GroupuserService {
	private static final Logger log=Logger.getLogger(GroupuserServiceI.class.getName());

	public GroupuserServiceI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroupuserServiceI(Class<Groupuser> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	
	public List<Groupuser> findListGroup(String userid,String grouptype){
		String[] values={userid,grouptype};
		String queryString="From Groupuser where userid=? and grouptype=? ";
		List<Groupuser> groupusers=this.find(queryString, values);
		return groupusers;
	}
	
	
	public List<Groupuser> findListGroupByUserid(String userid){
		String[] values={userid};
		String queryString="From Groupuser where userid=?";
		List<Groupuser> groupusers=this.find(queryString, values);
		return groupusers;
	}
	
	
	public PageSupport<Groupuser> getPage(Integer PageNo,String type, Integer size){
		Groupuser groupuser=new Groupuser();
		groupuser.setGrouptype(type);
		return this.findPageByExample(groupuser, PageNo, size);
		
	}
	
	
	
/*	public Groupuser findGroupusers(String phoneid){
		String[] values={phoneid};
		String queryString="From Groupuser where phoneid=? ";
		List<Groupuser> groupusers=this.find(queryString, values);
		return groupusers.get(0);
		
	}*/
	
/*	
	public PageSupport<Groupuser> getpaixu(Integer PageNo,String userid){
		Groupuser groupuser=new Groupuser();
		groupuser.setUserid(userid);
	
		return this.findPageByExampleAndOrder(groupuser, "id", "desc", PageNo, 14);
		
}
	*/

	
	
}
