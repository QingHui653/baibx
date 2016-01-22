package com.hengshuo.baibx.action.study;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.hengshuo.baibx.model.Userb;
import com.hengshuo.baibx.service.impl.news.NewsServiceI;
import com.hengshuo.baibx.service.impl.study.InformationServiceI;
import com.hengshuo.baibx.service.impl.userb.UserbServiceI;


public class InformationAction extends BaseAction implements RequestAware{

	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(InformationAction.class.getName());
	private InformationServiceI informationServiceI;
	private NewsServiceI newsServiceI;
	private UserbServiceI userbServiceI;
	private File file;
	private Integer id;
	private String url;



	public void setUrl(String url) {
		this.url = url;
	}
	
	private  PageSupport pageSupport;
	  private String fileContentType;
	  private String userid;
	  private String fileFileName;
	  private String type;
	  private String title;
	  private String referee;
	  private Integer clicks;
	  private String top;
	  private String content;
	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}
	  public void setContent(String content) {
		this.content = content;
	}
	 private String ids;
	 public void setIds(String ids) {
		this.ids = ids;
	}
	  
	
	  public void setUserid(String userid) {
		this.userid = userid;
	}
	  public void setId(Integer id) {
		this.id = id;
	}
	
	  public void setTop(String top) {
		this.top = top;
	}
	  
	  	public String uploadPage(){
	  		return "OK";
	  	}
	  	
	  	//模糊查询
		public String moHuFind(){
			try {
				String titleString=	new String(title.getBytes("iso8859-1"), "utf-8"); 
				String likeS="%"+titleString+"%";
				PageSupport<Information> pageSupport=informationServiceI.getMohuPage("title", likeS);
				request.put("pageSupport", pageSupport);	
			} catch (Exception e) {
				log.error(Define.F_MESSAGE+e.getMessage());
			}
			return "OK";
		}
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	//后台资料修改页面
	  	public String studyDetailPage(){
		  	try {
					Information information= informationServiceI.get(id);
					request.put("information", information);
					} catch (Exception e) {
						log.error(Define.F_MESSAGE+e.getMessage());
					}
		  		
		  		return  "OK";
		  	}
		  	
	  	
	  	
	  	
		//批量删除资料
		 public String deleteAllstudy(){
			
			 try {
				 if(ids.contains(","))
			 		{
			 		String[] ss=ids.split(",");
			 		for(String s:ss){
			 			int id=Integer.parseInt(s);
			 			informationServiceI.deleteByKey(id);	
			 			}
			 		
			 		}
			 		else {
			 			int id=Integer.parseInt(ids);
			 			informationServiceI.deleteByKey(id);	
					}
				 
				 
			} catch (Exception e) {
				// TODO: handle exception
			}
			 
			 return "OK";
		 }
	  	
	  	
	  	
	  	
	  	 //删除资料 
		 public String deleteStudy(){
			 
			 try {
					informationServiceI.deleteByKey(id);
					
			} catch (Exception e) {
				// TODO: handle exception
			}
				
			 return "OK";
		 }
	  	
	  	
	  	public String studyDetail(){
		  	try {
					Information information= informationServiceI.get(id);
					request.put("information", information);
					Integer click=information.getClicks();
					information.setClicks(click+1);
					informationServiceI.saveOrUpdate(information);
					
				
					} catch (Exception e) {
						log.error(Define.F_MESSAGE+e.getMessage());
					}
		  		
		  		return  "OK";
		  	}
		  	
	  	
	  
	  
	  	public String findZiLiaoDetail(){
	  	try {
				Information information= informationServiceI.get(id);
				Integer click=information.getClicks();
				information.setClicks(click+1);
				informationServiceI.saveOrUpdate(information);
				request.put("information", information);
			
			
				if(userid!=null){
					Userb userb=userbServiceI.findUserb(userid);
					request.put("userb", userb);
					}
				} catch (Exception e) {
					log.error(Define.F_MESSAGE+e.getMessage());
				}
	  		
	  		return  "OK";
	  	}
	  	
		public String news(){
			try {
				
				PageSupport<News> pageSupport=newsServiceI.getpaixu(getPageNo(),6);
				PageSupport<Information> pageSupport1=informationServiceI.getpaixu(getPageNo(),null,6);
				PageSupport<Information> pageSupport2=informationServiceI.getpaixu(2,null,6);
  				request.put("inforPage1", pageSupport1);
  				request.put("inforPage2", pageSupport2);
				request.put("newsPage", pageSupport);
					
			} catch (Exception e) {
				// TODO: handle exception
			}
			return "ok";
			
		}
	  	
	  	
/*	  		public String ziLiaoListJson(){
	  			try {
	  				pageSupport=informationServiceI.getPage(getPageNo(), type,4);
	  		  		
				} catch (Exception e) {
					log.error(Define.F_MESSAGE+e.getMessage());
				}
	  			return "OK";
	  		}*/
	  		
	  
	  		
	  	
	  	
	  		public String  findZiLiaoList(){
	  			try {
	  				//PageSupport<Information> pageSupport=informationServiceI.getPage(getPageNo(), type);
	  				PageSupport<Information> pageSupport=informationServiceI.getpaixu(getPageNo(),type,10);
	  				
	  				
	  				request.put("pageSupport", pageSupport);
	  				request.put("type", type);
	  				//request.put("userid", userid);
				} catch (Exception e) {
					log.error(Define.F_MESSAGE+e.getMessage());
				}
	  			return "OK";
	  		}
	  	
	  	//修改
	  	  	public String updateStudy(){
		  		try {
		  			Information information=informationServiceI.get(id);
			  		if(file!=null){
			  			 String root = ServletActionContext.getServletContext().getRealPath(Define.FILE_STUDY);
			  		        FileOutputStream fos = null;
			  		        FileInputStream fis = null;
			  		        try {
			  		        	  // 建立文件上传流
			  		            fis = new FileInputStream(file);
			  		            // 建立文件输出流
			  		          System.out.println(fileFileName);
			  		           fos = new FileOutputStream(root + "/" + fileFileName);
			  		          
			  		            byte[] buffer = new byte[1024];
			  		            int len = 0;
			  		            while ((len = fis.read(buffer)) > 0) {
			  		                fos.write(buffer, 0, len);
			  		            }
			  		            HttpServletRequest request = ServletActionContext.getRequest(); 

			  			        //String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ request.getContextPath()+"/images/study/"+ contentFileName;
			  			      String url=Define.FILE_STUDY+"/"+fileFileName;
			  			        information.setFile(url);
			  		        }
			  		        catch (Exception e) {
			  		        	 log.error("文件上传失败"+e.getMessage());
			  		        } 
			  		        
			  		        finally {
			  		        	try {
					        		if(fos!=null&&fis!=null){
									fos.close();
									fis.close();
									}
								} catch (IOException e) {
									
									log.error("文件流关闭失败"+e.getMessage());
								}	
			  		        } 
			  			}	
			  		information.setId(id);
			  		   information.setClicks(clicks);
			  		   information.setTop(top);
			  		   
			  		   information.setType(type);
			  		   information.setTitle(title);
			  		   information.setReferee(referee);
			  		   information.setContent(content);
			  		informationServiceI.saveOrUpdate(information);
		  			
				} catch (Exception e) {
					log.error(Define.F_MESSAGE+e.getMessage());
				}
		  		
		  			return  "OK";
		  	}
	  		
	  		
	  		
	  		
	  	//添加
	  	public String fileUpload(){
	  		try {
	  			Information information=new Information();
		  		if(file!=null){
		  			 String root = ServletActionContext.getServletContext().getRealPath(Define.FILE_STUDY);
		  		        FileOutputStream fos = null;
		  		        FileInputStream fis = null;
		  		        try {
		  		        	  // 建立文件上传流
		  		            fis = new FileInputStream(file);
		  		            // 建立文件输出流
		  		       
		  		         /*   fos = new FileOutputStream(root + "\\" + fileFileName);*/
		  		          
		  		          System.out.println(fileFileName);
	
		  		   
		  		            fos = new FileOutputStream(root + "/" + fileFileName);
		  		            
		  		            
		  		            byte[] buffer = new byte[1024];
		  		            int len = 0;
		  		            while ((len = fis.read(buffer)) > 0) {
		  		                fos.write(buffer, 0, len);
		  		            }
		  		            HttpServletRequest request = ServletActionContext.getRequest(); 

		  			        //String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ request.getContextPath()+"/images/study/"+ contentFileName;
		  			      String url=Define.FILE_STUDY+"/"+fileFileName;
		  			        information.setFile(url);
		  		        }
		  		        catch (Exception e) {
		  		        	 log.error("文件上传失败"+e.getMessage());
		  		        } 
		  		        
		  		        finally {
		  		        	try {
				        		if(fos!=null&&fis!=null){
								fos.close();
								fis.close();
								}
							} catch (IOException e) {
								
								log.error("文件流关闭失败"+e.getMessage());
							}	
		  		        } 
		  			}	
		  		   information.setClicks(0);
		  		   information.setTop(top);
		  		   information.setTime(DateTimeUtil.currentDatetime());
		  		   information.setType(type);
		  		   information.setTitle(title);
		  		   information.setReferee(referee);
		  		   information.setContent(content);
		  		informationServiceI.save(information);
	  			
			} catch (Exception e) {
				log.error(Define.F_MESSAGE+e.getMessage());
			}
	  		
	  			return  "OK";
	  	}
	  	
	  	public String downloadFile() throws Exception {
	  		     return "OK";
	  		  }
	  	
	  		public  InputStream  getDownloadFile(){
	  			InputStream inputStream=null;
	  			try {	
	  			String content=new String(fileFileName.getBytes("iso8859-1"), "utf-8"); 
	  			String a[]	=content.split("/");
	  		
	  			String url=ServletActionContext.getServletContext().getRealPath(Define.FILE_STUDY)+"/"; 
	  			
	  			/*ServletActionContext.getResponse().setHeader("Content-Disposition","attachment;fileName=" +java.net.URLEncoder.encode(a[3],"UTF-8"));*/
	  			 inputStream = new FileInputStream(url+ a[3]);
	  					     	return inputStream;
				} catch (Exception e) {
					log.error(Define.F_MESSAGE+e.getMessage());
					return  null;
				}
	 /* 			finally{
	  				
	  					try {
	  						if(inputStream!=null){
							inputStream.close();
	  						}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						
	  				}
	  			
	  				
	  			}*/
	  	}
	  	
	  
	  	public String getFileFileName() {
	  		if (fileFileName!=null) {
	  			String a[]	=fileFileName.split("/");
				return a[3];
			}
	  		else {
				return fileFileName;
			}
	  		
			
		}
	
	  		

		public PageSupport getPageSupport() {
			return pageSupport;
		}
	  	public void setPageSupport(PageSupport pageSupport) {
			this.pageSupport = pageSupport;
		}
	  public void setUserbServiceI(UserbServiceI userbServiceI) {
		this.userbServiceI = userbServiceI;
	}
	  
	  public void setReferee(String referee) {
		this.referee = referee;
	}
	  public void setTitle(String title) {
		this.title = title;
	}
	  public void setType(String type) {
		this.type = type;
	}
	  public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	  
	
	  public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	  
	  
	  public void setFile(File file) {
		this.file = file;
	}
	  
	

	  public  File getFile() {
		  return file;
		  }
	
	
	
	public void setNewsServiceI(NewsServiceI newsServiceI) {
		this.newsServiceI = newsServiceI;
	}
	
	public void setInformationServiceI(InformationServiceI informationServiceI) {
		this.informationServiceI = informationServiceI;
	}
	private Map<String, Object> request;
	@Override
	public void setRequest(Map arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
	}
}
