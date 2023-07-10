let index={
	init: function(){
		$("#btn-save").on("click", ()=>{
			this.save();
		}); //on. -> 첫번째 파라미터의 이벤트가 어떤일이 일어날건지 결정		
	},
	
	save: function(){
		//alert("user의 save 함수 호출됨");
		let data = {
			username: $("#username").val(),
			password: $("#password").val(),
			email: $("#email").val(),
		};
		
	//console.log(data);
	//ajax호출시 default가 비동기 호출이다.
	$.ajax({
		//회원가입 수행 요청
		type:"POST",
		url:"/api/user",
		data:JSON.stringify(data), //http body데이터
		contentType:"application/json; charset=utf-8", //body데이터가 어떤 타입인지
		dataType:"json"
	}).done(function(resp){
		alert("회원가입이 완료되었습니다.");
		console.log(resp)
		location.href="/index";
	}).fail(function(error){
		alert(JSON.stringify(error));
	}); //ajax 통신을 이용해서 3개의 데이터를 json으로 변경하여 insert 요청
	}	
}

index.init();