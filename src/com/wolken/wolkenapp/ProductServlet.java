package com.wolken.wolkenapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prod")
public class ProductServlet extends HttpServlet {
	
	public ProductServlet() {
		// TODO Auto-generated constructor stub
	}
	  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		  
		  //servlet chain -data transfer from one servlet to another 
		  
		 System.out.println("post method is called");
		String mobileName = req.getParameter("mb");
		String quantity = req.getParameter("qt");
		
		req.setAttribute("mn", mobileName);//key value
		req.setAttribute("quan", quantity);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/final");
		dispatcher.forward(req, resp);
		
		
	}
	

}
