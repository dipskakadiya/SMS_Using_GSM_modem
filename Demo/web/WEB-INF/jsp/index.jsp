<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <%
        Integer f=Integer.parseInt(request.getParameter("flag"));
            if(f==1){
        %> 
            <script>  alert("hi send is calles "+<%=f%>);</script>
        <%  } %>
           
        <p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
        <p><i>To display a different welcome page for this project, modify</i>
            <tt>index.jsp</tt> <i>, or create your own welcome page then change
                the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
                welcome page and also update the welcome-file setting in</i>
            <tt>web.xml</tt>.</p>
        <form action="index.htm?flag=0">
            <input type="text" name="number" id="number"/>
            <input type="hidden" name="flag" value="0"/>
            <textarea id="message" name="message"></textarea>
            <input type="submit" name="action" value="send"/> 
        </form>
    </body>
</html>
