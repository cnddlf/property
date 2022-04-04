<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<!-- 반복문 사용하기 위한 지시문 선언 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- http://localhost:8080/member/joinMember.jsp -->
<!doctype html>
<!-- css -->
<link rel="stylesheet" href="resources/css/searchForm.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="resources/javascript/searchForm.js"></script>

<div class="container">
	
	<div>
		<h5>가용 금액</h5>
		<input type="range" id="MyRange" class="slider" value="0" min="0" max="500" name="money" style="width:28%" required><br>
		<input type="text" id="value"  name="money" required>
		<span class="input-group-text">천만원</span>
	</div>

	<div>
		<h5>집의 방향</h5>
		<div class="form-check">
			<input class="form-check-input" type="radio" value="" id="flexCheckDefault1" name="direction" checked="checked">
			<label class="form-check-label" for="flexCheckDefault1">방향1</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" value="" id="flexRadioDefault2" name="direction">
			<label class="form-check-label" for="flexRadioDefault2">방향2</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" value="" id="flexRadioDefault3" name="direction">
			<label class="form-check-label" for="flexRadioDefault3">방향3</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" value="" id="flexRadioDefault4" name="direction">
			<label class="form-check-label" for="flexRadioDefault4">방향4</label>
		</div>
	</div>

	<div>
		<h5>교통(지하철)</h5>
		<form action="">
			<div class="inputBox">
				<input type="text" required>
				<span>직장에서 가장 가까운 역을 입력해주세요.</span>
			</div>
			<div class="inputBox">
				<input type="text" required>
				<span>얼마나 타길 원하는지 입력해주세요.</span>
			</div>
		</form>
	</div>

	<div>
		<h5>주변 인프라</h5>
		<div class="form-check">
		  <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked">
		  <label class="form-check-label" for="flexCheckChecked">맘스터치</label>
		</div>
		<div class="form-check">
		  <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked">
		  <label class="form-check-label" for="flexCheckChecked">대형마트</label>
		</div>
		<div class="form-check">
		  <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked">
		  <label class="form-check-label" for="flexCheckChecked">맥도날드</label>
		</div>
		<div class="form-check">
		  <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked">
		  <label class="form-check-label" for="flexCheckChecked">스타벅스</label>
		</div>
	</div>

	<div>
		<h5>가족 구성원</h5>
		<div>
			<label class="family" for="result1">1. 영유아</label>
			<span>
				<input class="family" type='button' onclick='count("plus1")' value='+'/>
				<span id='result1'>0</span>
				<input class="family" type='button' onclick='count("minus1")' value='-'/>
			</span>
		</div>
		<div>
			<label class="family" for="result2">2. 청소년</label>
			<span>
				<input class="family" type='button' onclick='count("plus2")' value='+'/>
				<span id='result2'>0</span>
				<input class="family" type='button' onclick='count("minus2")' value='-'/>
			</span>
		</div>
		
	</div>


	 <div class="submit">
		<input type="submit" value="확인">
	 </div>
 
 </div>
</body>