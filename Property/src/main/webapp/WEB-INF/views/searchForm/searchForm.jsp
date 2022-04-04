<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<!-- �ݺ��� ����ϱ� ���� ���ù� ���� -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- http://localhost:8080/member/joinMember.jsp -->
<!doctype html>
<!-- css -->
<link rel="stylesheet" href="resources/css/searchForm.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="resources/javascript/searchForm.js"></script>

<div class="container">
	
	<div>
		<h5>���� �ݾ�</h5>
		<input type="range" id="MyRange" class="slider" value="0" min="0" max="500" name="money" style="width:28%" required><br>
		<input type="text" id="value"  name="money" required>
		<span class="input-group-text">õ����</span>
	</div>

	<div>
		<h5>���� ����</h5>
		<div class="form-check">
			<input class="form-check-input" type="radio" value="" id="flexCheckDefault1" name="direction" checked="checked">
			<label class="form-check-label" for="flexCheckDefault1">����1</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" value="" id="flexRadioDefault2" name="direction">
			<label class="form-check-label" for="flexRadioDefault2">����2</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" value="" id="flexRadioDefault3" name="direction">
			<label class="form-check-label" for="flexRadioDefault3">����3</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" value="" id="flexRadioDefault4" name="direction">
			<label class="form-check-label" for="flexRadioDefault4">����4</label>
		</div>
	</div>

	<div>
		<h5>����(����ö)</h5>
		<form action="">
			<div class="inputBox">
				<input type="text" required>
				<span>���忡�� ���� ����� ���� �Է����ּ���.</span>
			</div>
			<div class="inputBox">
				<input type="text" required>
				<span>�󸶳� Ÿ�� ���ϴ��� �Է����ּ���.</span>
			</div>
		</form>
	</div>

	<div>
		<h5>�ֺ� ������</h5>
		<div class="form-check">
		  <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked">
		  <label class="form-check-label" for="flexCheckChecked">������ġ</label>
		</div>
		<div class="form-check">
		  <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked">
		  <label class="form-check-label" for="flexCheckChecked">������Ʈ</label>
		</div>
		<div class="form-check">
		  <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked">
		  <label class="form-check-label" for="flexCheckChecked">�Ƶ�����</label>
		</div>
		<div class="form-check">
		  <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked">
		  <label class="form-check-label" for="flexCheckChecked">��Ÿ����</label>
		</div>
	</div>

	<div>
		<h5>���� ������</h5>
		<div>
			<label class="family" for="result1">1. ������</label>
			<span>
				<input class="family" type='button' onclick='count("plus1")' value='+'/>
				<span id='result1'>0</span>
				<input class="family" type='button' onclick='count("minus1")' value='-'/>
			</span>
		</div>
		<div>
			<label class="family" for="result2">2. û�ҳ�</label>
			<span>
				<input class="family" type='button' onclick='count("plus2")' value='+'/>
				<span id='result2'>0</span>
				<input class="family" type='button' onclick='count("minus2")' value='-'/>
			</span>
		</div>
		
	</div>


	 <div class="submit">
		<input type="submit" value="Ȯ��">
	 </div>
 
 </div>
</body>