<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="/user/acc/join" >
<div class="form-group">
    <label for="username">이름</label>
    <input type="text" class="form-control" placeholder="이름을 입력하세요." id="username">
  </div>
  
    <div class="form-group">
    <label for="pwd">비밀번호:</label>
    <input type="password" class="form-control" 
    placeholder="비밀번호를 입력하세요." id="pwd">
  </div>
  
  <div class="form-group">
    <label for="email">이메일:</label>
    <input type="email" class="form-control" placeholder="이메일을 입력하세요." id="email">
  </div>
</form>
<button id="btn-save" class="btn btn-primary">가입하기</button>
<script src="/js/user.js"></script>