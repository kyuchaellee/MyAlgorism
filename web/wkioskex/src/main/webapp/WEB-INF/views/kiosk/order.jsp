<%--
  Created by IntelliJ IDEA.
  User: pcplo
  Date: 2022-09-30
  Time: 오후 4:35
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>KIOSK</title>
</head>
<body>
    <h1>MENU LIST</h1>
    <div class="card-body">
        <table class="table">
            <thead>
            <tr>
                <th scope="col">MENU</th>
                <th scope="col">PRICE</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${list}" var="kiosk">
                <tr>
<%--                    <t scope="row">${kiosk.menu}</t>--%>
<%--                    <td><a href="/kiosk/order.jsp" <c:out value="${todo.title}"/></td>--%>
                    <td><c:out value="${kiosk.menu}"/></td>
                    <td><c:out value="${kiosk.price}"/></td>
<%--                    <td>${todo.complete?"END":"NOT YET"}</td>--%>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>

    <div>
        <!--<태그 data-원하는이름="값"></태그> -->
        <div class="menuClass" data-menu="떡볶이">
            <button class="menuName">담기1</button>
        </div>
        <div class="menuClass" data-menu="순대">
            <button class="menuName">담기2</button>
        </div>
        <div class="menuClass" data-menu="튀김">
            <button class="menuName">담기3</button>
        </div>

    </div>
</body>
</html>
<script>

        let menuClass = document.querySelector('.menuClass');
        let menuName = document.querySelector('.menuName').addEventListener('click', () => {
            console.log(menuClass.dataset.menu)
        });

        //menuName.innerHTML = menuName.dataset.menuName;
        // console.log(menuName.dataset.menuName);

        // let dataName = $("button").data("menuName");
        // console.log(dataName)  //Result : coffee


</script>
