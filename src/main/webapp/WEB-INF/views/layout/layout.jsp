<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!-- <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://wwww.w3.org/TR/html4/loose.dtd"> -->
 
<!-- <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> -->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<head>

<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>

<body>
<c:catch var="myException">

<!-- wrap -->
<div>

	<tiles:insertAttribute name="header" />
	
	<!-- body -->
	<div>
		<!-- wrap layout_ty1-->
		<div>
		<div>
		
			<tiles:insertAttribute name="menu" />
			
			<!-- wrap layout ty1_2-->
			<div>
				<tiles:insertAttribute name="body" />
			</div>
			
		</div>
		</div>
			
	</div>
	<!-- //body -->
	
	<!--footer area -->
	<tiles:insertAttribute name="footer" />
	<!-- //footer area -->
	
</div>
<!-- //wrap -->

</c:catch>
<c:if test="${myException != null}">
	${myException.message}	
</c:if>

</body>
</html>

