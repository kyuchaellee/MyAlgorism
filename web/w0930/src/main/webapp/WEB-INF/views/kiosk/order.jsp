<%--
  Created by IntelliJ IDEA.
  User: pcplo
  Date: 2022-09-30
  Time: 오후 4:35
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Heroic Features - Start Bootstrap Template</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="/assets/favicon.ico" />
    <!-- Bootstrap icons-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="/css/styles.css" rel="stylesheet" />
</head>
<body>
<!-- Responsive navbar-->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container px-lg-5">
        <a class="navbar-brand" href="#!">Start Bootstrap</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                <li class="nav-item"><a class="nav-link active" aria-current="page" href="#!">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="#!">About</a></li>
                <li class="nav-item"><a class="nav-link" href="#!">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>
<!-- Header-->
<header class="py-5">
    <div class="container px-lg-5">
        <div class="p-4 p-lg-5 bg-light rounded-3 text-center">
            <div class="m-4 m-lg-5">
                <h1 class="display-5 fw-bold">A warm welcome!</h1>
                <p class="fs-4">Bootstrap utility classes are used to create this jumbotron since the old component has been removed from the framework. Why create custom CSS when you can use utilities?</p>
                <a class="btn btn-primary btn-lg" href="#!">Call to action</a>
            </div>
        </div>
    </div>
</header>
<!-- Page Content-->
<section class="pt-4">
    <div class="container px-lg-5">
        <!-- Page Features-->
    <c:forEach items="${list}" var="kiosk">
        <div class="row gx-lg-5">
            <div class="col-lg-6 col-xxl-4 mb-5">
                <div class="card bg-light border-0 h-100">
                    <div class="card-body text-center p-4 p-lg-5 pt-0 pt-lg-0">
<%--                        <div class="feature bg-primary bg-gradient text-white rounded-3 mb-4 mt-n4"><i class="bi bi-collection"></i></div>--%>
                            <div class="card" style="width: 18rem;">
                                <c:set var="menuNum"  value="${kiosk.menuNumber}"/>
                                <c:set var="menu"  value="${kiosk.menu}"/>
                                <c:set var="price"  value="${kiosk.price}"/>
                                <img src="/img/${menuNum}.jpg" class="card-img-top" alt="...">

                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item" style="display: none">${menuNum}</li>
                                    <li class="list-group-item">${menu}</li>
                                    <li class="list-group-item">${price}</li>
                                </ul>
                                <div class="card-body">
                                    <form action=`/kiosk/orderdetail?$menuNum=${menuNum}&amount=1` method="GET">
                                        <button >주문하기</button>
                                    </form>
                                    <a href="#" class="card-link">Another link</a>
                                </div>
                            </div>
                    </div>
                </div>
            </div>
            </c:forEach>

    </div>
</section>
<!-- Footer-->
<footer class="py-5 bg-dark">
    <div class="container"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2022</p></div>
</footer>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<!-- Core theme JS-->
<script src="/js/scripts.js"></script>

<script>
    let menuNum = document.getElementsByClassName('list-group-item')[0].value();
    let menu = document.getElementsByClassName('list-group-item')[1].value();
    let price = document.getElementsByClassName('list-group-item')[2].value();

    let data = {
        menuNum: menuNum,
        menu: menu,
        price: price
    }
    localStorage.setItem("1")
</script>
</body>
</html>
