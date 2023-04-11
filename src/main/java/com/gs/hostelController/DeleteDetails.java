package com.gs.hostelController;

import java.io.IOException;

import com.gs.hostelDao.HostelDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//delete details of hostler from database by the given id 

public class DeleteDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String id = request.getParameter("id");
		int sno =Integer.parseInt( request.getParameter("sno"));
		
		
		HostelDao db = new HostelDao();
		
		try 
		{
			db.delete(id,sno);
			
			RequestDispatcher rd = request.getRequestDispatcher("ShowDetails");
			rd.forward(request, response);
		}
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		
	}

}
