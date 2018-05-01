<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ tag language="java" import="org.huailei.util.CommonUtil" %>
<%@ tag language="java" import="org.huailei.constant.SessionKeyConst" %>
<%@ tag language="java" import="java.util.List" %>
<%@ tag language="java" import="org.huailei.dto.ActionDto" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute type="String" name="url" required="true" %>
<%@ attribute type="String" name="method" %>

<% if(CommonUtil.contains(session, url, method)) { %>
	<jsp:doBody/>
<% } %>