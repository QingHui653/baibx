package com.hengshuo.baibx.action.shop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;

import com.hengshuo.baibx.action.BaseAction;
import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.common.util.Define;
import com.hengshuo.baibx.model.Giftdetail;
import com.hengshuo.baibx.service.impl.shop.GiftdetailServiceI;
public class GiftdetailAction extends BaseAction implements RequestAware {

	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(GiftdetailAction.class.getName());
	private GiftdetailServiceI giftdetailServiceI;
	private Integer giftid;
	private String giftname;
	private String giftImage;
	private Double giftprice;
	private Integer number;
	private Integer sold;
	private Double disprice;
	private String giftshow;
	private String giftImageContentType;
	 private String giftImageFileName;
	private String giftids;
	private String userid;
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setGiftids(String giftids) {
		this.giftids = giftids;
	}
	 public String goPage(){
			
			return "OK";
		}
	 
	 //删除礼品 
	 public String deleteGift(){
		 
		 try {
				giftdetailServiceI.deleteByKey(giftid);
				
		} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
		}
			
		 return "OK";
	 }
	 
	//批量删除礼品
	 public String deleteAllgift(){
		
		 try {
			 if(giftids.contains(","))
		 		{
		 		String[] ss=giftids.split(",");
		 		for(String s:ss){
		 			int id=Integer.parseInt(s);
		 			giftdetailServiceI.deleteByKey(id);	
		 			}
		 		
		 		}
		 		else {
		 			int id=Integer.parseInt(giftids);
		 			giftdetailServiceI.deleteByKey(id);	
				}
			 
			 
		} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		 
		 return "OK";
	 }
	 
	 //礼品详情
	 public String giftdetail(){
		 try {
			 Giftdetail giftdetail= giftdetailServiceI.get(giftid);
			 request.put("giftdetail", giftdetail);
		
			 request.put("userid", userid);
		} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		 
		 return "OK";
	 }
	 
	 //礼品列表
	 public String listGiftdetail(){
		 try {
			PageSupport<Giftdetail> pageSupport=giftdetailServiceI.getorderbpage(getPageNo());
			request.put("pageSupport", pageSupport);
	
			request.put("userid", userid);
	
		 } catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		 
		 return "OK";
	 }
	 
	 //订单返回修改有误
	 public String fHui(){
		 try {
			PageSupport<Giftdetail> pageSupport=giftdetailServiceI.getPage(getPageNo());
			request.put("pageSupport", pageSupport);
			HttpSession session=ServletActionContext.getRequest().getSession();
			session.removeAttribute("ordt");
			session.removeAttribute("Map");
			session.removeAttribute("nu");
			  session.removeAttribute("number");
		 } catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		 
		 return "OK";
	 }
	 
	 
	 
	 //添加礼品
	 public String addGift(){
		
		 Giftdetail giftdetail=new Giftdetail();
		 if (giftImage!=null) {
			 String root = ServletActionContext.getServletContext().getRealPath(Define.IMAGE_Gift);
	        FileOutputStream fos = null;
	        FileInputStream fis = null;
	        try {
	        	  // 建立文件上传流
	            fis = new FileInputStream(giftImage);
	            // 建立文件输出流
	            fos = new FileOutputStream(root + "/" + giftImageFileName);
	            byte[] buffer = new byte[1024];
	            int len = 0;
	            while ((len = fis.read(buffer)) > 0) {
	                fos.write(buffer, 0, len);
	            }
	            String path=Define.IMAGE_Gift+"/"+giftImageFileName;
	            giftdetail.setGiftImage(path);
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
		  if(giftname!=null&&giftprice!=null&&disprice!=null){
			
	        try {
				giftdetail.setType(Define.GIFT_TYPE_GIFT);
	        	giftdetail.setGiftname(giftname);
	        	giftdetail.setGiftprice(giftprice);
	        	giftdetail.setGiftshow(giftshow);
	        	giftdetail.setNumber(number);
	        	giftdetail.setSold(sold);
	        	giftdetail.setDisprice(disprice);
	        	giftdetailServiceI.save(giftdetail);
			} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
			}
	        
		 }
	        return "OK";
	 }
	 
	 //修改礼品
	 public String updateGift(){
		
		 Giftdetail giftdetail=giftdetailServiceI.get(giftid);
		 if (giftImage!=null) {
			 String root = ServletActionContext.getServletContext().getRealPath(Define.IMAGE_Gift);
	        FileOutputStream fos = null;
	        FileInputStream fis = null;
	        try {
	        	  // 建立文件上传流
	            fis = new FileInputStream(giftImage);
	            // 建立文件输出流
	            fos = new FileOutputStream(root + "/" + giftImageFileName);
	            byte[] buffer = new byte[1024];
	            int len = 0;
	            while ((len = fis.read(buffer)) > 0) {
	                fos.write(buffer, 0, len);
	            }
	            String path=Define.IMAGE_Gift+"/"+giftImageFileName;
	            giftdetail.setGiftImage(path);
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
		  if(giftname!=null&&giftprice!=null&&disprice!=null){
			
	        try {
				giftdetail.setType(Define.GIFT_TYPE_GIFT);
	        	giftdetail.setGiftname(giftname);
	        	giftdetail.setGiftprice(giftprice);
	        	giftdetail.setGiftshow(giftshow);
	        	giftdetail.setNumber(number);
	        	giftdetail.setSold(sold);
	        	giftdetail.setDisprice(disprice);
	        	giftdetailServiceI.saveOrUpdate(giftdetail);
			} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
			}
	        
		 }
	        return "OK";
	 }
	 //查询礼品
	 public String findGift(){
		 try {
		Giftdetail giftdetail =giftdetailServiceI.get(giftid);
			request.put("giftdetail", giftdetail);
		} catch (Exception e) {
			log.error(Define.F_MESSAGE+e.getMessage());
		}
		return  "OK"; 
	 }
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public void setGiftid(Integer giftid) {
		this.giftid = giftid;
	}
	public void setGiftImageContentType(String giftImageContentType) {
		this.giftImageContentType = giftImageContentType;
	}
	public void setGiftImageFileName(String giftImageFileName) {
		this.giftImageFileName = giftImageFileName;
	}
	public void setGiftname(String giftname) {
		this.giftname = giftname;
	}
	public void setGiftImage(String giftImage) {
		this.giftImage = giftImage;
	}
	public void setGiftprice(Double giftprice) {
		this.giftprice = giftprice;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public void setSold(Integer sold) {
		this.sold = sold;
	}
	public void setDisprice(Double disprice) {
		this.disprice = disprice;
	}
	public void setGiftshow(String giftshow) {
		this.giftshow = giftshow;
	}
	public void setGiftdetailServiceI(GiftdetailServiceI giftdetailServiceI) {
		this.giftdetailServiceI = giftdetailServiceI;
	}
	private Map<String, Object> request;
	@Override
	public void setRequest(Map arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
	}
		
	
}
