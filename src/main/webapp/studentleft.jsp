<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="<%=path %>/css/base.css" type="text/css" />
	<link rel="stylesheet" href="<%=path %>/css/dtree.css" type="text/css" />
	<style type="text/css">
	    div {
			padding:0px;
			margin:0px;
		}
		
		body {
		 scrollbar-base-color:#bae87c;
		 scrollbar-arrow-color:#FFFFFF;
		 scrollbar-shadow-color:#c1ea8b;
		 padding:0px;
		 margin:auto;
		 text-align:center;
		 background-color:#ffffff;
		 background:url(images/bg.gif);
		}
		
		.bitem {
		  background:url(images/side_snow.gif);
		  height:26px;
		  line-height:26px;
		  text-align:center;
		  cursor:pointer;
		  background-repeat: no-repeat;
		  margin-top:0px;
			
		}
		.title{
			margin-left:2px;
			background:url(images/menubg.gif);
			background-repeat:no-repeat;
			text-align:center;
			cursor:pointer;
			height:26px;
		  	line-height:26px;
	</style>
	<script language='javascript'>var curopenItem = '1';</script>
	<script language="javascript" type="text/javascript" src="js/menu.js"></script>
	 <base target="main" />
  </head>
  <body>
  	 <div class='bitem'>
  	    <div class='title'><tr>学生信息</tr><br></div>
  		<tr><a href='<%=path %>/FindStudentInfo' target='main'>学生信息查询</a></tr><br>
  	</div>
  
  	<div class='bitem'>
  		<div class='title'><tr >学生成绩</tr><br/></div>
  		<tr><a href='<%=path %>/FindStudentgradeInfo' target='main'>学生成绩查询</a></tr><br>
  	</div>
  	
  	<div class='bitem'>
  		<div class='title'><tr >通告</tr><br></div>
  		<tr><a href='<%=path %>/FindStudentTitleInfo' target='main'>通告信息查询</a></tr><br>
  	</div>
  	
  	<div class='bitem'>
  	    <div class='title'><tr>课程信息</tr><br></div>
  		<tr><a href='<%=path %>/FindClassInfo' target='main'>课程信息查询</a></tr><br>
  	</div>
  </body>
</html>