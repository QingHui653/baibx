package com.hengshuo.baibx.service.impl.userproduct;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.model.Uprelation;
import com.hengshuo.baibx.model.Userb;
import com.hengshuo.baibx.service.userproduct.UprelationService;

public class UprelationServiceI extends BaseDao_I<Uprelation, Serializable> implements UprelationService {
	
	private static final Logger log=Logger.getLogger(UprelationServiceI.class.getName());

	public UprelationServiceI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UprelationServiceI(Class<Uprelation> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	
	public List<String> findProductCode(String userid) {
		String[] values={userid};
		String queryString="Select productcode From Uprelation where userid=?";
		List<String> sList=this.find(queryString, values);
		return sList;
	}
	public List<Uprelation> findUprelation(String userid) {
		String[] values={userid};
		String queryString="From Uprelation where userid=?";
		List<Uprelation> sList=this.find(queryString, values);
		//Uprelation uprelation=sList.get;
		return sList;
	}
	
	public List<Uprelation> findUp(String userid,String code) {
		String[] values={userid,code};
		String queryString="From Uprelation where userid=? and productcode=?";
		List<Uprelation> sList=this.find(queryString, values);
		//Uprelation uprelation=sList.get;
		return sList;
	}
	
	
}
