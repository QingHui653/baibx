package com.hengshuo.baibx.action.collection;

import java.util.Map;


import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;

import com.hengshuo.baibx.action.BaseAction;
import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.common.util.DateTimeUtil;
import com.hengshuo.baibx.common.util.DateUtils;
import com.hengshuo.baibx.common.util.Define;
import com.hengshuo.baibx.common.util.MessageHelper;
import com.hengshuo.baibx.model.Collection;
import com.hengshuo.baibx.model.Information;
import com.hengshuo.baibx.model.News;
import com.hengshuo.baibx.service.impl.collection.CollectionServiceI;
import com.hengshuo.baibx.service.impl.news.NewsServiceI;
import com.hengshuo.baibx.service.impl.study.InformationServiceI;


public class CollectionAction extends BaseAction implements RequestAware {

	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(CollectionAction.class.getName());
	private CollectionServiceI collectionServiceI;
	private NewsServiceI newsServiceI;
	public void setNewsServiceI(NewsServiceI newsServiceI) {
		this.newsServiceI = newsServiceI;
	}
	private InformationServiceI informationServiceI;
	public void setInformationServiceI(InformationServiceI informationServiceI) {
		this.informationServiceI = informationServiceI;
	}
	private String userid;
	private Integer id;
	private Integer resouceid;
	private String title;
	private String type;
	private String url;
	private String top;
	private MessageHelper messageHelper;
	public MessageHelper getMessageHelper() {
		return messageHelper;
	}
	public void setMessageHelper(MessageHelper messageHelper) {
		this.messageHelper = messageHelper;
	}
	public void setTop(String top) {
		this.top = top;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setResouceid(Integer resouceid) {
		this.resouceid = resouceid;
	}
	
	
	public String listJson(){
		try {
			PageSupport<Collection> pageSupport=collectionServiceI.getPaixuJson(userid);
			MessageHelper mHelper=new MessageHelper();
			mHelper.setResult(Define.S);
			mHelper.setList(pageSupport.getResult());
			setMessageHelper(mHelper);
			
		} catch (Exception e) {
			MessageHelper mHelper=new MessageHelper();
			mHelper.setResult(Define.F);
			mHelper.setMessage(Define.F_MESSAGE);
			setMessageHelper(mHelper);
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		return "OK";
	}
	
	
	public String add(){
		try {
			if(type.equals("news")){
			News news=newsServiceI.get(id);
			String url="findnews.action?id="+id+"&pageNo=1";
			Collection collection=new Collection();
			collection.setUrl(url);
			collection.setResouceid(id);
			collection.setUserid(userid);
			collection.setTitle(news.getTitle());
			collection.setTop("0");
			collection.setType(type);
			collection.setTime(DateTimeUtil.currentDatetime());
			collectionServiceI.saveOrUpdate(collection);
			}
			else {
				Information information=informationServiceI.get(id);
				String  url="studydeatil.action?id="+id;
				Collection collection=new Collection();
				collection.setUrl(url);
				collection.setResouceid(id);
				collection.setUserid(userid);
				collection.setTitle(information.getTitle());
				collection.setTop("0");
				collection.setType(type);
				collection.setTime(DateTimeUtil.currentDatetime());
				collectionServiceI.saveOrUpdate(collection);			
			}	
			MessageHelper mh = new MessageHelper();
		 	mh.setResult(Define.S);
			setMessageHelper(mh);
			
		} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
			MessageHelper mh = new MessageHelper();
		 	mh.setResult(Define.F);
			setMessageHelper(mh);
		}
		
		return  "OK";
		
	}
	
	
	public String addShouCan(){
		try {
			//System.out.println(title);
			String titles=new String(title.getBytes("iso8859-1"), "utf-8"); 
			//System.out.println(titles);
			Collection collection=new Collection();
			String url="";
			if(type.equals("news"))
			{
				url="findnews.action?id="+resouceid+"&pageNo=1";
			}
			else{
				 url="studydeatil.action?id="+resouceid;
			}
			
			collection.setUrl(url);
			collection.setResouceid(resouceid);
			collection.setUserid(userid);
			collection.setTitle(titles);
			collection.setTop("0");
			collection.setType(type);
			collection.setTime(DateTimeUtil.currentDatetime());
			collectionServiceI.save(collection);
			
		} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		return "OK";
	}
	
	public String findShouCanList(){
		try {
			
			PageSupport<Collection> pageSupport=collectionServiceI.getpaixu(getPageNo(),userid);
			request.put("pageSupport", pageSupport);
			}
		catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
			}
		return  "OK";
		}
	
	public String moHuFind(){
		try {
			String titleString=	new String(title.getBytes("iso8859-1"), "utf-8"); 
			String likeS="%"+titleString+"%";
			PageSupport<Collection> pageSupport=collectionServiceI.getMohuPage("title", likeS);
			request.put("pageSupport", pageSupport);	
		} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		return "OK";
	}
	
	public String zhiDing(){
		try {
			Collection collection=collectionServiceI.get(id);
			String top1=collection.getTop();
			if(top1.equals("1")){
				collection.setTop("0");
			}else{
				collection.setTop("1");
			}
			
			collectionServiceI.saveOrUpdate(collection);
			MessageHelper mh = new MessageHelper();
		 	mh.setResult(top1);
			setMessageHelper(mh);
			
		} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		return  "OK";
	}
	

		
	
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public void setCollectionServiceI(CollectionServiceI collectionServiceI) {
		this.collectionServiceI = collectionServiceI;
	}
	private Map<String, Object> request;
	@Override
	public void setRequest(Map arg0) {
	
		this.request=arg0;
	}
}
