package com.hengshuo.baibx.common.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class DateUtils {
	
	public static Date getNowTime(){
		Date time=new Date();
		return time;
	}
	
	//根据年限得到到期时间
	public static Date getDaoQiTime(int year){
		Calendar c = Calendar.getInstance();
		 c.add(Calendar.YEAR, year);
		 return c.getTime();
	}
	
 public static boolean compardate(Date DATE1, Date DATE2){   	

	 
	 if (DATE1.after(DATE2)) {
		
	               //d1 在d2 之后 d1>d2 
		 		return true;
	            } 
	 		else if (DATE1.before(DATE2)) {
	 			 //d1 在d2 之前d1<d2 
	                return false;
	            }
	 		else{
	 		return false;

	 		}
	}
	
	
}
