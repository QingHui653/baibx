package com.hengshuo.baibx.service.impl.news;

import java.io.Serializable;

import org.apache.log4j.Logger;

import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.model.News;
import com.hengshuo.baibx.service.news.NewsService;


public class NewsServiceI extends BaseDao_I<News, Serializable>implements NewsService {
	private static final Logger log=Logger.getLogger(NewsServiceI.class.getName());
	
	public PageSupport<News> getPage(Integer PageNo,Integer size){
		News sNews=new News();
		return this.findPageByExample(sNews, PageNo, size);
		
	}
		public PageSupport<News> getpaixu(Integer PageNo,Integer size){
			
			return this.findAllWithOrder("id", "desc", PageNo, size);
		}
		
	
	
	
	public NewsServiceI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NewsServiceI(Class<News> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	
	
}
