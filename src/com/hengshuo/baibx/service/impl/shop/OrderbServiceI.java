package com.hengshuo.baibx.service.impl.shop;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.crypto.Data;

import org.apache.log4j.Logger;

import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.common.util.Define;
import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.model.Admin;
import com.hengshuo.baibx.model.Collection;
import com.hengshuo.baibx.model.News;
import com.hengshuo.baibx.model.Orderb;
import com.hengshuo.baibx.model.Userb;
import com.hengshuo.baibx.service.shop.OrderbService;

public class OrderbServiceI extends BaseDao_I<Orderb, Serializable> implements OrderbService {

	private static final Logger log=Logger.getLogger(OrderbServiceI.class.getName());

	public OrderbServiceI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderbServiceI(Class<Orderb> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	
	public Orderb findOrderb(String userid,String date) {
		Object[] values={userid,date};
		String queryString="From Orderb where userid=? and time=?";
		List<Orderb> sList=this.find(queryString, values);
		Orderb orderb=sList.get(0);
		return orderb;	
	}
	
	public PageSupport<Orderb> getPage(String userid,Integer PageNo){
		Orderb orderb=new Orderb();
		orderb.setUserid(userid);
		return this.findPageByExample(orderb, PageNo, 14);
	}
	public PageSupport<Orderb> getpaixu(Integer PageNo,String userid){
		Orderb orderb=new Orderb();
		orderb.setUserid(userid);
	
		return this.findPageByExampleAndOrder(orderb, "id", "desc", PageNo, 4);
		
	}
	
	public PageSupport<Orderb> getorderbpage(Integer PageNo){
		Orderb orderb=new Orderb();
		return this.findPageByExampleAndOrder(orderb, "id", "desc", PageNo, 14);
		
	}
	
	public PageSupport<Orderb> getsonyuanbao(Integer PageNo,String userid){
		Orderb orderb=new Orderb();
		orderb.setStatus(Define.PAY_STRUTS_Y);
		orderb.setUserid(userid);
		return this.findPageByExampleAndOrder(orderb, "id", "desc", PageNo, 14);
		
	}

	
	
	

	
	
}
