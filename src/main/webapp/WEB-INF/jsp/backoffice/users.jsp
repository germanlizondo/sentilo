<jsp:include page="shared/head.jsp" />
<jsp:include page="shared/sidenav.jsp" />
<jsp:include page="shared/navbar.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div class="row mt-5">
        <div class="col-xl-6 col-lg-6 col-md-6 text-center">
            <h1>USERS</h1>

            <c:forEach var="user" items="${users}">
                <h3>${user}</h3>
            </c:forEach>
        </div>

    </div>

</div>
<jsp:include page="shared/footer.jsp" />