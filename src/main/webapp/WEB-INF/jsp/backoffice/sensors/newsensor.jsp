<%@ taglib prefix="formSensor" tagdir="/WEB-INF/tags" %>

<jsp:include page="../shared/head.jsp" />
<jsp:include page="../shared/sidenav.jsp" />
<jsp:include page="../shared/navbar.jsp"/>

<div class="container mt-5">
    <div class="row">

        <div class="col-lg-4 col-xl-4 col-md-12 col-sm-12"></div>
        <div class="col-lg-4 col-xl-4 col-md-12 col-sm-12">
            <div class="columna p5" style="padding: 2em;">
                <h3>New Sensor</h3>
                <formSensor:newSensorFormulario/>
            </div>
        </div>
        <div class="col-lg-4 col-xl-4 col-md-12 col-sm-12"></div>
    </div>

</div>

<jsp:include page="../shared/footer.jsp" />