package com.hengshuo.baibx.service.impl.edition;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.model.Admin;
import com.hengshuo.baibx.model.Edition;
import com.hengshuo.baibx.service.edition.EditionService;


public class EditionServiceI extends BaseDao_I<Edition, Serializable> implements EditionService {
	private static final Logger log=Logger.getLogger(EditionServiceI.class.getName());

	public EditionServiceI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EditionServiceI(Class<Edition> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

	public List<Edition> findAdmin(String name) throws Exception {
		
		String[] values={name};
		String queryString="From Edition where name=?";
		List<Edition> sList=this.find(queryString, values);
		return sList;

	
}
	
	
}
