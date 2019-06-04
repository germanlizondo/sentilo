<%@ taglib prefix="tablaAplication" tagdir="/WEB-INF/tags" %>
<jsp:include page="shared/head.jsp" />
<jsp:include page="shared/sidenav.jsp" />
<jsp:include page="shared/navbar.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div class="row mt-5">
        <div class="col-xl-12 col-lg-12 col-md-12 text-center">
            <div class="columna">

                <tablaAplication:tablaAplications/>
            </div>

            <div class="text-right" style="padding: 1em;">

                <a href="/backoffice/applications/new">
                    <button type="button" class="btn btn-primary">New</button></a>
            </div>

        </div>

    </div>

</div>
<jsp:include page="shared/footer.jsp" />