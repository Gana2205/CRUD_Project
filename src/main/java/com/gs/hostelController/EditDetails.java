package com.gs.hostelController;

import java.io.IOException;

import com.gs.hostelDao.HostelDao;
import com.gs.hostelDetails.HostelDetails;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//Edit details of hostelers
public class EditDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());

		
		String roomno = request.getParameter("roomno");
		String id = request.getParameter("id");
		
		HostelDao db = new HostelDao();
		
		try 
		{
			HostelDetails hd = db.getDetails(id,roomno);
			
			HttpSession session = request.getSession();
			session.setAttribute("hd", hd);
			response.sendRedirect("editform.jsp");
		} 
		
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		
		
	}

	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	  {
		
		doGet(request, response);
	}

}
