<%@ page language="java" pageEncoding="UTF-8"%>
<h1>received content</h1>
<table>
    <tr>
        <td>mail:</td><td>${user.email}</td>
    </tr>
    <tr>
        <td>password:</td><td>${user.password}</td>
    </tr>
    <tr>
        <td>username:</td><td>${user.username}</td>
    </tr>
    <tr>
        <td>nickname:</td><td>${user.nickname}</td>
    </tr>
    <tr>
        <td>file name:</td><td>${file.name}</td>
    </tr>
    <tr>
        <td>original name:</td><td>${file.originalFilename}</td>
    </tr>
    <tr>
        <td>file size:</td><td>${file.size}</td>
    </tr>
</table>