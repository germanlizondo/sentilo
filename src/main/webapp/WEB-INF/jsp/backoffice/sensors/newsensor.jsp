<jsp:include page="../shared/head.jsp" />
<jsp:include page="../shared/sidenav.jsp" />
<jsp:include page="../shared/navbar.jsp"/>

<div class="container mt-5">
    <div class="row">

        <div class="col-lg-4 col-xl-4 col-md-12 col-sm-12"></div>
        <div class="col-lg-4 col-xl-4 col-md-12 col-sm-12">
            <div class="columna p5" style="padding: 2em;">
                <h3>New Sensor</h3>
                <form action="/new-sensor" method="post">
                    <div class="form-group">
                        <label for="name">Name</label>
                        <input name="name" type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Enter Name">
                    </div>
                    <div class="form-group">
                        <label for="description">Description</label>
                        <textarea disabled name="description" class="form-control" id="description" aria-describedby="emailHelp" placeholder="Enter Description"></textarea>
                    </div>

                    <button type="submit" class="btn btn-primary" id="button">Create Sensor</button>
                </form>
            </div>
        </div>
        <div class="col-lg-4 col-xl-4 col-md-12 col-sm-12"></div>
    </div>

</div>

<jsp:include page="../shared/footer.jsp" />