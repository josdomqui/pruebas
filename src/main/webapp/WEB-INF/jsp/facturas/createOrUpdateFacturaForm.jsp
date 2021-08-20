<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="factura">
    <h2>
       Nueva Factura
    </h2>
   
        
     	<table id="productoTable" class="table table-striped">
        <thead>
        <tr>
            <th>Name</th>
            <th>Coste</th>
            <th>Descripcion</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productos.vetList}" var="producto">
            <p>producto.name</p>
            <tr>
                <td>
                    <c:out value="${producto.name}"/>
                </td>
                <td>
                    <c:out var="coste" items="${producto.coste}"/>
                </td>
                 <td>
                    <c:out var="description" items="${producto.description}"/>
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
</petclinic:layout>
