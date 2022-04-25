function get (n) {
    return document.getElementById('num'+n).value;
}

function getDate () {
    return document.getElementById('date').value;
}

//ReqI12
function aUpdated (newA) {
    //ReqI8
    document.getElementById('output').innerHTML = 
					//ReqI13
        '(A+B)/7 = ' + numberf.format((document.getElementById('newA').value+get('B'))/7);
}

//ReqI13
function bUpdated (newB) {
    //ReqI8
    document.getElementById('output').innerHTML = 
        '(A+B)/7 = ' + numberf.format((document.getElementById('newB').value+get('A'))/7);
    
    //ReqI9
			document.getElementById('currencyOutput').innerHTML = 
				//ReqI14
        'C-B = ' + currencyf.format(get('C')-document.getElementById('newB').value);
}

//ReqI9
function cUpdated (newC) {
    document.getElementById('currencyOutput').innerHTML = 
        'C-B = ' + currencyf.format((newC-get('B')));
}

//ReqI10
function dateUpdated (newDate) {
    newDate = new Date (newDate);
    console.log(newDate);
	newDate.setYear((new Date()).getFullYear() - newDate.getFullYear());
    console.log(newDate);
	document.getElementById('dateShortOutput').innerHTML =
				//ReqI15
		shortDatef.format(newDate);
    document.getElementById('dateOutput').innerHTML = 
				//ReqI16
        longDatef.format(newDate);
}

