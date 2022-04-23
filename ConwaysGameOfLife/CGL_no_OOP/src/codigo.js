//ReqJ21
function templateFormatChanged (liveCellChar, deadCellChar) {
    if (liveCellChar == null) {
        liveCellChar = document.getElementById('LiveCellChar').value;
    }
    if (deadCellChar == null) {
        deadCellChar = document.getElementById('DeadCellChar').value;
    }
    templateUpdated(document.getElementById('templatePreviewTitle').innerHTML.split(' ')[1]);
    console.log("Setting live/dead cells to " + liveCellChar + "/" + deadCellChar);
    document.getElementById('templatePreview').innerHTML = document.getElementById('templatePreview').innerHTML.replace(/1/g, liveCellChar);
    document.getElementById('templatePreview').innerHTML = document.getElementById('templatePreview').innerHTML.replace(/0/g, deadCellChar);
}

function setupString (color) {
    let neu = "00,00,00";
    neu[0] = color[0];
    neu[1] = color[1];
    neu[2] = ',';
    neu[3] = ' ';
    neu[4] = color[2];
    neu[5] = color[3];
    neu[6] = ',';
    neu[7] = ' ';
    neu[8] = color[4];
    neu[9] = color[5];
    console.log(neu);
    return neu;
}

//ReqJ24
function webUpdated () {
    console.log("Seeting WEBOutput to " + document.getElementById('WEB').value);
    document.getElementById('WEBOutput').innerHTML = document.getElementById('WEB').value;
}

//ReqJ26
function templateUpdated (id) {
    document.getElementById(id).click();
}

//ReqJ28
function resetTemplate () {
    document.getElementById('Blinker').click()
    disencouragementNote();
}