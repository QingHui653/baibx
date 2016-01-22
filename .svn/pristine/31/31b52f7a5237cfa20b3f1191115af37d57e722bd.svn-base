package com.hengshuo.baibx.service.impl.userproduct;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.model.Product;
import com.hengshuo.baibx.model.Uprelation;
import com.hengshuo.baibx.service.userproduct.ProductService;

public class ProductServiceI extends BaseDao_I<Product, Serializable> implements ProductService {
	private static final Logger log=Logger.getLogger(ProductServiceI.class.getName());

	public ProductServiceI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductServiceI(Class<Product> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	public Product findProduct(String productcode) {
		String[] values={productcode};
		String queryString="From Product where productcode=?";
		List<Product> sList=this.find(queryString, values);
		Product product=sList.get(0);
		return product;
	}
	
	
	
}
