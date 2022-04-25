//ReqJ21
function templateFormatChanged (liveCellChar, deadCellChar) {
    if (liveCellChar === null) {
        liveCellChar = document.getElementById('LiveCellChar').value;
    }
    if (deadCellChar === null) {
        deadCellChar = document.getElementById('DeadCellChar').value;
    }
    templateUpdated(document.getElementById('templatePreviewTitle').innerHTML);
    console.log("Setting live/dead cells to " + liveCellChar + "/" + deadCellChar);
    document.getElementById('templatePreview').innerHTML = document.getElementById('templatePreview').innerHTML.replace(/1/g, liveCellChar);
    document.getElementById('templatePreview').innerHTML = document.getElementById('templatePreview').innerHTML.replace(/0/g, deadCellChar);
}

//ReqJ24
function webUpdated () {
    console.log("Setting WEBOutput to " + document.getElementById('WEB').value);
    document.getElementById('WEBOutput').innerHTML = document.getElementById('WEB').value;
}

//ReqJ26
function templateUpdated (id) {
    document.getElementById(id).click();
}

//ReqJ28
function resetTemplate () {
    document.getElementById('Blinker').click();
    disencouragementNote();
}