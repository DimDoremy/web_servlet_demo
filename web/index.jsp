<%--
  Created by IntelliJ IDEA.
  User: Doremy
  Date: 2020/3/18
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="col-md-offset-4 col-lg-offset-4 col-xs-offset-4"
         style="float: none;display: inline-block;vertical-align: middle;">
        <form role="form" class="form-horizontal" action="/submit">
            <div class="form-group">
                <label for="username" class="text-center">用户名：</label>
                <input type="text" id="username" name="username">
            </div>
            <div class="form-group">
                <label for="password" class="text-center">密码：</label>
                <input type="password" id="password" name="password">
            </div>
            <button type="submit" class="btn btn-default center-block">提交</button>
        </form>
    </div>
</div>
</body>
</html>
