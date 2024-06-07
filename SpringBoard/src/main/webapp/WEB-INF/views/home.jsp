<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8"%>

<%@ include file="include/header.jsp" %> <!--   -->
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>



<input type="button" value="버튼" class="btn-lg btn-success">
<button type="button" class="btn btn-block btn-danger btn-xs">Danger</button>
<a class="btn btn-block btn-social btn-github">
<i class="fa fa-github"></i> Sign in with GitHub
</a>

<div class="box box-info">
<div class="box-header with-border">
<h3 class="box-title">Input Addon</h3>
</div>
<div class="box-body">
<div class="input-group">
<span class="input-group-addon">@</span>
<input type="text" class="form-control" placeholder="Username">
</div>
<br>
<div class="input-group">
<input type="text" class="form-control">
<span class="input-group-addon">.00</span>
</div>
<br>
<div class="input-group">
<span class="input-group-addon">$</span>
<input type="text" class="form-control">
<span class="input-group-addon">.00</span>
</div>
<h4>With icons</h4>
<div class="input-group">
<span class="input-group-addon"><i class="fa fa-envelope"></i></span>
<input type="email" class="form-control" placeholder="Email">
</div>
<br>
<div class="input-group">
<input type="text" class="form-control">
<span class="input-group-addon"><i class="fa fa-check"></i></span>
</div>
<br>
<div class="input-group">
<span class="input-group-addon"><i class="fa fa-dollar"></i></span>
<input type="text" class="form-control">
<span class="input-group-addon"><i class="fa fa-ambulance"></i></span>
</div>
<h4>With checkbox and radio inputs</h4>
<div class="row">
<div class="col-lg-6">
<div class="input-group">
<span class="input-group-addon">
<input type="checkbox">
</span>
<input type="text" class="form-control">
</div>

</div>

<div class="col-lg-6">
<div class="input-group">
<span class="input-group-addon">
<input type="radio">
</span>
<input type="text" class="form-control">
</div>

</div>

</div>

<div class="box-footer">
<button type="submit" class="btn btn-primary">Submit</button>
</div>
</div>
</div>
<%@ include file="include/footer.jsp" %>
