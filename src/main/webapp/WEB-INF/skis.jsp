<%@ include file="/WEB-INF/include/header.jsp" %>
<%@ include file="/WEB-INF/include/navbar.jsp" %>
<%@ include file="/WEB-INF/include/vertical-categories.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="/ski/show-details" var="detailsURL" />

<c:forEach var="skis" items="${skisList}">
<div class="container" style="margin-left: 170px" >
    <div class="row">
        <div class="well">
            <h1 class="text-center">${skis.company}</h1>
            <div class="list-group">
                <a href="${detailsURL}/${skis.skisId}" class="list-group-item">
                    <div class="media col-md-3">
                        <figure class="pull-left">
                            <img class="media-object img-rounded img-responsive"  src="${skis.photo}" alt="" >
                        </figure>
                    </div>
                    <div class="col-md-6">
                        <h4 class="list-group-item-heading"> ${skis.model} </h4>
                        <p class="list-group-item-text"> ${skis.description} </p>

                    </div>
                    <div class="col-md-3 text-center">
                        <h2> 12 <small> $ </small></h2>

                    </div>
                </a>
            </div>
        </div>
    </div>
</div>
</c:forEach>






