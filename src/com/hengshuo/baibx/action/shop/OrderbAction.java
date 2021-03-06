package com.hengshuo.baibx.action.shop;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;

import com.hengshuo.baibx.action.BaseAction;
import com.hengshuo.baibx.common.page.PageSupport;
import com.hengshuo.baibx.common.util.DateTimeUtil;
import com.hengshuo.baibx.common.util.Define;
import com.hengshuo.baibx.common.util.DoubleOperationUtil;
import com.hengshuo.baibx.common.util.ExceptionUtil;
import com.hengshuo.baibx.common.util.MessageHelper;
import com.hengshuo.baibx.model.Activation;
import com.hengshuo.baibx.model.Giftdetail;
import com.hengshuo.baibx.model.Orderb;
import com.hengshuo.baibx.model.Orderdetail;
import com.hengshuo.baibx.model.Userb;
import com.hengshuo.baibx.service.impl.activation.ActivationServiceI;
import com.hengshuo.baibx.service.impl.pay.PayinformationServiceI;
import com.hengshuo.baibx.service.impl.shop.GiftdetailServiceI;
import com.hengshuo.baibx.service.impl.shop.OrderbServiceI;
import com.hengshuo.baibx.service.impl.shop.OrderdetailServiceI;
import com.hengshuo.baibx.service.impl.userb.UserbServiceI;
import com.hengshuo.baibx.service.jiekou.MessageService;

public class OrderbAction extends BaseAction implements RequestAware {

	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(OrderbAction.class.getName());
	private OrderbServiceI orderbServiceI;
	private OrderdetailServiceI orderdetailServiceI;
	private GiftdetailServiceI giftdetailServiceI;
	private UserbServiceI userbServiceI;
	private Integer giftid;
	private Integer number;
	private String giftImage;
	private Double price;
	private String giftname;
	private String userid;
	private Integer orderid;
	private String name;
	private String phone;
	private String address;
	private String payment;
	private String logistics;
	private MessageHelper messageHelper;
	private ActivationServiceI activationServiceI;
	private PayinformationServiceI payinformationServiceI;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ActivationServiceI getActivationServiceI() {
		return activationServiceI;
	}

	public void setActivationServiceI(ActivationServiceI activationServiceI) {
		this.activationServiceI = activationServiceI;
	}

	public PayinformationServiceI getPayinformationServiceI() {
		return payinformationServiceI;
	}

	public void setPayinformationServiceI(
			PayinformationServiceI payinformationServiceI) {
		this.payinformationServiceI = payinformationServiceI;
	}

	public MessageHelper getMessageHelper() {
		return messageHelper;
	}

	public void setMessageHelper(MessageHelper messageHelper) {
		this.messageHelper = messageHelper;
	}

	public void setLogistics(String logistics) {
		this.logistics = logistics;
	}

	public String gouwuche() {
		request.put("userid", userid);
		return "OK";
	}

	public String wuliuyemian() {
		request.put("orderid", orderid);
		return "OK";
	}

	public String updateWuliu() {

		try {
			Orderb orderb = orderbServiceI.get(orderid);
			// String llString=new String(logistics.getBytes("iso8859-1"),
			// "utf-8");
			orderb.setLogistics(logistics);
			orderbServiceI.saveOrUpdate(orderb);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "OK";
	}

	// 后台 礼品支付列表
	public String ordeblist() {
		try {
			PageSupport<Orderb> pageSupport = orderbServiceI
					.getorderbpage(getPageNo());
			request.put("pageSupport", pageSupport);
		} catch (Exception e) {
			log.error(Define.F_MESSAGE + e.getMessage());
		}

		return "OK";
	}

	public String jiaru() {
		try {
			Giftdetail giftdetail = giftdetailServiceI.get(giftid);
			giftdetail.setNumber(number);
			giftdetail.setDisprice(price);
			giftdetail.setGiftprice(DoubleOperationUtil.mul(price, number));
			HttpSession session = ServletActionContext.getRequest()
					.getSession();
			Orderdetail orderdetail = new Orderdetail();
			orderdetail.setGiftid(giftid);
			orderdetail.setGiftname(giftname);
			orderdetail.setNumber(number);
			orderdetail.setPrice(price);
			Map<String, Object> ordt1 = (Map<String, Object>) session
					.getAttribute("ordt");

			if (ordt1 == null) {
				Map<String, Object> ordt = new HashMap<String, Object>();
				ordt.put("" + giftid, orderdetail);
				session.setAttribute("ordt", ordt);
			} else {
				ordt1.put("" + giftid, orderdetail);
				session.setAttribute("ordt", ordt1);
			}

			Map<String, Object> mapObject = (Map<String, Object>) session
					.getAttribute("Map");

			if (mapObject == null) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("" + giftid, giftdetail);
				session.setAttribute("Map", map);
			} else {
				mapObject.put("" + giftid, giftdetail);
				session.setAttribute("Map", mapObject);
			}
			Map<String, Object> xx = (Map<String, Object>) session
					.getAttribute("Map");
			double nu = 0;
			Iterator it = xx.keySet().iterator();
			while (it.hasNext()) {
				String key;
				Giftdetail value;
				key = it.next().toString();
				value = (Giftdetail) xx.get(key);
				// nu+=value.getGiftprice();
				nu = DoubleOperationUtil.add(nu, value.getGiftprice());

			}
			request.put("userid", userid);
			session.setAttribute("nu", nu);
			session.setAttribute("number", number);
			MessageHelper mh = new MessageHelper();
			mh.setResult(Define.S);
			setMessageHelper(mh);

		} catch (Exception e) {
			MessageHelper mh = new MessageHelper();
			mh.setResult(Define.F);
			setMessageHelper(mh);
			log.error(Define.F_MESSAGE + e.getMessage());
		}

		return "OK";
	}

	public String gouMai() {
		try {
			Giftdetail giftdetail = giftdetailServiceI.get(giftid);
			giftdetail.setNumber(number);
			giftdetail.setDisprice(price);
			giftdetail.setGiftprice(DoubleOperationUtil.mul(price, number));
			HttpSession session = ServletActionContext.getRequest()
					.getSession();
			Orderdetail orderdetail = new Orderdetail();
			orderdetail.setGiftid(giftid);
			orderdetail.setGiftname(giftname);
			orderdetail.setNumber(number);
			orderdetail.setPrice(price);
			Map<String, Object> ordt1 = (Map<String, Object>) session
					.getAttribute("ordt");

			if (ordt1 == null) {
				Map<String, Object> ordt = new HashMap<String, Object>();
				ordt.put("" + giftid, orderdetail);
				session.setAttribute("ordt", ordt);
			} else {
				ordt1.put("" + giftid, orderdetail);
				session.setAttribute("ordt", ordt1);
			}

			Map<String, Object> mapObject = (Map<String, Object>) session
					.getAttribute("Map");

			if (mapObject == null) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("" + giftid, giftdetail);
				session.setAttribute("Map", map);
			} else {
				mapObject.put("" + giftid, giftdetail);
				session.setAttribute("Map", mapObject);
			}
			Map<String, Object> xx = (Map<String, Object>) session
					.getAttribute("Map");
			double nu = 0;
			Iterator it = xx.keySet().iterator();
			while (it.hasNext()) {
				String key;
				Giftdetail value;
				key = it.next().toString();
				value = (Giftdetail) xx.get(key);
				// nu+=value.getGiftprice();
				nu = DoubleOperationUtil.add(nu, value.getGiftprice());

			}

			request.put("userid", userid);
			request.put("nu", nu);
			/* orderdetailServiceI.save(orderdetail); */
			request.put("number", number);
			// request.put("orderdetail", orderdetail);
		} catch (Exception e) {
			log.error(Define.F_MESSAGE + e.getMessage());
		}

		return "OK";
	}

	public String dingDan() {
		try {
			Orderb orderb = new Orderb();
			orderb.setName(name);
			orderb.setPrice(price);
			orderb.setPhone(phone);
			orderb.setAddress(address);
			orderb.setPayment(payment);
			orderb.setTime(DateTimeUtil.currentDatetime());
			orderb.setStatus(Define.PAY_STRUTS_W);
			HttpSession session = ServletActionContext.getRequest()
					.getSession();

			orderb.setUserid(userid);
			String dd = orderb.getTime();
			orderbServiceI.save(orderb);
			// 要修改
			Orderb sOrderb = orderbServiceI.findOrderb(userid, dd);

			Map<String, Object> mapObject = (Map<String, Object>) session
					.getAttribute("Map");

			Map<String, Object> xx = (Map<String, Object>) session
					.getAttribute("ordt");
			Iterator it = xx.keySet().iterator();
			while (it.hasNext()) {
				String key;
				Orderdetail value;
				key = it.next().toString();
				value = (Orderdetail) xx.get(key);
				value.setOrderid(sOrderb.getOrderid());
				orderdetailServiceI.save(value);
			}
			session.removeAttribute("ordt");
			session.removeAttribute("Map");
			session.removeAttribute("nu");
			session.removeAttribute("number");
			request.put("userid", userid);
			request.put("sOrderb", sOrderb);
			request.put("Map", mapObject);
		} catch (Exception e) {
			log.error(Define.F_MESSAGE + e.getMessage());
		}

		return "OK";
	}

	public String dingDanlist() {
		try {

			PageSupport<Orderb> pageSupport = orderbServiceI.getpaixu(
					getPageNo(), userid);
			request.put("pageSupport", pageSupport);
			request.put("userid", userid);
		} catch (Exception e) {
			log.error(Define.F_MESSAGE + e.getMessage());
		}

		return "OK";
	}

	public String orderDetail() {
		try {

			List<Orderdetail> orderdetails = orderdetailServiceI
					.findOrderdetail(orderid);
			request.put("orderdetails", orderdetails);
			Orderb orderb = orderbServiceI.get(orderid);
			request.put("orderb", orderb);
		} catch (Exception e) {
			log.error(Define.F_MESSAGE + e.getMessage());
		}

		return "OK";
	}

	public String weizhif() {

		try {
			List<Orderdetail> orderdetails = orderdetailServiceI
					.findOrderdetail(orderid);
			Orderb orderb = orderbServiceI.get(orderid);
			request.put("orderdetails", orderdetails);

			request.put("orderb", orderb);

		} catch (Exception e) {
			log.error(Define.F_MESSAGE + e.getMessage());
		}
		return "OK";
	}

	public String songyuanbao() {
		try {
			PageSupport<Orderb> pageSupport = orderbServiceI.getsonyuanbao(
					getPageNo(), userid);
			request.put("userid", userid);
			request.put("pageSupport", pageSupport);

		} catch (Exception e) {
			log.error(Define.F_MESSAGE + e.getMessage());
		}

		return "OK";
	}

	/**
	 * 确认支付
	 * 
	 * @return
	 */
	public String querenPay() {
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			// 接收Server返回的支付结果
			String merchantId = request.getParameter("merchantId");
			String version = request.getParameter("version");
			String language = request.getParameter("language");
			String signType = request.getParameter("signType");
			String payType = request.getParameter("payType");
			String issuerId = request.getParameter("issuerId");
			String paymentOrderId = request.getParameter("paymentOrderId");
			String orderNo = request.getParameter("orderNo");
			String orderDatetime = request.getParameter("orderDatetime");
			String orderAmount = request.getParameter("orderAmount");
			String payDatetime = request.getParameter("payDatetime");
			String payAmount = request.getParameter("payAmount");
			String ext1 = request.getParameter("ext1");
			String ext2 = request.getParameter("ext2");
			String payResult = request.getParameter("payResult");
			String errorCode = request.getParameter("errorCode");
			String returnDatetime = request.getParameter("returnDatetime");
			String signMsg = request.getParameter("signMsg");

			// 验签是商户为了验证接收到的报文数据确实是支付网关发送的。
			// 构造订单结果对象，验证签名。

			// [merchantId=100020091218888&version=v1.0&signType=0&payType=0&paymentOrderId=201512041718424178&orderNo=No20151204171626&orderDatetime=20151204171626&orderAmount=10&payDatetime=20151204171847&payAmount=10&payResult=1&returnDatetime=20151204121735&]

			com.allinpay.ets.client.PaymentResult paymentResult = new com.allinpay.ets.client.PaymentResult();
			paymentResult.setMerchantId(merchantId);
			paymentResult.setVersion(version);
			// paymentResult.setLanguage(language);
			paymentResult.setSignType(signType);
			paymentResult.setPayType(payType);
			// paymentResult.setIssuerId(issuerId);
			paymentResult.setPaymentOrderId(paymentOrderId);
			paymentResult.setOrderNo(orderNo);
			paymentResult.setOrderDatetime(orderDatetime);
			paymentResult.setOrderAmount(orderAmount);
			paymentResult.setPayDatetime(payDatetime);
			paymentResult.setPayAmount(payAmount);
			// paymentResult.setExt1(ext1);
			// paymentResult.setExt2(ext2);
			paymentResult.setPayResult(payResult);
			paymentResult.setErrorCode(errorCode);
			paymentResult.setReturnDatetime(returnDatetime);
			// signMsg为服务器端返回的签名值。
			paymentResult.setSignMsg(signMsg);
			// signType为"1"时，必须设置证书路径。
			String a = request.getSession().getServletContext()
					.getRealPath("/TLCert.cer");
			paymentResult.setCertPath(a);
			// paymentResult.setCertPath("/opt/conf/TLCert-test.cer");
			// 验证签名：返回true代表验签成功；否则验签失败。
			boolean verifyResult = paymentResult.verify();
			System.out.print(a);
			// System.out.print(request.getContextPath()+"/TLCert-test.cer");
			// paymentResult.setCertPath(request.getContextPath()+"/TLCert-test.cer");
			// 验签成功，还需要判断订单状态，为"1"表示支付成功。
			boolean paySuccess = verifyResult && payResult.equals("1");

			if (paySuccess) {
				String code = "";
				MessageService messageService = new MessageService();
				
				
				String queryString = "From Orderb where orNo=?";
				Object[] values = { orderNo };
				List<Orderb> sList = orderbServiceI.find(queryString, values);
				Orderb orderb = sList.get(0);
				if (orderb.getStatus().equals(Define.PAY_STRUTS_W)) {
					orderb.setStatus(Define.PAY_STRUTS_Y);
					orderbServiceI.saveOrUpdate(orderb);

					// 修改商品已售
					List<Orderdetail> orderdetails = orderdetailServiceI
							.findOrderdetail(orderb.getOrderid());
					for (Orderdetail s : orderdetails) {
						int number = s.getNumber();
						Giftdetail giftdetail = giftdetailServiceI.get(s
								.getGiftid());
						int num = giftdetail.getNumber();
						if (num >= number) {
							giftdetail.setNumber(num - number);
						}
						int sold = giftdetail.getSold();
						giftdetail.setSold(sold + number);
						giftdetailServiceI.saveOrUpdate(giftdetail);
						
						if (giftdetail.getGiftname().equals("一年激活码")) {
							code = messageService.pushACCode("1", orderb.getUserid());
						}
						if (giftdetail.getGiftname().equals("两年激活码")) {
							code = messageService.pushACCode("2", orderb.getUserid());
						}
						
						// 保存
						Activation activation = new Activation();
						activation.setAccode(code);
						activation.setFlag(Define.ACCODE_0);
						activation.setType(Define.AC_TYPE_G);
						activationServiceI.saveOrUpdate(activation);
						
					}

					int x = orderb.getPrice().intValue();

					Userb userb = userbServiceI.findUserb(orderb.getUserid());
					Integer gold = userb.getGold();
					userb.setGold(gold + x);
					userbServiceI.saveOrUpdate(userb);
					log.debug("-------------payok");
					request.setAttribute("type", "ok");
				} else {
					log.debug("-------------payyipay");
					request.setAttribute("type", "ok");
				}
			} else {
				log.debug("-------------payerror");
				request.setAttribute("type", "no");
			}

		} catch (Exception e) {
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("type", "no");
			log.error(ExceptionUtil.getStackMsg(e));
		}
		return "OK";
	}

	/**
	 * qinghui
	 * @param orderid
	 */
	// 激活码发送
	/*public String pushjihuo() {
		String code = "";
		try {
			//读取userid，orderid
			ArrayList userid=(ArrayList) orderbServiceI.findBySQL("SELECT Userid FROM orderb;", false);

			ArrayList orderid = (ArrayList) orderbServiceI.findBySQL(
					"SELECT Orderid FROM orderb WHERE Userid=" + userid.get(userid.size()-1) + ";",
					false);
			ArrayList orderd = (ArrayList) orderdetailServiceI.findBySQL(
					"SELECT Giftname FROM orderdetail WHERE Orderid="
							+ orderid.get(orderid.size() - 1) + ";", false);
			
			// 发送激活码
			MessageService messageService = new MessageService();
			//可同时发送多条激活码,但无法判断是否重复发送
			for (int i = 0; i < orderd.size()-1; i++) {
				if (orderd.get(i).equals("一年激活码")) {
					code = messageService.pushACCode("1", (String)userid.get(userid.size()-1));
				}
				if (orderd.get(i).equals("两年激活码")) {
					code = messageService.pushACCode("2", (String)userid.get(userid.size()-1));
				}
			
			//只能发送最新的一条激活码
			if (orderd.get(orderd.size() - 1).equals("一年激活码")) {
				code = messageService.pushACCode("1", (String)userid.get(userid.size()-1));
			}
			if (orderd.get(orderd.size() - 1).equals("两年激活码")) {
				code = messageService.pushACCode("2", (String)userid.get(userid.size()-1));
			}
			
			// 保存
			Activation activation = new Activation();
			activation.setAccode(code);
			activation.setFlag(Define.ACCODE_0);
			activation.setType(Define.AC_TYPE_G);
			activationServiceI.saveOrUpdate(activation);
			
		} catch (Exception e) {
			log.error(Define.F_MESSAGE + e.getMessage());
		}

		return "OK";
	}*/
	
	
	
	
	
	// 确认支付
	public String paydingDan() {
		try {

			SimpleDateFormat datetimeFormat = new SimpleDateFormat(
					"yyyyMMddHHmmss");
			String orTime = datetimeFormat.format(new Date());
			String orderDatetime = orTime;// 商户订单提交时间
			String orderNo = "No" + orderDatetime;// 商户订单号

			Orderb orderb = orderbServiceI.get(orderid);
			orderb.setOrNo(orderNo);
			orderbServiceI.saveOrUpdate(orderb);

			String orderAmount = getMoney(String.valueOf(orderb.getPrice()));// 商户订单金额
			// String payerTelephone=orderb.getUserid();//付款人电话联系方式
			String inputCharset = "1";
			String version = "v1.0";// 默认填v1.0,固定选择值：v1.0、v2.0；注意为小写字母，无特殊需求请一律填写v1.0
									// 该字段决定payType、issuerId是否参与签名
			String signType = "1";// 默认填1，固定选择值：0、1； 0表示订单上送和交易结果通知都使用MD5进行签名
									// 1表示商户用使用MD5算法验签上送订单，通联交易结果通知使用证书签名

			// String merchantId="100020091218888";//测试商户号
			// String merchantId="109020201510019";//商户号
			String merchantId = "109020201512041";
			String key = "1234567890";
			String orderCurrency = "0";// 默认为人民币;0,156表示人民币;344表示港币;840表示美元
			String payType = "0";// 支付方式 0
			// String
			// receiveUrl="http://192.168.1.203:8080/baibx/querenPay.action";//服务器接受支付结果的后台地址
			String receiveUrl = "http://www.bbxapp.com/querenPay.action";// 服务器接受支付结果的后台地址

			String orderExpireDatetime = "2";// 订单过期时间
			// String
			// urlString="http://ceshi.allinpay.com/mobilepayment/mobile/SaveMchtOrderServlet.action";
			String urlString = "https://service.allinpay.com/mobilepayment/mobile/SaveMchtOrderServlet.action";
			com.allinpay.ets.client.RequestOrder requestOrder = new com.allinpay.ets.client.RequestOrder();
			if (null != inputCharset && !"".equals(inputCharset)) {
				requestOrder.setInputCharset(Integer.parseInt(inputCharset));
			}
			requestOrder.setReceiveUrl(receiveUrl);
			requestOrder.setVersion(version);
			requestOrder.setSignType(Integer.parseInt(signType));
			requestOrder.setPayType(Integer.parseInt(payType));
			requestOrder.setMerchantId(merchantId);
			// requestOrder.setPayerTelephone(payerTelephone);
			requestOrder.setOrderNo(orderNo);
			requestOrder.setOrderAmount(Long.parseLong(orderAmount));
			requestOrder.setOrderCurrency(orderCurrency);
			requestOrder.setOrderDatetime(orderDatetime);
			requestOrder.setOrderExpireDatetime(orderExpireDatetime);
			requestOrder.setKey(key); // key为MD5密钥，密钥是在通联支付网关会员服务网站上设置。
			String strSrcMsg = requestOrder.getSrc(); // 此方法用于debug，测试通过后可注释。
			String strSignMsg = requestOrder.doSign(); // 签名，设为signMsg字段值。
			Map<String, String> map = new HashMap<String, String>();
			map.put("inputCharset", inputCharset);
			map.put("version", version);
			map.put("signType", signType);
			map.put("merchantId", merchantId);
			map.put("key", key);
			map.put("orderNo", orderNo);
			map.put("orderAmount", orderAmount);
			map.put("orderCurrency", orderCurrency);
			map.put("orderDatetime", orderDatetime);
			map.put("payType", payType);
			map.put("receiveUrl", receiveUrl);
			map.put("orderExpireDatetime", orderExpireDatetime);
			// map.put("payerTelephone", payerTelephone);
			map.put("signMsg", strSignMsg);
			List<String> keys = new ArrayList<String>(map.keySet());
			StringBuffer sbHtml = new StringBuffer();
			sbHtml.append("<form id=\"alipaysubmit\" name=\"alipaysubmit\" action=\""
					+ urlString + "\" method=\"" + "post" + "\">");
			for (int i = 0; i < keys.size(); i++) {
				String name = (String) keys.get(i);
				String value = (String) map.get(name);
				sbHtml.append("<input type=\"hidden\" name=\"" + name
						+ "\" value=\"" + value + "\"/>");
			}
			sbHtml.append("<input type=\"submit\" value=\"" + "ok"
					+ "\" style=\"display:none;\"></form>");
			sbHtml.append("<script>document.forms['alipaysubmit'].submit();</script>");

			String ss = sbHtml.toString();
			request.put("ss", ss);

		} catch (Exception e) {
			request.put("ss", "支付失败");
			log.error(Define.F_MESSAGE + e.getMessage());
		}
		return "OK";
	}

	
	
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public void setUserbServiceI(UserbServiceI userbServiceI) {
		this.userbServiceI = userbServiceI;
	}

	public void setGiftdetailServiceI(GiftdetailServiceI giftdetailServiceI) {
		this.giftdetailServiceI = giftdetailServiceI;
	}

	public void setGiftImage(String giftImage) {
		this.giftImage = giftImage;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setGiftid(Integer giftid) {
		this.giftid = giftid;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setGiftname(String giftname) {
		this.giftname = giftname;
	}

	public void setOrderbServiceI(OrderbServiceI orderbServiceI) {
		this.orderbServiceI = orderbServiceI;
	}

	public void setOrderdetailServiceI(OrderdetailServiceI orderdetailServiceI) {
		this.orderdetailServiceI = orderdetailServiceI;
	}

	public static String getMoney(String amount) {
		if (amount == null) {
			return "";
		}
		// 金额转化为分为单位
		String currency = amount.replaceAll("\\$|\\￥|\\,", ""); // 处理包含, ￥
																// 或者$的金额
		int index = currency.indexOf(".");
		int length = currency.length();
		Long amLong = 0l;
		if (index == -1) {
			amLong = Long.valueOf(currency + "00");
		} else if (length - index >= 3) {
			amLong = Long.valueOf((currency.substring(0, index + 3)).replace(
					".", ""));
		} else if (length - index == 2) {
			amLong = Long.valueOf((currency.substring(0, index + 2)).replace(
					".", "") + 0);
		} else {
			amLong = Long.valueOf((currency.substring(0, index + 1)).replace(
					".", "") + "00");
		}
		return amLong.toString();
	}

	private Map<String, Object> request;

	@Override
	public void setRequest(Map arg0) {
		// TODO Auto-generated method stub
		this.request = arg0;
	}
}
