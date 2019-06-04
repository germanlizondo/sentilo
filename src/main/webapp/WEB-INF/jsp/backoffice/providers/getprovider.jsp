<jsp:include page="../shared/head.jsp" />
<jsp:include page="../shared/sidenav.jsp" />
<jsp:include page="../shared/navbar.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script ></script>

<div class="container">
    <div class="row mt-5">

        <div class="col-xl-6 col-lg-6 col-md-12">
            <div class="columna" style="padding: 1em;">
                <h3 class="title">${provider.getName()}</h3>
                <br>
                <h6>${provider.getDateCreation()}</h6>
            </div>



        </div>
    </div>



</div>


<jsp:include page="../shared/footer.jsp" />