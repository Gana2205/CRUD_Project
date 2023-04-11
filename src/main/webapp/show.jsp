<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
 <%@page import="com.gs.hostelDetails.HostelDetails" %>  
 <%@page import="java.util.ArrayList" %> 
 <%@page import="java.util.List" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show details of hostelers</title>
</head>
  <body align ="center" >
  
      <h3>Hostelers List</h3> 
       <% List<HostelDetails> hds = (ArrayList<HostelDetails>)request.getAttribute("hd"); %>
     <h3><table border=1 align=center>
      <tr bgcolor="skyblue" >
       <th>SNo</th>
       <th><span>RoomNo</span></th>
       <th>Name</th>
       <th>MblNo</th>
       <th>Occupation</th>
       <th>Id</th>
       <th>Fee</th>
       <th>Doj</th>
       <th>Actions</th>
     </tr>
     <tr>
       <% for(HostelDetails hd : hds)
       {
    	 %>
          <td><%=hd.getSno()%></td>
          <td><%=hd.getRoomno() %></td>
          <td><%=hd.getName() %></td>
          <td><%=hd.getMblno() %></td>
          <td><%=hd.getOccupation() %></td>
          <td><%=hd.getId() %></td>
          <td><%=hd.getFee() %></td>
          <td><%=hd.getDoj() %></td>
          <td style="width:20%"><a href="Edit?id=<%=hd.getId()%>&roomno=<%=hd.getRoomno()%>">Edit</a>
          &nbsp&nbsp&nbsp&nbsp
           <a href="Delete?id=<%=hd.getId()%>&sno=<%=hd.getSno()%>&roomno=<%=hd.getRoomno()%>">Delete</a></td>
       </tr>
       <%
       }
     %>
   </table></h3>
            
     <a href="homepage.jsp" style="font-color:blue" >Go to Homepage</a>
       
  </body>
</html>