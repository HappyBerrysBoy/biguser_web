<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		<title>login view</title>
	</head>

<script language="JavaScript" src="<c:url value="/resources/js/jquery-1.4.min.js" />"></script> 
<script language="JavaScript" src="<c:url value="/resources/js/json.min.js" />"></script>
<script language="JavaScript" src="<c:url value="/resources/js/common.js" />"></script>
	
<script>
var aa = $.ajax({
	  url: "http://www.daum.net",
	  cache: false
	})
	  .done(function( html ) {
	    $( "#results" ).append( html );
	  });
	  
	  
function test(){
	alert('gogo');
	alert('aa' + aa);
	var dd = $.ajax({
		  url: "http://www.daum.net",
		  cache: false
		})
		  .done(function( html ) {
		    $( "#results" ).append( html );
		  });
	alert(dd);
}
</script>	
<body>
	${A}
	<input type="button" onclick="javascript:test()" value="Ajax Test">
</body>
</html>