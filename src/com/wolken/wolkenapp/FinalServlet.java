package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/final")

public class FinalServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		//downcasting generic to specific
		String mobileName = (String)req.getAttribute("mn");
		String quantity = (String)req.getAttribute("quan");
		double price =  (Integer.parseInt(quantity)*7000.00);
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("Thanks for shopping with us"   +price);
		
		printWriter.flush();
		printWriter.close();
		
	}

}
