var xhr;

window.onload = function() {
	xhr = new XMLHttpRequest(); //윈도우가 로딩되면 객체를 생성하겠다
}

function processJSCSV() {
	if (xhr != null) {
		xhr.open("GET", "/WEBTest/csv/scoreData.csv", true); //open(전송 방식, URL, 동기(false) 비동기(true))
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				var result = xhr.responseText.split(",");

				num = 0;
				for (i = 0; i < 3; i++) {
					for (j = 0; j < 3; j++) {
						var itemValue = result[num];
						var str = String(i + 1);
						var str1 = String(j);
						var str2 = str + str1;
						document.getElementById(str2).innerHTML = itemValue;
						num++;
					}
				}
				getTotalJSCSV(xhr.responseText);
				var total_1 = total.split(",");
				document.getElementById("40").innerHTML = total_1[0];
				document.getElementById("41").innerHTML = total_1[1];
				count = 1;
				for (i = 0; i < result.length; i++) { //총합, 평균
					if (i % 3 == 1) { //1, 4, 7
						sum = eval(result[i] + "+" + result[i + 1]);
						var id_sum = ("" + count) + "3";
						var id_avg = ("" + count) + "4";
						//13 23 33
						document.getElementById(id_sum).innerHTML = sum;
						document.getElementById(id_avg).innerHTML = sum / 2;
						count++;
					}
				}
				sort = [];
				for (i = 0; i < 3; i++) { //배열 선언
					var sort_id = ("" + (i + 1)) + "3";
					sort_value = document.getElementById(sort_id).innerHTML;
					sort[i] = eval(sort_value);

				}
				sort_1 = sort.sort();
				console.log(sort_1);
				array_num = [3, 2, 1];

				for (i = 0; i < sort_1.length; i++) { //석차
					for (j = 0; j < sort_1.length; j++) {
						sort_id = ("" + (i + 1)) + "3";
						if (document.getElementById(sort_id).innerHTML == sort_1[j]) {
							document.getElementById(eval(sort_id) + 2).innerHTML = array_num[j];
						}
					}
				}
			}
		}
		xhr.send();
	}
}


function getTotalJSCSV(responseText) {
	if (xhr != null) {
		xhr.open("GET", "/WEBTest/jsp/scoreDataProcess.jsp?responseText=" + responseText, false); //open(전송 방식, URL, 동기(false) 비동기(true))
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				return total = xhr.responseText;
			}
		}
		xhr.send();
	}
}

function processJSJSON() {
	if (xhr != null) {
		xhr.open("GET", "/WEBTest/json/scoreData.json", true);
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				alert('processJSJSON called back!!!');
			}
		}
		xhr.send();
	}
}
function processJSXML() {
	if (xhr != null) {
		xhr.open("GET", "/WEBTest/xml/scoreData.xml", true);
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				alert('processJSXML called back!!!');
			}
		}
		xhr.send();
	}
}

function processINIT() {
	var tdElements = document.getElementsByTagName("td");
	var te = tdElements.length;
	for (i = 0; 0 < te; i++) {
		tdElements[i].innerHTML = "";
	}
}
