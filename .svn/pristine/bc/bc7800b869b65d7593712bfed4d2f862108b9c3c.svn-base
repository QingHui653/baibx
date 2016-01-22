package com.hengshuo.baibx.action.edition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.hengshuo.baibx.action.BaseAction;
import com.hengshuo.baibx.common.util.DateTimeUtil;
import com.hengshuo.baibx.common.util.Define;
import com.hengshuo.baibx.common.util.MessageHelper;
import com.hengshuo.baibx.model.Edition;
import com.hengshuo.baibx.model.Information;
import com.hengshuo.baibx.service.edition.EditionService;
import com.hengshuo.baibx.service.impl.edition.EditionServiceI;


public class EditionAction extends BaseAction {
	private static Logger log = Logger.getLogger(EditionAction.class.getName());
	private static final long serialVersionUID = 1L;
	private  EditionServiceI editionServiceI;
	private MessageHelper messageHelper;
	public MessageHelper getMessageHelper() {
		return messageHelper;
	}
	public void setMessageHelper(MessageHelper messageHelper) {
		this.messageHelper = messageHelper;
	}
	private File file;
	private String fileContentType;
	private String fileFileName;
	public void setFile(File file) {
		this.file = file;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	
	public String getFileFileName() {
		if (fileFileName!=null) {
			String a[]	=fileFileName.split("/");
			return a[2];
		}
		else {
			return fileFileName;
		}
	
	
	}
	
	
	
	public void setEditionServiceI(EditionServiceI editionServiceI) {
		this.editionServiceI = editionServiceI;
	}
	
	
	public String fhui(){
		try {
			Properties prop = new Properties();   
		    InputStream in = getClass().getResourceAsStream("/Edition.properties");   
		     prop.load(in);   
		    String  name = prop.getProperty("Name");
			MessageHelper mh=new MessageHelper();
			mh.setResult(Define.S);
			mh.setMessage(name);
			setMessageHelper(mh);
		} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		return "OK";
	}
	
	
	
	public String add(){
		try {
			Properties prop = new Properties();   
		    InputStream in = getClass().getResourceAsStream("/Edition.properties");   
		     prop.load(in);   
		    String  name = prop.getProperty("Name");
		
		  
		    Edition edition=new Edition();
			edition.setName(name);
			if(file!=null){
		  	 String root = ServletActionContext.getServletContext().getRealPath(Define.FILE_APK);
		  		 FileOutputStream fos = null;
		  		 FileInputStream fis = null;
		try {
		  		 fis = new FileInputStream(file);
		  		 fos = new FileOutputStream(root + "\\" + fileFileName);
		  		 byte[] buffer = new byte[1024];
		  		 int len = 0;
		  		 while ((len = fis.read(buffer)) > 0) {
		  		      fos.write(buffer, 0, len);
		  		  }
		  		HttpServletRequest request = ServletActionContext.getRequest(); 
		  			String url=Define.FILE_APK+"/"+fileFileName;
		  			edition.setFileaddress(url);
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
				editionServiceI.saveOrUpdate(edition);
			}	
		} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		return "OK";
		
	}
	
		public String downloadFile() throws Exception {
		     return "OK";
		  }
		public  InputStream  getDownloadFile(){
			InputStream inputStream=null;
			try {	
			String content=new String(fileFileName.getBytes("iso8859-1"), "utf-8"); 
			String a[]	=content.split("/");
		
			String url=ServletActionContext.getServletContext().getRealPath(Define.FILE_APK)+"\\"; 
			
			/*ServletActionContext.getResponse().setHeader("Content-Disposition","attachment;fileName=" +java.net.URLEncoder.encode(a[3],"UTF-8"));*/
			 inputStream = new FileInputStream(url+ a[2]);
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
	
	
	
	
	
}
