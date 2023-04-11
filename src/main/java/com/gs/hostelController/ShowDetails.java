package com.gs.hostelController;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.ServletResponse;

import com.gs.hostelDao.HostelDao;
import com.gs.hostelDetails.HostelDetails;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//show All details of hostelrs by roomno
public class ShowDetails extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
	
		String roomno = request.getParameter("roomno");
		
		HostelDao db = new HostelDao();
		 
		try
		{
		       List<HostelDetails> hd = db.showDetails(roomno);
		       
			request.setAttribute("hd",hd);
			RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
			rd.forward(request, resp);
			
						
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		
		
		
		
		
	}

	
  

}
