<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>rest server</title>
</head>
<body>

Welcome rest server
<br/>

<a href="<%=request.getContextPath()%>/jquery_json_get.jsp">REST jQuery JSON get</a>  <br/>
<a href="<%=request.getContextPath()%>/jquery_json_for_each.jsp">REST jQuery JSON for each</a>  <br/>
<a href="<%=request.getContextPath()%>/jquery_json_post.jsp">REST jQuery JSON post</a>  <br/>

</body>
</html>