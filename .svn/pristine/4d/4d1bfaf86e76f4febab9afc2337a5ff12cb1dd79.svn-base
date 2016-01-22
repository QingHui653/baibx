package com.hengshuo.baibx.service.impl.feedback;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.model.Admin;
import com.hengshuo.baibx.model.Collection;
import com.hengshuo.baibx.model.Feedback;
import com.hengshuo.baibx.service.feedback.FeedbackService;


public class FeedbackServiceI extends BaseDao_I<Feedback, Serializable> implements FeedbackService {
	private static final Logger log=Logger.getLogger(FeedbackServiceI.class.getName());

	public FeedbackServiceI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FeedbackServiceI(Class<Feedback> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	
	public PageSupport<Feedback> getpaixu(Integer PageNo){
		Feedback feedback=new Feedback();
		return this.findPageByExampleAndOrder(feedback, "id", "desc", PageNo, 14);
		
		/*return this.findPageByExample(collection, PageNo, 14);*/
	/*	return this.findAllWithOrder("top", "desc", PageNo, 14);*/
	}
	
	
	
}
