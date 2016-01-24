package com.hengshuo.baibx.service.impl.message;

import java.io.Serializable;

import com.hengshuo.baibx.dao.impl.BaseDao_I;
import com.hengshuo.baibx.model.Message;
import com.hengshuo.baibx.service.message.MessageService;

public class MessageServiceI extends BaseDao_I<Message, Serializable> implements MessageService{

	public MessageServiceI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageServiceI(Class<Message> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	
}
