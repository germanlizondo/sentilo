<jsp:include page="shared/head.jsp" />
<jsp:include page="shared/navbar.jsp" />
<div class="container">
    <div class="row">

        <div class="col-lg-4 col-xl-4 col-md-12 col-sm-12"></div>
        <div class="col-lg-4 col-xl-4 col-md-12 col-sm-12">
            <div class="columna">
                <h3>Sign Up</h3>
            <form action="/signup" method="post">
                <div class="form-group">
                    <label for="user">User</label>
                    <input name="user" type="text" class="form-control" id="user" aria-describedby="emailHelp" placeholder="Enter User">
                </div>
                <div class="form-group">
                <label for="password">Password</label>
                <input name="password" type="password" class="form-control" id="password" placeholder="Enter Password">
            </div>

                <div class="form-group">
                    <label for="passwordCorrect">Repeat Password</label>
                    <input  name="passwordCorrect"  type="password" class="form-control" id="passwordCorrect" placeholder="Repeat Password">
                </div>

                <button type="submit" class="btn btn-primary" id="button">Sign Up</button>
            </form>
        </div>
        </div>
        <div class="col-lg-4 col-xl-4 col-md-12 col-sm-12"></div>
    </div>

</div>



<jsp:include page="shared/footer.jsp" />