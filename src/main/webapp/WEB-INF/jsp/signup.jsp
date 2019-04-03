<jsp:include page="shared/mainpage/head.jsp" />
<jsp:include page="shared/mainpage/navbar.jsp" />
<div class="container mt-5">
    <div class="row">
        <div class="col-lg-4 col-xl-4 col-md-12 col-sm-12"></div>
        <div class="col-lg-4 col-xl-4 col-md-12 col-sm-12">
            <form action="/login" method="post">
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
        <div class="col-lg-4 col-xl-4 col-md-12 col-sm-12"></div>
    </div>

</div>

<script>
    window.onload = function () {

        var passwordCorrect = document.getElementById("passwordCorrect");
        var passwordValue = document.getElementById("password");
        var button = document.getElementById("button")

        button.disabled = true;

        passwordCorrect.addEventListener("keyup",function () {
            if(passwordValue.value == passwordCorrect.value){
                button.disabled = false;
            }else{
                button.disabled = true;
            }
        })
    }



</script>


<jsp:include page="shared/mainpage/footer.jsp" />