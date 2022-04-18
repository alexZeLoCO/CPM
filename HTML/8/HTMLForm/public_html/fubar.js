/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */
function fechaDeHoy() {
	var fecha = new Date();
	document.write(fecha.toLocaleDateString());
}

function writeNumber(selectId, paraId) {
	var source = document.getElementById(selectId);
	var target = document.getElementById(paraId);
	target.innerHTML ="Number: " + source.value;	
}

function writeColor(selectId, coloId) {
	var source = document.getElementById(selectId);
	var rgb;
	switch(source.value) {
		case 'Red':
			rgb='FF0000'; break;
		case 'Green':
			rgb='00FF00'; break;
		case 'Blue':
			rgb='0000FF'; break;
		case 'White':
			rgb='FFFFFF'; break;
		case 'Black':
			rgb='000000'; break;
		case 'Gray':
			rgb='7F7F7F'; break;
	}
	var target = document.getElementById(coloId);
	target.innerHTML = "Color: " + source.value + " (" + rgb + ")";
}

function tagGender(genderId) {
	document.getElementById(genderId).checked = true;
}

function checkId(id) {
	if (id.length!==9) return false;			
	if (id[8]<'A' || id[8]>'Z') return false;
	for (i = 0;i<8;i++) {
		if (id[i]<'0' || id[i]>'9') return false;
	}
	return true;
}

function changedId() {
	document.getElementById("idInput").value = document.getElementById("idInput").value.toUpperCase();
	if (checkId(document.getElementById("idInput").value)) {
		document.getElementById("idInput").style.color = document.getElementById("idPara").style.color = 'BLACK';
	} else {
		document.getElementById("idInput").style.color = document.getElementById("idPara").style.color = 'RED';
	}
}

function isAdult(date) {
	if ((new Date().getFullYear() - date.getFullYear()) < 18 ||
		date === null) {
		document.getElementById("idPara").hidden = true;
	} else {
		document.getElementById("idPara").hidden = false;
	}
}


function checkAll () {
	if (document.getElementById("name").value.length === 0) {
		alert("ERR. Name is mandatory");
		document.getElementById("name").focus();
		return false;
	}
	if (document.getElementById("sname").value.length === 0) {
		alert ("ERR. Surname is mandatory");
		document.getElementById("sname").focus();
		return false;
	}
	if (!document.getElementById('bd').valueAsDate) {
		alert ("ERR. Date is mandatory");
		document.getElementById('bd').focus();
		return false;
	}
	if (!document.getElementById('typeMale').checked && !document.getElementById('typeFemale').checked) {
		alert ("ERR. Gender is mandatory");
		return false;
	}
	if ((new Date().getFullYear() - document.getElementById('bd').valueAsDate.getFullYear()) >= 18 &&
		!checkId(document.getElementById('idInput').value)) {
		alert ("ERR. ID is mandatory");
		document.getElementById('idInput').focus();
		return false;
	}
	return true;
}