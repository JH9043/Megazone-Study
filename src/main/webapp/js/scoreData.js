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

			}
		}
		xhr.send();
	}
}

function getTotalJSCSV(responseText) {
	if (xhr != null) {
		xhr.open("GET", "/WEBTest/jsp/scoreDataProcess.jsp?responseText="+responseText, false); //open(전송 방식, URL, 동기(false) 비동기(true))
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