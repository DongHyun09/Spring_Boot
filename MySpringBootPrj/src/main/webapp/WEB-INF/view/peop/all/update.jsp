<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="update" method="post">
<input type="hidden" name="num" value="${People.num}" readonly>
<table border="1">
 <tr>
 <td>구분</td>
<td>
  <select name="dv">
    <option value="F" ${People.dv == 'F' ? 'selected' : ''}>가족</option>
    <option value="C" ${People.dv == 'C' ? 'selected' : ''}>동료</option>
    <option value="R" ${People.dv == 'R' ? 'selected' : ''}>친구</option>
    <option value="K" ${People.dv == 'K' ? 'selected' : ''}>지인</option>
  </select></td>
    </tr>
    <tr>
        <td>이름</td>
        <td><input type="text" id="name" name="name" value="${People.name}" /></td>
    </tr>
    <tr>
        <td>나이</td>
        <td><input type="text" id="age" name="age" value="${People.age}" /></td>
    </tr>
    <tr>
        <td>직업</td>
        <td> <input type="text" id="job" name="job" value="${People.job}" /></td>
    </tr>
    <tr>
        <td>관계</td>
        <td><input type="text" id="relation" name="relation" value="${People.relation}" /></td>
    </tr>
    <tr>
        <td>특징</td>
        <td><input type="text" id="forme" name="forme" value="${People.forme}" /></td>
    </tr>
 	<tr>
   	 	<td>특징2</td>
    	<td><textarea id="forme2" name="forme2">${People.forme2}</textarea></td>
</tr>
</table>
   <input type="submit" value="저장" />
</form>
<script>

</script>