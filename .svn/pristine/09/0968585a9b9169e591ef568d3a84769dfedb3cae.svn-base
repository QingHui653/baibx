package com.hengshuo.baibx.service.impl.shop;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.model.Orderdetail;
import com.hengshuo.baibx.model.Userb;
import com.hengshuo.baibx.service.shop.OrderdetailService;

public class OrderdetailServiceI extends BaseDao_I<Orderdetail, Serializable> implements OrderdetailService {
	private static final Logger log=Logger.getLogger(GiftdetailServiceI.class.getName());

	public OrderdetailServiceI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderdetailServiceI(Class<Orderdetail> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	public List<Orderdetail> findOrderdetail(Integer orderid) {
		Object[] values={orderid};
		String queryString="From Orderdetail where orderid=? ";
		List<Orderdetail> sList=this.find(queryString, values);	
		return sList;	
	}
	
	

}
