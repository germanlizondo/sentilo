<jsp:include page="shared/head.jsp" />
<jsp:include page="shared/sidenav.jsp" />
<jsp:include page="shared/navbar.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div class="row mt-5">
        <div class="col-xl-12 col-lg-12 col-md-12 text-center">
            <div class="columna">
                <div class="table-responsive">
                    <table class="table">
                        <thead class="thead-dark">
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Name</th>
                            <th scope="col">Description</th>
                            <th scope="col">Date Creation</th>
                            <th scope="col"></th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="application" items="${applications}" varStatus="loop">

                            <tr>

                                <th scope="row">${loop.index+1}</th>
                                <td>${application.getName()}</td>
                                <td>${application.getDescription()}</td>
                                <td>${application.getCreationDate()}</td>
                                <td><a href="/backoffice/application/${application.getName()}"><button type="button" class="btn btn-warning"><i class="fas fa-eye"></i></button></a></td>

                            </tr>

                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>

            <div class="text-right" style="padding: 1em;">

                <a href="/backoffice/applications/new">
                    <button type="button" class="btn btn-primary">New</button></a>
            </div>

        </div>

    </div>

</div>
<jsp:include page="shared/footer.jsp" />