<%@ page language="java" pageEncoding="UTF-8"%>
<h1>${message}</h1>
<form action="<%=request.getContextPath()%>/receive" method="POST" enctype="multipart/form-data">
    username: <input type="text" name="username" value="bob"/><br/>
    nickname: <input type="text" name="nickname" value="zbo"/><br/>
    password: <input type="password" name="password" value="123"/><br/>
    yourmail: <input type="text" name="email" value="zbo@123.com"/><br/>
    yourfile: <input type="file" name="file"/><br/>
    <input type="submit" value="add new user"/>
</form>