package com.imooc.sm.global;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//编码过滤器（不加任何条件直接放行）
public class EncodingFilter implements Filter{
	private String encoding = "UTF-8";
	
    public void init(FilterConfig filterConfig) throws ServletException {
    	if(filterConfig.getInitParameter("ENCODING") != null) {
    		encoding = filterConfig.getInitParameter("ENCODING");
    	}
    }

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding(encoding);
		response.setCharacterEncoding(encoding);
		chain.doFilter(request, response);
	}
	
    public void destroy() {
    	encoding = null;
    }


	
}
