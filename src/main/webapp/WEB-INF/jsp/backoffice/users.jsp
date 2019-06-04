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
                    <th scope="col">Email</th>
                    <th scope="col">Role</th>
                    <th scope="col">Date Creation</th>
                    <th scope="col"></th>

                </tr>
                </thead>
                <tbody>
                <c:forEach var="user" items="${users}" varStatus="loop">
                    <tr>
                        <th scope="row">${loop.index+1}</th>
                        <td>${user.getName()}</td>
                        <td>${user.getEmail()}</td>
                        <td>${user.getRole()}</td>
                        <td>${user.getDataCreate()}</td>
                        <td>
                            <form action="/backoffice/users/delete/${user.getName()}" method="POST">
                                <button type="submit" class="btn btn-danger"><i class="fas fa-trash-alt"></i></button>
                            </form>

                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
                </div>
            </div>
        </div>

    </div>

</div>
<jsp:include page="shared/footer.jsp" />