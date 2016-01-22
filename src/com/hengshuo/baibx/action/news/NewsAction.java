package com.hengshuo.baibx.action.news;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;

import com.hengshuo.baibx.action.BaseAction;
import com.hengshuo.baibx.common.page.Base64;
import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.common.util.DateTimeUtil;
import com.hengshuo.baibx.common.util.Define;
import com.hengshuo.baibx.model.News;
import com.hengshuo.baibx.model.Userb;
import com.hengshuo.baibx.service.impl.news.NewsServiceI;
import com.hengshuo.baibx.service.impl.userb.UserbServiceI;

public class NewsAction extends BaseAction implements RequestAware {
	private static Logger log = Logger.getLogger(NewsAction.class
			.getName());
	private Integer clicks;
	private String title;
	private Integer id;
	private String userid;
	private File image;
	private String referee;
	public void setReferee(String referee) {
		this.referee = referee;
	}
	public String getReferee() {
		return referee;
	}
	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}
	public Integer getClicks() {
		return clicks;
	}
	  private String imageContentType;
	  private String imageFileName;
	  public String getImageFileName() {
		return imageFileName;
	}
	  public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	  public String getImageContentType() {
		return imageContentType;
	}
	  public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}
	public void setImage(File image) {
		this.image = image;
	}
	public File getImage() {
		return image;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid() {
		return userid;
	}
	private  PageSupport pageSupport;
	private News news;
	private String content;
	private String time;
	private String top;
	private String stringid;
	private String chuchu;
	public void setChuchu(String chuchu) {
		this.chuchu = chuchu;
	}
	public void setStringid(String stringid) {
		this.stringid = stringid;
	}
	private NewsServiceI newsServiceI;
	private UserbServiceI userbServiceI;

	private static final long serialVersionUID = 1L;
	
	public String loadNews(){
		return "ok";
	}
	
	public String deleteAllNews(){
 		if(stringid.contains(","))
 		{
 		String[] ss=stringid.split(",");
 		for(String s:ss){
 			int id=Integer.parseInt(s);
 			newsServiceI.deleteByKey(id);	
 			}
 		
 		}
 		else {
 			int id=Integer.parseInt(stringid);
 			newsServiceI.deleteByKey(id);	
		}
 		return "OK";
 	}
	
	
	
	
	
	public String deleteNews(){
		newsServiceI.deleteByKey(id);
		return "ok";
	}
	
	
	public String newsDetail(){

		News news=newsServiceI.get(id);
		request.put("news", news);
		
		int clicks=news.getClicks();
		news.setClicks(clicks+1);
		newsServiceI.saveOrUpdate(news);
		
		return "ok";
	}
	
	// 根据userid 查取名片
	public String findNews(){
		if(userid!=null){
			Userb userb=userbServiceI.findUserb(userid);

			request.put("userb", userb);
		}
		News news=newsServiceI.get(id);
		request.put("news", news);
		
		int clicks=news.getClicks();
		news.setClicks(clicks+1);
		newsServiceI.saveOrUpdate(news);
		
		return "ok";
	}
	public String saveNews() throws IOException{
		if(image!=null){
		 String root = ServletActionContext.getServletContext().getRealPath(Define.IMAGES_NEWS);
	        FileOutputStream fos = null;
	        FileInputStream fis = null;
	        try {
	        	  // 建立文件上传流
	            fis = new FileInputStream(getImage());
	            // 建立文件输出流
	       
	            fos = new FileOutputStream(root + "/" + getImageFileName());
	          
	            byte[] buffer = new byte[1024];
	            int len = 0;
	            while ((len = fis.read(buffer)) > 0) {
	                fos.write(buffer, 0, len);
	            }
	            HttpServletRequest request = ServletActionContext.getRequest(); 

		       // String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ request.getContextPath()+"/images/news/"+ getImageFileName();
		        String imgurl=Define.IMAGES_NEWS+"/"+imageFileName;
		        news.setImage(imgurl);
	        }
	        catch (Exception e) {
	        	 log.error("文件上传失败"+e.getMessage());
	        } 
	        
	        finally {
	        	fos.close();
	        	fis.close();
	        } 
	        
	     
		}

			
	   //  Date time=new Date();
		news.setTime(DateTimeUtil.currentDatetime());
		news.setContent(content);
		news.setClicks(0);
		news.setTitle(title);
		news.setTop(top);
		news.setChuchu(chuchu);
		news.setReferee(referee);
		newsServiceI.save(news);
		return "ok";
	}
	public String updateNews(){
		log.debug(id);
		News newss=null;
		FileOutputStream fos = null;
		FileInputStream fis = null;
			String root = ServletActionContext.getServletContext().getRealPath(Define.IMAGES_NEWS);
		        try {
		            newss=newsServiceI.get(id);
		        	newss.setContent(content);
		    		newss.setTitle(title);
		    		newss.setReferee(referee);
		    		newss.setTop(top);
		    		newss.setChuchu(chuchu);
		    		newss.setClicks(clicks);
		    		if(image!=null){
		        	  // 建立文件上传流
		            fis = new FileInputStream(getImage());
		            // 建立文件输出流
		       
		            fos = new FileOutputStream(root + "/" + getImageFileName());
		          
		            byte[] buffer = new byte[1024];
		            int len = 0;
		            while ((len = fis.read(buffer)) > 0) {
		                fos.write(buffer, 0, len);
		            }
			        HttpServletRequest request = ServletActionContext.getRequest(); 

			    
			        
		
				       // String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ request.getContextPath()+"/images/news/"+ getImageFileName();
				        String imgurl=Define.IMAGES_NEWS+"/"+imageFileName;
				        newss.setImage(imgurl);
			        
			        
			        
			        
			  
			       
		        } 
		        } catch (Exception e) {
		          log.error("文件上传失败"+e.getMessage());
		          
		        } finally {
		        	try {
		        		if(fos!=null&&fis!=null){
						fos.close();
						fis.close();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						
					}
		        } 
		        		      			
		newsServiceI.update(newss);
		return "ok";
	}


	
	
	public String allNews(){
		//PageSupport<News> pageSupport=newsServiceI.getPage(getPageNo());
		PageSupport<News> pageSupport=newsServiceI.getpaixu(getPageNo(),12);
		
		request.put("pageSupport", pageSupport);
		return "ok";
	}
	public String jsonPage(){
	
		pageSupport=newsServiceI.getPage(getPageNo(),10);
		return "ok";
		
	}
	public void setNews(News news) {
		this.news = news;
	}
	public News getNews() {
		return news;
	}
	public PageSupport getPageSupport() {
		return pageSupport;
	}

	public void setPageSupport(PageSupport pageSupport) {
		this.pageSupport = pageSupport;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setTop(String top) {
		this.top = top;
	}
	public void setTime(String time) {
		this.time = time;
		}
	public void setNewsServiceI(NewsServiceI newsServiceI) {
	this.newsServiceI = newsServiceI;
}
	public void setUserbServiceI(UserbServiceI userbServiceI) {
		this.userbServiceI = userbServiceI;
	}

	private Map<String, Object> request;
	@Override
	public void setRequest(Map arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
	}
}
