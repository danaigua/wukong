package com.zhicheng.wukongcharge.admin.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class ResponseUtils {

	private ResponseUtils() {
		
	}
	public ResponseUtils builder() {
		return new ResponseUtils();
	}
	public static void write(HttpServletResponse response, Object o) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(o.toString());
		out.flush();
		out.close();
	}
}
