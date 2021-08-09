<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="facturas">
    <h2>
        <c:if test="${factura['new']}">Nueva </c:if> Factura
    </h2>
    <form:form modelAttribute="factura" class="form-horizontal" id="add-facturas-form">
        <div class="form-group has-feedback">
            <petclinic:inputField label="Fecha_Factura" name="fecha"/>   
        </div>
        
     <table id="productosTable" class="table table-striped">
        <thead>
        <tr>
            <th style="width: 150px;">Name</th>
            <th style="width: 200px;">Coste</th>
            <th style="width: 120px">Descripci�n</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${selections}" var="producto">
            <tr>
                <td>
                    <spring:url value="/productos" var="productoUrl">
                        <spring:param name="productoId" value="${productoid.}"/>
                    </spring:url>
                    <a href="${fn:escapeXml(productoUrl)}"><c:out value="${producto.name} ${producto.description}"/></a>
                </td>
                <td>
                    <c:out value="${producto.coste}"/>
                </td>
               
                
      
<!--
                <td> 
                    <c:out value="${owner.user.username}"/> 
                </td>
                <td> 
                   <c:out value="${owner.user.password}"/> 
                </td> 
-->
                
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
