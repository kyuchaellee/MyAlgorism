<%--
  Created by IntelliJ IDEA.
  User: pcplo
  Date: 2022-10-03
  Time: 오후 4:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>주문확인내역</title>
</head>
<body>
<h1>주문 확인 내역</h1>
<!--localstorage를 통해 객체 불러오고, 배열을 통해 반복문을 돌려 출력한다-->

    {orderGetArr}


<script>

    //getItem() : localstorage에서 값 호출
    const orderGetString=window.localStorage.getItem('order');

    const orderGetArr= JSON.parse(orderGetString);

    console.log(orderGetArr);
    console.log("orderGetArr의 type : "+typeof(orderGetArr));

</script>
</body>
</html>
