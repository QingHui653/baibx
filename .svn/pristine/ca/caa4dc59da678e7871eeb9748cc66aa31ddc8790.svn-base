package com.hengshuo.baibx.service.impl.shop;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.model.Giftdetail;
import com.hengshuo.baibx.model.News;
import com.hengshuo.baibx.model.Orderb;
import com.hengshuo.baibx.model.Userb;

import com.hengshuo.baibx.service.shop.GiftdetailService;

public class GiftdetailServiceI extends BaseDao_I<Giftdetail, Serializable> implements GiftdetailService {
	private static final Logger log=Logger.getLogger(GiftdetailServiceI.class.getName());

	public GiftdetailServiceI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiftdetailServiceI(Class<Giftdetail> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	public PageSupport<Giftdetail> getPage(Integer PageNo){
		Giftdetail giftdetail=new Giftdetail();
		return this.findPageByExample(giftdetail, PageNo, 20);
	}
	
	public PageSupport<Giftdetail> getorderbpage(Integer PageNo){
		Giftdetail giftdetail=new Giftdetail();
		return this.findPageByExampleAndOrder(giftdetail, "id", "desc", PageNo, 6);
		
	}





}
