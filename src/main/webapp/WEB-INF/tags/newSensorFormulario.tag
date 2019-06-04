<%@tag language="java" description="component newSensorFormulario" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
