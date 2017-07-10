
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ include file="/WEB-INF/include/header.jsp" %>

<c:url value="/login" var="loginURL"/>

<c:url value="/ski-create" var="addSkisURL"/>

<nav class="navbar navbar-default">

    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Logo</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#">About Company</a></li>
                <li><a href="#">Rental Points</a></li>
                <li><a href="${addSkisURL}">Add skis</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        <div class="username">
                            Welcome,
                            <sec:authorize access="isAuthenticated()">
                                <strong><sec:authentication property="principal.username"/></strong>
                            </sec:authorize>
                        </div>
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="${loginURL}"><span class="glyphicon glyphicon-log-in"></span>Log-in</a>
                        </li>

                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>