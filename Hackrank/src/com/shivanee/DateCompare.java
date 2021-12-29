package com.shivanee;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class DateCompare {
	
	 public static void main(String []args){
         
	       try{
	            String date = "2019-01-30";
	            String cDate = "2019-02-28";
	            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	            Date actualDate = simpleDateFormat.parse(date);
	    		Date createDate = simpleDateFormat.parse(cDate);
	             
	            System.out.println("actualDate: " + actualDate);
	            System.out.println("createDate: " + createDate);
	            
	            Calendar c = Calendar.getInstance();
	            c.setTime(actualDate);
	        	   
	        	//Number of Days to add
	        	c.add(Calendar.DAY_OF_MONTH, 30);  
	        	//Date after adding the days to the given date
	        	Date newDate = (c.getTime()); 
	            System.out.println("newDate: "+newDate);
	            
	            if(actualDate.compareTo(createDate) * createDate.compareTo(newDate) >= 0) {
	                System.out.println(actualDate.compareTo(createDate));
	                System.out.println(createDate.compareTo(newDate));
	                System.out.println("Between range");
	            }
	            
	       }catch(Exception e){
	           
	       }
	     }

}
