<%@ include file="/WEB-INF/include/header.jsp" %>
<%@ include file="/WEB-INF/include/navbar.jsp" %>
<%@ include file="/WEB-INF/include/vertical-categories.jsp" %>

<c:url value="/rent/ski" var="rentURL" />

    <div class="container">
        <div class="card">
            <div class="container-fliud">
                <div class="wrapper row">
                    <div class="preview col-md-6">

                        <div class="preview-pic tab-content">
                            <div class="tab-pane active" id="pic-1"><img src="http://placehold.it/350x250" /></div>
                        </div>
                      </div>
                    <div class="details col-md-6">
                        <h3 class="product-title">${skis.company} - ${skis.model}</h3>
                         <p class="product-description">${skis.description}</p>
                        <h4 class="price">price per day: <span>12$</span></h4>
                        <h4>Day's reserved: </h4>


                        <div class="action">
                            <a href="${rentURL}/${skis.skisId}" class="btn btn-primary btn-sm" type="button">Book</a>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
