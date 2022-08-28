var time = 0;
var flag = true;

function button() {
	var hour = 0;
	var min = 0;
	var sec = 0;

	for (i = 1; i < 5; i++) {

		var random = (String)(Math.floor(Math.random() * (15 - 5 + 5)) + 5);
		var id2 = "img" + i;
		var name = "move" + i;
		var second = random + "s";


		document.getElementById(id2).style.animationName = name;
		document.getElementById(id2).style.animationDuration = second;
	}

	setInterval(function() {
		time++;

		min = Math.floor(time / 60);
		hour = Math.floor(min / 60);
		sec = time % 60;
		min = min % 60;

		var th = hour;
		var tm = min;
		var ts = sec;
		if (th < 10) {
			th = "0" + hour;
		}
		if (tm < 10) {
			tm = "0" + min;
		}
		if (ts < 10) {
			ts = "0" + sec;
		}

		for (i = 1; i < 5; i++) {
			var id = "time" + i;
			document.getElementById(id).innerHTML = th + ":" + tm + ":" + ts;
		}
	})
}










