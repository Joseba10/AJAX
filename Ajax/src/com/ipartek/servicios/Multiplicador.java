package com.ipartek.servicios;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/multiplicador")
public class Multiplicador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String num = request.getParameter("num");

		if (num == null)
			num = "0";

		int n = Integer.parseInt(num);

		response.setContentType("text/plane");

		response.getWriter().println(n * 10);

	}

}
