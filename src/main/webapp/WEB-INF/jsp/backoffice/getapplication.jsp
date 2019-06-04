<jsp:include page="shared/head.jsp" />
<jsp:include page="shared/sidenav.jsp" />
<jsp:include page="shared/navbar.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div class="row mt-5">

        <div class="col-xl-6 col-lg-6 col-md-12">
            <div class="columna" style="padding: 1em;">
              <h3 class="title">${app.getName()}</h3>
                <br>
                <h6>${app.getDescription()}</h6>
                <h6>${app.getCreationDate()}</h6>
            </div>



        </div>
        <div class="col-xl-6 col-lg-6 col-md-12">
            <div class="columna">
                <div class="table-responsive">
                    <table class="table">
                        <thead class="thead-dark">
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Provider</th>
                            <th scope="col">Type</th>

                        </tr>
                        </thead>
                        <tbody>
                        <c:choose>
                            <c:when test="${app.getPermissions().size() == 0}">
                                <tr>
                                    <th>
                                        <p>There are no permissions!</p>

                                    </th>
                                </tr>

                            </c:when>
                            <c:otherwise>
                                <c:forEach var="permiso" items="${app.getPermissions()}" varStatus="loop">


                                    <tr>

                                        <th scope="row">${loop.index+1}</th>
                                        <td>${permiso.getProvider().getName()}</td>
                                        <td>${application.getType()}</td>

                                    </tr>

                                </c:forEach>
                                <br />
                            </c:otherwise>
                        </c:choose>


                        </tbody>
                    </table>
                </div>
            </div>



        </div>
    </div>
    <div class="text-right" style="padding: 2em;">
        <a href="/backoffice/application/${app.getName()}/addpermissions">  <button type="button" class="btn btn-success"><i class="fas fa-plus"></i>&nbsp;Permission</button></a>
        <button type="button" class="btn btn-warning">Edit</button>
        <button type="button" class="btn btn-danger">Delete</button>
    </div>
</div>
<jsp:include page="shared/footer.jsp" />