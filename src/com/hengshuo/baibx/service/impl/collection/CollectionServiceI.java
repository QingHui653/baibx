package com.hengshuo.baibx.service.impl.collection;

import java.io.Serializable;

import org.apache.log4j.Logger;

import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.model.Collection;
import com.hengshuo.baibx.model.Information;
import com.hengshuo.baibx.model.News;
import com.hengshuo.baibx.service.collection.CollectionService;


public class CollectionServiceI extends BaseDao_I<Collection, Serializable> implements CollectionService {
	private static final Logger log=Logger.getLogger(CollectionServiceI.class.getName());

	public CollectionServiceI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CollectionServiceI(Class<Collection> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	public PageSupport<Collection> getPage(Integer PageNo){
		Collection collection=new Collection();
		return this.findPageByExample(collection, PageNo, 10);
		
	}
	
	public PageSupport<Collection> getpaixu(Integer PageNo,String userid){
		Collection collection=new Collection();
		collection.setUserid(userid);
	
		return this.findPageByExampleAndOrder(collection, "top", "desc", PageNo, 14);
		
		/*return this.findPageByExample(collection, PageNo, 14);*/
	/*	return this.findAllWithOrder("top", "desc", PageNo, 14);*/
	}
	
	public PageSupport<Collection> getPaixuJson(String userid){
		
		Collection collection=new Collection();
		collection.setUserid(userid);
	
		return this.findPageByExampleAndOrder(collection, "top", "desc", 1, 1000);
	
	}
	public PageSupport<Collection> getMohuPage(String title,String titles){
		Collection collection=new Collection();
	return 	this.findPageByExampleLike(collection, title, titles, 1, 1000);
	}
	
}
