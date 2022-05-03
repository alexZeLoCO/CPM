
//ReqJ24
function webUpdated() {
    console.log("Setting WEBOutput to " + document.getElementById('WEB').value);
    document.getElementById('WEBOutput').innerHTML = document.getElementById('WEB').value;
}

//ReqJ26
function templateUpdated(id) {
    document.getElementById(id).click();
}

//ReqJ28
function resetTemplate() {
    document.getElementById('Blinker').click()
    disencouragementNote();
}