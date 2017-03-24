package com.pt.web.taglib;

import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateTag extends SimpleTagSupport {
	private String dateformat;
	private long  date;
	
	public void doTag(){
		
		Writer out =getJspContext().getOut();
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(date);
		SimpleDateFormat format = new SimpleDateFormat(dateformat);
		String s = format.format(c);
		try {
			out.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getDateformat() {
		return dateformat;
	}

	public long getDate() {
		return date;
	}

	public void setDateformat(String dateformat) {
		this.dateformat = dateformat;
	}

	public void setDate(long date) {
		this.date = date;
	}

	
	

}
