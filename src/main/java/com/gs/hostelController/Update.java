package com.gs.hostelController;

import java.io.IOException;

import com.gs.hostelDao.HostelDao;
import com.gs.hostelDetails.HostelDetails;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//update details of hostler

public class Update extends HttpServlet 
{
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 String roomno = request.getParameter("roomno");
	      String name = request.getParameter("name");
	      String mblno = request.getParameter("mblno");
	      String occupation = request.getParameter("occupation");
	      String id = request.getParameter("id");
	      String fee =request.getParameter("fee");
	      String doj = request.getParameter("doj");
	      
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
			db.updateDetails(hd,id,mblno);
			RequestDispatcher rd = request.getRequestDispatcher("ShowDetails");
			rd.forward(request, response);
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

		 