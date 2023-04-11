<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.gs.hostelDetails.HostelDetails" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lavender">
      <h3><%=session.getAttribute("hd")%></h3>
       <% HostelDetails hd = (HostelDetails)session.getAttribute("hd"); %>
     <table align="center" border=5 width="60%" bordercolor="black" bgcolor="lightblue"><tr ><td >
      <form action="Update" method="post">
       <div align="center" style="width:100%">
        <h1 style="text-align:center;">HOSTEL ADMISSION</h1>
         <table  style="width:70%">
   <tr>
     <td><h3>Room No :</h3></td>
     <td><input style="background-color:skyBlue;height:30px;" type="text" name="roomno" value="<%=hd.getRoomno()%>" size="40" ></td>
   </tr>
   <tr>
     <td><h3>Name :</h3></td>
     <td><input style="background-color:skyBlue;height:30px;" type="text" name="name" value="<%=hd.getName()%>" size="40"></td>
   </tr>
   <tr>
     <td><h3>Mobile No :</h3></td>
     <td><input style="background-color:skyBlue;height:30px;" type="text" name="mblno" value="<%=hd.getMblno()%>" size="40"></td>
   </tr>
   <tr>
     <td><h3>Education/Job :</h3></td>
     <td><input style="background-color:skyBlue;height:30px;" type="text" name="occupation" value="<%=hd.getOccupation()%>" size="40"></td>
     </tr>
   <tr> 
     <td><h3>Id proof :</h3></td>
     <td><input style="background-color:skyBlue;height:30px;" type="text" name="id" value="<%=hd.getId()%>" size="40"></td>
   </tr>
   <tr>
     <td><h3>Fee :</h3></td>
     <td><input style="background-color:skyblue;height:30px;" type="text" name="fee" value="<%=hd.getFee()%>" size="40"></td>
   </tr>
   <tr>
     <td><h3>DOJ :</h3></td>
     <td><input type="date" style="background-color:skyBlue;"  name="doj" value="<%=hd.getDoj()%>" ></td></tr>

   <tr>
     <td></td>
     <td align ="center"><input style="background-color:skyblue;height:30px; width:100px" type="submit" value="Update"></td></tr>
   <tr><td><br></td></tr>
        </table>
       </div>
      </form>
     </td></tr>
    </table>
  </body>
</html>