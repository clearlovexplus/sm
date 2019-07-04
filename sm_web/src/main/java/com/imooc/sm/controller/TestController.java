package com.imooc.sm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
// /test/*.do
@Controller("testcontroller")
public class TestController {
	//	/test/show.do
	public void show(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("NAME", "wukai");
		request.getRequestDispatcher("../show.jsp").forward(request, response);
	}
}
