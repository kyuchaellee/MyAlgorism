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
            <!--Controller에서 request객체를 setAttribute()를 이용하여 key-value형태로 전달함 -->
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

    <!--담기 버튼 리펙토링 가능-->
    <!--list를 반복문하여 리펙토링 가능 -->
    <h1>"${list}" 출력</h1>
    <br/>
    ${list[0]}
    <br/>
    ${list[0].menuNumber}

    <br/>

    <div>
        <!--<태그 data-원하는이름="값"></태그> -->
        <div class="menuClass1" data-menu="떡볶이"  data-price="3000">
            <button class="menuName1">담기1</button>
        </div>
        <div class="menuClass2" data-menu="순대" data-price="2000">
            <button class="menuName2">담기2</button>
        </div>
        <div class="menuClass3" data-menu="튀김모듬" data-price="4000">
            <button class="menuName3">담기3</button>
        </div>
        <div class="menuClass4" data-menu="콜라" data-price="1000">
            <button class="menuName4">담기4</button>
        </div>
        <div class="menuClass5" data-menu="사이다" data-price="1000">
            <button class="menuName5">담기5</button>
        </div>

    </div>



</body>
</html>
<script>

        //console.log("${list}의 구조"+${list});

        const order =[]; // order 객체를 담을 배열 = order.jsp에서 담은 메뉴를

        let class1 = document.querySelector('.menuClass1');
        // 콜백 안의 로직 함수화하여 리펙토링해야함
        let name1 = document.querySelector('.menuName1').addEventListener('click', () => {
            console.log(class1.dataset.menu);
            console.log("class1.dataset.menu의 type : "+typeof(class1.dataset.menu))
            console.log(class1.dataset.price);
            // 1. class1.dataset.menu 와 class1.dataset.price를 객체 리터럴로 생성한다
            // 2. 객체 형태로 localstorage에 저장한다 (객체배열로 묵어서 저장하는 게 좋을지는 코드를 짜보면서 생각해보기)
            // (localstorage 저장 시 문자열만 입력 받으므로 객체를 문자열로 변환 후 localstorage에 저장한다)


            // 객체 리터럴로 전환
            const orderMenu={
                menu : class1.dataset.menu,
                price : class1.dataset.price
            }

            // 배열에 객체 리터럴 추가
            order.push(orderMenu);

            // 객체배열을 문자열로 변환
            const orderString=JSON.stringify(order);
            // 확인용
            console.log("orderString의 type : "+typeof(orderString));

            //setItem() : localstorage 객체배열 데이터(문자열로 전환된) 저장
            window.localStorage.setItem('order',orderString);

        });

        let class2 = document.querySelector('.menuClass2');
        let name2 = document.querySelector('.menuName2').addEventListener('click', () => {
            });

        let class3 = document.querySelector('.menuClass3');
        let name3 = document.querySelector('.menuName3').addEventListener('click', () => {
            });

        let class4 = document.querySelector('.menuClass4');
        let name4 = document.querySelector('.menuName4').addEventListener('click', () => {

            });

        let class5 = document.querySelector('.menuClass5');
        let name5 = document.querySelector('.menuName5').addEventListener('click', () => {
            });


        //menuName.innerHTML = menuName.dataset.menuName;
        // console.log(menuName.dataset.menuName);

        // let dataName = $("button").data("menuName");
        // console.log(dataName)  //Result : coffee


</script>
