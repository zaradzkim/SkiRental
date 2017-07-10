<%--
  Created by IntelliJ IDEA.
  User: Marcel
  Date: 2017-05-23
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/include/navbar.jsp" %>
<%@ include file="/WEB-INF/include/header.jsp" %>





<c:url value="/ski/save" var="createSkiURL"/>

<div class="container">

<div class="row">
    <form:form commandName="skis" action="${createSkiURL}" method="post" role="form" class="form-horizontal">

        <div class="form-group">
            <label class="control-label col-sm-2" for="skisId">skisId:</label>
            <div class="col-sm-6">
                <form:input path="skisId" type="text" id="skisId" class="form-control" placeholder="Enter skisId" autofocus="autofocus" />
            </div>
        </div>

    <div class="form-group">
        <label class="control-label col-sm-2" for="company">company:</label>
        <div class="col-sm-6">
            <form:input path="company" type="text" id="company" class="form-control" placeholder="Enter company" autofocus="autofocus" />
            </div>
    </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="model">model:</label>
            <div class="col-sm-6">
                <form:input path="model" type="text" id="model" class="form-control" placeholder="Enter model" autofocus="autofocus" />
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="description">description:</label>
            <div class="col-sm-6">
                <form:input path="description" type="text" id="description" class="form-control" placeholder="Enter description" autofocus="autofocus" />
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="photo">photo:</label>
            <form:input path="photo" type="file" id="photo" />
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-6">
                <button type="submit" class="btn btn-primary">Zapisz</button>
            </div>
        </div>
    </form:form>
</div>
</div>

