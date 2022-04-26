function get (n) {
    return document.getElementById('num'+n).value;
}

function getDate () {
    return document.getElementById('date').value;
}

//ReqI12
function aUpdated (newA, random) {
    //ReqI8
    document.getElementById('output').innerHTML = 
					//ReqI13
        '(A+B)/7 = ' + numberf.format((newA+get('B'))/7);
	//DefI3 DefI4
	document.getElementById('defOutput').innerHTML = numberf.format(Math.sqrt(newA)) + " [" + intf.format(Math.sqrt(newA)) + "]";

	//DefI5
	document.getElementById(random).innerHTML = intf.format(Math.random());
}

//ReqI13
function bUpdated (newB) {
    //ReqI8
    document.getElementById('output').innerHTML = 
        '(A+B)/7 = ' + numberf.format((newB+get('A'))/7);
    
    //ReqI9
			document.getElementById('currencyOutput').innerHTML = 
				//ReqI14
        'C-B = ' + currencyf.format(get('C')-newB);
}

//ReqI9
function cUpdated (newC) {
    document.getElementById('currencyOutput').innerHTML = 
        'C-B = ' + currencyf.format((newC-get('B')));
}

//ReqI10
function dateUpdated (newDate) {
    newDate = new Date (newDate);
    //console.log(newDate);
	//newDate.setYear((new Date()).getFullYear() - newDate.getFullYear());
    console.log(newDate.getFullYear());
    //DefI2
    if (newDate.getFullYear() > 2000) {
	document.getElementById('dateShortOutput').innerHTML =
		//ReqI15
		shortDatef.format(newDate);
    	document.getElementById('dateOutput').innerHTML = 
		//ReqI16
        	shortDatef.format(newDate);
    } else {
	document.getElementById('dateShortOutput').innerHTML =
		//ReqI15
		longDatef.format(newDate);
    	document.getElementById('dateOutput').innerHTML = 
		//ReqI16
        	longDatef.format(newDate);
	}
}

