package com.hengshuo.baibx.action.yanshi;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.RequestAware;

import com.hengshuo.baibx.action.BaseAction;

public class YanshiAction extends BaseAction implements RequestAware {

	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(YanshiAction.class.getName());
	private String url;
	
	public String imagePage(){
		//images\product\xinli\yanshi\tiaokuan\huomianzhongji12
		//product/xinli/yanshi/tiaokuan/huomianzhongji12/1.jpg
		request.put("url", url);
		
		return "OK";
	}
	public String videoPage(){
  		request.put("url", url);
  		return "OK";
  		
  	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void setUrl(String url) {
		this.url = url;
	}
	private Map<String, Object> request;
	@Override
	public void setRequest(Map arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
	}
	
}
