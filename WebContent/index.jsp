<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=Roboto:400,700" rel="stylesheet">
<title>Bootstrap Simple Registration Form</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">

<style type="text/css">
	body{
		color: #fff;
		background: #63738a;
		font-family: 'Roboto', sans-serif;
	}
    .form-control{
		height: 40px;
		box-shadow: none;
		color: #969fa4;
	}
	.form-control:focus{
		border-color: #5cb85c;
	}
    .form-control, .btn{        
        border-radius: 3px;
    }
	.signup-form{
		width: 400px;
		margin: 0 auto;
		padding: 30px 0;
	}
	.signup-form h2{
		color: #636363;
        margin: 0 0 15px;
		position: relative;
		text-align: center;
    }
	.signup-form h2:before, .signup-form h2:after{
		content: "";
		height: 2px;
		width: 30%;
		background: #d4d4d4;
		position: absolute;
		top: 50%;
		z-index: 2;
	}	
	.signup-form h2:before{
		left: 0;
	}
	.signup-form h2:after{
		right: 0;
	}
    .signup-form .hint-text{
		color: #999;
		margin-bottom: 30px;
		text-align: center;
	}
    .signup-form form{
		color: #999;
		border-radius: 3px;
    	margin-bottom: 15px;
        background: #f2f3f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
    }
	.signup-form .form-group{
		margin-bottom: 20px;
	}
	.signup-form input[type="checkbox"]{
		margin-top: 3px;
	}
	.signup-form .btn{        
        font-size: 16px;
        font-weight: bold;		
		min-width: 140px;
        outline: none !important;
    }
	.signup-form .row div:first-child{
		padding-right: 10px;
	}
	.signup-form .row div:last-child{
		padding-left: 10px;
	}    	
    .signup-form a{
		color: #fff;
		text-decoration: underline;
	}
    .signup-form a:hover{
		text-decoration: none;
	}
	.signup-form form a{
		color: #5cb85c;
		text-decoration: none;
	}	
	.signup-form form a:hover{
		text-decoration: underline;
	}  
</style>
</head>
<body>
<div class="signup-form">
    <form action="XuLyDangNhap" method="post">
		<h2>Đăng nhập</h2>
		<div class="form-group">
			<div class="row">
				<div class="col-xs-6"><a href="https://www.facebook.com/dialog/oauth?client_id=965814963626813&redirect_uri=https://localhost:8443/thang/action?action=loginfb"><input type="button" class="form-control btn btn-primary" name="" value="Facebook"></a></div>
				<div class="col-xs-6"><a href="https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/thang/action?action=logingg&response_type=code
    &client_id=803901185756-e0qa3h5hicn9botoesnieba078mufu9s.apps.googleusercontent.com&approval_prompt=force"><input type="button" class="form-control btn" name="" value="Google"></a></div>
			</div>        	
        </div>
        <div class="form-group">
        	<input type="email" class="form-control" name="email" placeholder="Emaill" required="required">
        </div>
		<div class="form-group">
            <input type="password" class="form-control" name="password" placeholder="Mật khẩu" required="required">
        </div>  
       <p><%
          
			if (session.getAttribute("err") != null) {
				out.print((String) session.getAttribute("err"));
				session.removeAttribute("err");
			}
		
    %></p>
		<div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block">Đăng nhập</button>
        </div>
    </form>
	<div class="text-center">Chưa có tài khoản? <a href="<%=request.getContextPath() %>/action?action=regisform">Đăng ký</a></div>
</div>


<script src="https://code.jquery.com/jquery-3.4.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.0/dist/jquery.validate.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
</body>
</html>                            