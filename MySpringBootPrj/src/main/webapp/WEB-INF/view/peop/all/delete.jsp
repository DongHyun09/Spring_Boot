<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body>
    <h2>삭제 확인</h2>
    <p>정말로 삭제하시겠습니까?</p>
    
    <form action="delete" method="post">
        <input type="hidden" name="num" value="${People.num}">
        <input type="submit" value="확인">
        <button type="button" onclick="goBack()">취소</button>
    </form>
    
    <script>
        function goBack() {
            history.back(); // 이전 페이지로 이동
        }
    </script>
</body>