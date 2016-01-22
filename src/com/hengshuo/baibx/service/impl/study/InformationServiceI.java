package com.hengshuo.baibx.service.impl.study;

import java.io.Serializable;

import org.apache.log4j.Logger;

import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.model.Collection;
import com.hengshuo.baibx.model.Information;
import com.hengshuo.baibx.model.News;

import com.hengshuo.baibx.service.study.InformationService;

public class InformationServiceI extends BaseDao_I<Information, Serializable> implements InformationService {

	private static final Logger log=Logger.getLogger(InformationServiceI.class.getName());

	public InformationServiceI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InformationServiceI(Class<Information> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	
	public PageSupport<Information> getPage(Integer PageNo,String type, Integer size){
		Information information=new Information();
		information.setType(type);
		return this.findPageByExample(information, PageNo, size);
		
	}
	
	public PageSupport<Information>getpaixu(Integer PageNo,String type,Integer size){
		Information information=new Information();
		information.setType(type);
		
	return this.findPageByExampleAndOrder(information, "id", "desc", PageNo, size);
	}
	
	public PageSupport<Information> getMohuPage(String title,String titles){
		Information information=new Information();
	return 	this.findPageByExampleLike(information, title, titles, 1, 1000);
	}
	

	
}
