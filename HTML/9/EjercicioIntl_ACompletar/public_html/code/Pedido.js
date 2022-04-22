/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Necesita las variables globales:
 *  numberFormat
 *  currencyFormat
 *  dateFormat
*/

function writeNumber (input, output) {
	if (document.getElementById(input).value) {
		var n =new Number(document.getElementById(input).value);
		if (n) {
			document.getElementById(output).innerHTML = "( " + numberFormat.format(n) + " )";
		} else {
			document.getElementById(output).innerHTML = "(  )";
		}
	} else {
		document.getElementById(output).innerHTML = "";
	}
}

function calc (nScrews, idScrewWeight, idScrewPrice, idOneScrewWeight, idTotalPrice, idDate) {
	if (document.getElementById(nScrews).value &&
		document.getElementById(idScrewWeight).value) {
		document.getElementById(idOneScrewWeight).innerHTML = numberFormat.format(document.getElementById(idScrewWeight).value / document.getElementById(nScrews));
		document.getElementById(idTotalPrice).innerHTML = numberFormat.format(document.getElementById(nScrews).value * document.getElementById(idScrewPrice));
	}
}
