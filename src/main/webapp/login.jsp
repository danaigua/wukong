<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>悟空智能充电桩后台登录</title>
<style>
body {
	background: url(static/images/banner.jpg);
	background-attachment: fixed;
	background-repeat: no-repeat;
	background-position: center;
	background-size: 100%;
}

blockquote, q {
	quotes: none;
}

blockquote:before, blockquote:after, q:before, q:after {
	content: '';
	content: none;
}

table {
	border-collapse: collapse;
	border-spacing: 0;
}
/* start editing from here */
a {
	text-decoration: none;
}

img {
	max-width: 100%;
}
/*end reset*/
/****-----start-body----****/
body {
	background-color: #0091e6;
}

h1 {
	font-size: 2.4em;
	padding-bottom: 28px;
	color: #fff;
	text-align: center;
}

h2 {
	font-size: 1.5em;
	padding-bottom: 28px;
	color: #0091e6;
	text-align: center;
}

.login {
	padding: 2em 0;
}

.inset {
	position: relative;
	background: #fff;
	padding: 2.5em;
	border-radius: 0.3em;
	-webkit-border-radius: 0.3em;
	-o-border-radius: 0.3em;
	-moz-border-radius: 0.3em;
	box-shadow: 0px 0px 15px #545454;
	width: 30%
}

form span {
	display: block;
	font-size: 1.0em;
	color: #333;
	font-weight: 400;
}

input[type="text"], input[type="password"], select {
	padding: 9px;
	width: 93.4%;
	font-size: 1.1em;
	margin: 3px 0px 25px;
	color: #666666;
	background: #f0f0f0;
	border: none;
	font-weight: 400;
	outline: none;
	-webkit-transition: all 0.3s ease-out;
	-moz-transition: all 0.3s ease-out;
	-ms-transition: all 0.3s ease-out;
	-o-transition: all 0.3s ease-out;
	transition: all 0.3s ease-out;
	border-radius: 0.2em;
	-webkit-border-radius: 0.2em;
	-o-border-radius: 0.2em;
	-moz-border-radius: 0.2em;
}

input[type="text"]:hover, input[type="Password"]:hover, #active {
	border: none;
	outline: none;
}

.sign {
	padding: 10px 0 0;
	text-align: center;
}

.submit {
	margin-right: 11px;
	background: #0091e6;
	border: none;
	outline: none;
	padding: 8px 30px;
	cursor: pointer;
	color: #FFF;
	font-size: 0.9em;
	border-radius: .3em;
	-webkit-border-radius: .3em;
	-moz-border-radius: .3em;
	-o-border-radius: .3em;
	transition: 0.5s all;
	-webkit-transition: 0.5s all;
	-moz-transition: 0.5s all;
	-o-transition: 0.5s all;
	font-weight: 600;
	margin: 0 auto;
}

.submit:hover {
	background: #C5C5C5;
}

.rzm {
	position: relative
}

.rzm img {
	position: absolute;
	top: 0px;
	right: 0px;
	height: 45px;
}

/*----start-responsive design-----*/
h1 {
	font-size: 2.2em;
}

}
@media ( max-width :991px) {
	h1 {
		font-size: 2em;
	}
}

h1 {
	font-size: 2.1em;
}

}
.inset {
	padding: 2em;
}

h1 {
	font-size: 1.9em;
}

.login {
	padding: 2em 0 0;
}
}
</style>
<script type="text/javascript">
	if (self != top) {
		parent.location.href = 'index.html';
	}
	function CheckLogin(obj) {
		if (obj.username.value == '') {
			alert('请输入用户名');
			obj.username.focus();
			return false;
		}
		if (obj.password.value == '') {
			alert('请输入密码');
			obj.password.focus();
			return false;
		}
		return true;
	}
</script>

</head>
<body>
	<div class="container" align="center">
		<div class="col-md-6" style="margin-top: 10%;">
			<div class="inset">
				<form name="login" id="login" method="post"
					action="/WukongCharge/manager/login.do"
					onSubmit="return CheckLogin(document.login);">
					<input type="hidden" name="enews" value="login">
					<div>
						<h2>悟空智能充电桩后台登录</h2>
						<span style="text-align: left; text-indent: 0.4em;"><label>账号：</label></span>
						<span><input type="text" name="adminName" class="textbox"></span>
					</div>
					<div>
						<span style="text-align: left; text-indent: 0.4em;"><label>密码：</label></span>
						<span><input name="adminPassword" type="password"
							class="password"></span>
					</div>
					<div class="sign">
						<input type="reset" class="submit" value="重置" /> <input
							type="submit" value="提交" class="submit" />
					</div>
					<div>
						<span><font color="red" id="error">${errorInfo}</font></span>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		if (document.login.equestion.value == 0) {
			showanswer.style.display = 'none';
		}
	</script>

</body>
</html>