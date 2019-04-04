<jsp:include page="shared/head.jsp" />
<jsp:include page="shared/navbar.jsp" />
<div class="container">
    <div class="row">
        <div class="col-lg-4 col-xl-4 col-md-12 col-sm-12"></div>
        <div class="col-lg-4 col-xl-4 col-md-12 col-sm-12">
            <div class="columna">
                <h3>Login</h3>
                <form action="/login" method="post">
                    <div class="form-group">
                        <label for="exampleInputEmail1">User</label>
                        <input name="user" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter User">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Password</label>
                        <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Enter Password">
                    </div>

                    <button type="submit" class="btn btn-primary">Log in </button>
                </form>
            </div>
        </div>
        <div class="col-lg-4 col-xl-4 col-md-12 col-sm-12"></div>
    </div>

</div>


<jsp:include page="shared/footer.jsp" />