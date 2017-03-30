package com.pt.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.pt.utils.DESUtils;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
	}
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		Cookie[] cookies = request.getCookies();	
		if (null==cookies) {  
            request.getRequestDispatcher("/tiles/login").forward(request, response);
            return false;
        }else {  
        	boolean flag = false;
            for(Cookie cookie : cookies){ 
            	String value = cookie.getValue();
            	 String keyString = "9AAB1D2EE004AAC3";
            	 String result = DESUtils.decrypt(value,keyString);
            	 	if (result==null)
            	 		continue;
            	    String dat = new String(result);
            	    
            	    long Desvalue =Long.parseLong(dat);
            	long time = System.currentTimeMillis()-Desvalue;
            	if(time<3000000){
            		flag = true ;
            		break;
            	}
            }
            if(!flag){
             request.getRequestDispatcher("/tiles/login").forward(request, response);
            }
            return flag;
        }
	}

}
