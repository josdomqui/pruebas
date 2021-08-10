<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="factura">
    <h2>
        <c:if test="${factura['new']}">Nueva </c:if> Factura
    </h2>
   
        
     	<table id="productoTable" class="table table-striped">
        <thead>
        <tr>
            <th>Name</th>
            <th>Coste</th>
            <th>Descrip</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productos}" var="producto">
            <tr>
                <td>
                    <c:out value="${producto.name}"/>
                </td>
                <td>
                    <c:forEach var="description" items="${producto.description}">
                    
                    </c:forEach>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <c:choose>
                    <c:when test="${factura['new']}">
                        <button class="btn btn-default" type="submit">Add Factura</button>
                    </c:when>
                    <c:otherwise>
                        <button class="btn btn-default" type="submit">Update Factura</button>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </form:form>
</petclinic:layout>
