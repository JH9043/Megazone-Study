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
				
				for (i = 0; i < result.length; i++) {
					if (i % 3 == 1) { //1, 4, 7
						sum = eval(result[i] + "+" + result[i + 1]);
						//13 23 33
						document.getElementById((i+1)+"3").innerHTML = sum;
						document.getElementById((i+1)+"4").innerHTML = sum / 2;
						id += 10;
					}


				}
				a = document.getElementById(13).innerHTML;
				b = document.getElementById(23).innerHTML;
				c = document.getElementById(33).innerHTML;
				array_num = [3, 2, 1];
				sort = [a, b, c];
				sort1 = sort.sort();
				id_sort = 13;
				console.log(sort1);
				for (i = 0; i < 3; i++) {
					for (j = 0; j < sort1.length; j++)
						if (document.getElementById("" + id_sort).innerHTML == sort1[j])
							document.getElementById("" + (id_sort + 2)).innerHTML = array_num[j];
					id_sort += 10;

				}



				//				for (i = 0; i < 3; i++) {
				//					for (j = 0; j < ; j++) {
				//						var itemValue = result[num1];
				//						var str = String(i + 1);
				//						var str1 = String(j);
				//						var str2 = str + str1;
				//						if (str2 % 10 == 3) {
				//							document.getElementById(str2).innerHTML = itemValue;
				//
				//						}
				//					}
				//
				//				}
				//				document.getElementById("13").innerHTML = result
				//13 23 33            //1,2 4,5 7,8
			}
		}
		xhr.send();
	}
}


function getTotalJSCSV(responseText) {
	if (xhr != null) {
		xhr.open("GET", "/WEBTest/jsp/scoreDataProcess.jsp?responseText=" + responseText, true); //open(전송 방식, URL, 동기(false) 비동기(true))
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