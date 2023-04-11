<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lavender">

       <h2 align="center">${message}</h2>
    
     <table align="center" border=6 width="50%" bordercolor="black" bgcolor="skyblue"><tr ><td >
      <div align="center" >
        <form action="AddDetails.jsp"><br>
        <h1 style="border-color:black" >Hostel Entry</h1>
        <br>
        <br>
        <br>
   <button style="width:40%; height:70px;font-size:20px; background-color:lightblue;">Admission</button>
        <br> 
        <br>
        </form>
        
        <form action = "ShowDetails" method="get">
<h4>Room Details :</h4><input type="text" name = "roomno" size="10" style="height:30px;font-size:20px;background-color:lightblue;" >
       <input type="submit" value="Get Details"> 
       <br>
       <br>
       <br>
       <br>                   
       </form>
      <form action = "HostelList">
    <button>
        Hostel List
    </button>
    </form>  
      <br>
       <br>   
       </div>
      </td></tr>
     </table>
    </body>
</html>