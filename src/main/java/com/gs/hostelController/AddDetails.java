package com.gs.hostelController;

import java.io.IOException;


import com.gs.hostelDao.HostelDao;
import com.gs.hostelDetails.HostelDetails;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//@WebServlet("/register")
//add the details into databases by taking values from the client side

public class AddDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		String roomno = req.getParameter("roomno");
	      String name = req.getParameter("name");
	      String mblno = req.getParameter("mblno");
	      String occupation = req.getParameter("occupation");
	      String id = req.getParameter("id");
	      String fee =req.getParameter("fee");
	      String doj = req.getParameter("doj");
	      
           HostelDetails hd = new HostelDetails();	
           
           hd.setRoomno(roomno);
 	       hd.setName(name);
 	       hd.setMblno(mblno);
 	       hd.setOccupation(occupation);
 		   hd.setId(id);
 		   hd.setFee(fee);
 		   hd.setDoj(doj);
 		   
 		   HostelDao db = new HostelDao();
	      try 
	      {
			  db.AddDetails(hd);
		  } 
	      catch (Exception e)
	      {
			
			e.printStackTrace();
		}
	      
		 HttpSession session =  req.getSession() ;	
		  
		 session.setAttribute("message","Succesfully added !");
		  resp.sendRedirect("homepage.jsp");
	}

}
