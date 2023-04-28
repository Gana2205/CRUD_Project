package com.gs.hostelDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gs.hostelDetails.HostelDetails;

public class HostelDao 
{
     String url ="jdbc:mysql://localhost:3306/gs";
	 String uname = "root";
	 String pass ="gana123";
	
	//get connection of database
	public  Connection getConnection() throws Exception
	
	{
		 Connection con=null;
		 
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 con = DriverManager.getConnection(url , uname , pass);
		 
		 return con;
		
	}

	 //insert values into database
	public void AddDetails(HostelDetails hd) throws Exception 
	
	{
		String sql = "insert into gs.Hostelers(roomno,name,mblno,occupation,id,fee,doj) values (?,?,?,?,?,?,?);"; 
		
		Connection con = getConnection();
		PreparedStatement p = con.prepareStatement(sql);
		
	     p.setString(1,hd.getRoomno());
    	 p.setString(2,hd.getName());
    	 p.setString(3,hd.getMblno());
    	 p.setString(4,hd.getOccupation());
    	 p.setString(5,hd.getId());
    	 p.setString(6,hd.getFee());
    	 p.setString(7,hd.getDoj());
    	 
    	 
    	 int c = p.executeUpdate();
    	 
    	 System.out.println(c +" /rows effected");
		
	}
	
	 //shows list of hostelers by roomno
	public List<HostelDetails> showDetails(String roomno) throws Exception 
	
	{
		
		String sql = "select * from hostelers where roomno="+roomno;
		Connection con = getConnection();
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		
		List<HostelDetails> list = new ArrayList<HostelDetails>();
		
		while(rs.next()) 
		{
			HostelDetails hd = new HostelDetails();
			  hd.setSno(rs.getInt("sno"));
			  hd.setRoomno(rs.getString("roomno"));
		      hd.setName(rs.getString("name"));
		      hd.setMblno(rs.getString("mblno"));
		      hd.setOccupation(rs.getString("occupation"));
			  hd.setId(rs.getString("id"));
			  hd.setFee(rs.getString("fee"));
			  hd.setDoj(rs.getString("doj"));
			  list.add(hd);
		}
		
		return list;
	}

	//delete details from database
	public void delete(String id,int sno) throws Exception
	{
		
		String sql = "delete from hostelers where id=? and sno=?";
		Connection con = getConnection();
		PreparedStatement p = con.prepareStatement(sql);
		p.setString(1,id);
		p.setInt(2, sno);
		int c = p.executeUpdate(); 
		
	}

    //update hosteler details
	public void updateDetails(HostelDetails hd , String id ,String mblno) throws Exception
	{
		String sql= "update hostelers set roomno =?,name=?,mblno=?,"
				            + " occupation=?, id=?, fee=?, doj=? "
				            + "where id='"+id+"' or mblno="+mblno;
		Connection con = getConnection();
		
		PreparedStatement p = con.prepareStatement(sql);
		
		 p.setString(1,hd.getRoomno());
    	 p.setString(2,hd.getName());
    	 p.setString(3,hd.getMblno());
    	 p.setString(4,hd.getOccupation());
    	 p.setString(5,hd.getId());
    	 p.setString(6,hd.getFee());
    	 p.setString(7,hd.getDoj());
    	 
    	 
    	 int c = p.executeUpdate();
    	 
    	 System.out.println(c+"  /rows effected");
		
	}
   
	//get details by id ,roono
	public HostelDetails getDetails(String id, String roomno) throws Exception 
	{
		String sql = "select * from hostelers where id="+id;
		
		Connection con = getConnection();
		Statement st = con.createStatement();
		 
       	ResultSet rs = st.executeQuery(sql);
		
		HostelDetails hd = new HostelDetails();
		
		while(rs.next()) 
		{
			  hd.setRoomno(rs.getString("roomno"));
		      hd.setName(rs.getString("name"));
		      hd.setMblno(rs.getString("mblno"));
		      hd.setOccupation(rs.getString("occupation"));
			  hd.setId(rs.getString("id"));
			  hd.setFee(rs.getString("fee"));
			  hd.setDoj(rs.getString("doj"));
			  
		}
		
		return hd;
		
	}

	//retrieve all hostelers details
	public List<HostelDetails> showDetails() throws Exception
	{
		
		String sql = "select * from hostelers";
		Connection con = getConnection();
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		
		List<HostelDetails> list = new ArrayList<HostelDetails>();
		
		while(rs.next()) 
		{
			HostelDetails hd = new HostelDetails();
			  hd.setSno(rs.getInt("sno"));
			  hd.setRoomno(rs.getString("roomno"));
		      hd.setName(rs.getString("name"));
		      hd.setMblno(rs.getString("mblno"));
		      hd.setOccupation(rs.getString("occupation"));
			  hd.setId(rs.getString("id"));
			  hd.setFee(rs.getString("fee"));
			  hd.setDoj(rs.getString("doj"));
			  list.add(hd);
			  
		}
		
		
		return list;
		
	}
	
		
}
