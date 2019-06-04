<%@tag language="java" description="component tablaAplications" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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