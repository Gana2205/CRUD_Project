package com.gs.hostelController;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.gs.hostelDao.HostelDao;
import com.gs.hostelDetails.HostelDetails;

//show all hostelrs list
public class HostelList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	
	{
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HostelDao db = new HostelDao();
		 
		try
		{
		       List<HostelDetails> hd = db.showDetails();
		       
			request.setAttribute("hd",hd);
			RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
			rd.forward(request, response);
			
						
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		
		
		
		
	}


}
