
//-JavaScript 방식-
//window.onload = function(){ //윈도우 객체에 있는 onload 객체
//							//여기다가 function을 담음
//	alert("페이지가 열렸습니다!")
//}

//-jQuery 방식-
//$document.ready(function(){
//	
//});
//위와 아래 둘다 기능상 같은 코드이지만 아래 것을 쓰는 것이 더 낫다
$(function(){ 
	alert("페이지가 열렸습니다");
});


