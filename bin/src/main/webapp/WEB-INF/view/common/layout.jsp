<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  
<%@taglib prefix="tiles" uri="http://jakarta.apache.org/struts/tags-tiles"%>
<%@taglib prefix="s" uri="http://sastruts.seasar.org" %>
<%@taglib prefix="f" uri="http://sastruts.seasar.org/functions" %>

<%@taglib  prefix="date" uri="/WEB-INF/tld/dateHelper.tld"%>
<html>
<head>
<title><tiles:getAsString name="title" /></title>
</head>
<body>
<table width="100%">
  <tr><td colspan="2"><tiles:insert page="header.jsp" /></td></tr>
  <tr>
    <td width="20%"><tiles:insert page="menu.jsp" /></td>
    <td><tiles:insert attribute="content" /></td>
  </tr>
  <tr><td colspan="2"><tiles:insert page="footer.jsp" /></td></tr>
</table>
</body>
</html>
