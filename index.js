 const url = 'http://localhost:8084/sendMessage';
 const sendButton = document.getElementById('sendButton');
 
 
class RecordDto{
    constructor(fio, phoneNumber, connectionType, rate, classNumber){
        this.fio=fio;
        this.phoneNumber= phoneNumber;
        this.connectionType= connectionType;
        this.rate= rate;
        this.classNumber= classNumber; 

    }
}


 sendButton.onclick = async function() {
    let fio = document.getElementById('name').value;
    let phoneNumber = document.getElementById('phone').value;
    let connectionType = document.getElementById('gender').value;
    let rate = document.getElementById('tarif').value;
    let classNumber = document.getElementById('class').value;

    let newRecordDto = new RecordDto(fio, phoneNumber, connectionType, rate,classNumber);

    try {
        const resp = await fetch(url,   {method: 'POST', 
                                        headers: {'Content-Type': 'application/json;charset=utf-8'},
                                        body: JSON.stringify(newRecordDto)}) 
    } catch (error) {
        console.log('Ошибка отправления');
    }
 }