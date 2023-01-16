
// 체크 상태, 표시될 레이블을 인자로 하는 모델 생성자
CheckButtonModel = function(checked, label) {
	this.listeners = new Array(); //this.listeners를 배열 객체로 생성
	this.checked = checked;
	this.label = label;
	
}

CheckButtonModel.prototype = { //prototype property
	
	//리스너는 모델의 변화를 감지하는 기능
	//리스너 추가
	addListener: function(listener) {
		this.listeners[this.listeners.length] = listener;	//**/이건 잘 모르겠음
		
	}, //addListener
	
	//리스너 제거
	removeListener: function(listener) {
		if (this.listeners.length == 0) return; //listener가 없다면 리턴하겠다

		var newListeners = new Array(); //newListeners를 배열 객체 선언
		for (var i = 0; i < this.listeners.length; i++) { //전체를 놓고 제거할 사람만 빼고 배열을 만들겠다
			if (this.listeners[i] != listener) {
				 //전체 대상     	//제거 대상
				newListeners[newListeners.length] = this.listeners[i];
				 //새로운 배열                   
			}
		}
		this.listeners = newListeners; //this.listeners(제거된 배열)
	}, //removeListener

	// 뷰의 변경을 위해서 모델의 변화를 통보
	notify: function() {
		for (var i = 0; i < this.listeners.length; i++) {
			
			//this는 모델, 리스너들에게 변화를 통보
			this.listeners[i].changed(this);
		}
	}, //notify
	
	//체크가 되면 통보한다
	setChecked: function(checked) {
		this.checked = checked; //체크 상태로 변화시키고 알려준다
		this.notify();
	}, //setChecked 

	// 체크 상태를 변경
	toggle: function() {
		if (this.checked) checked = false; //체크가 돼있으면 체크 해제하겠다
		else this.checked = true; //안 되어있으면 체크
	}, //toggle
	
	// 체크되어 있는지를 확인
	isChecked: function() {
		return this.checked; //체크 돼있는지 확인 후 결과를 this.checked로 넘겨준다
	}, //isChecked

	//레이블 값을 가져옴
	getLabel: function() {
		return this.label; //label 값을 리턴
	} //getLabel

} // CheckButtonModel.prototype

//Controller : 모델과 뷰를 인자로 받아서 MVC의 처리를 담당
CheckButton = function(model, ui) {
	this.model = model;
	this.ui = ui;
	// 모델에 리스너를 추가 (리스너 == Controller)
	this.model.addListener(this);
	// 뷰에 리스너를 추가 (리스너 == Controller)
	this.ui.setCheckButton(this);
	// 뷰 렌더링
	this.ui.render();
	
	
}

CheckButton.prototype = {
	// 모델의 체크 상태를 설정
	setChecked: function(checked) {
		this.model.setChecked(checked);
	},
	// 모델의 토글
	toggle: function() {
		this.model.toggle();
	},
	// 모델의 체크 상태를 확인
	isChecked: function() {
		this.model.isChecked();
	},
	// 모델의 레이블 가져오기
	getLabel: function() {
		this.model.getLabel();
	},
	// 이미지를 변경
	changed: function() {
		this.ui.update();
	}
}

//View

// View 생성자
CheckButtonUI = function(elementId) {
//	console.log(elementId); //receiveMail, receiveSMS
	this.element = document.getElementById(elementId);
	this.checkButton = null; // Controller
}

// 뷰 메소드 확장
CheckButtonUI.prototype = {

	// Controller 설정
	setCheckButton: function(checkButton) {
		this.checkButton = checkButton;
	}, // setCheckButton

	// 화면에 렌더링
	render: function() {
		
		// html 문자열 생성
		var html = "<img src='"; //체크 여부에 따라 이미지 변경하기 위해 사용
		if (this.checkButton.isChecked()) {
			html += "/WEBTest/images/check_on.gif'>"; 
		} else {
			html += "/WEBTest/images/check_off.gif'>";
		}
		html += "&nbsp;" + this.checkButton.model.getLabel();
		this.element.style.cursor = 'hand';
		this.element.innerHTML = html;

		// 이벤트리스너 추가
		ajax.Event.addListener(this.element, "click", ajax.Event.bindAsListener(this.doClick, this))
	}, // render

	// 토글 행위를 Controller에 전달
	doClick: function() {
		this.checkButton.toggle(); //클릭이 일어난 버튼을 토글하겠다
	}, //doClick

	// 이미지를 변경
	update: function() {
		var img = this.element.getElementByTagName("img").item(0); //img 태그 중에서 첫번째
		if (this.checkButton.isChecked()) {
			img.src = "/WEBTest/images/check_on.gif";
		} else {
			img.src = "/WEBTest/images/check_off.gif"
		}

	}

} //CheckButtonUI