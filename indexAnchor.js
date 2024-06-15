
const scrollButton = document.getElementById('scrollButton').addEventListener('click', goToRecord);
const scrollButton1 = document.getElementById('scrollButton1').addEventListener('click', goToRecord);
const scrollButton2 = document.getElementById('scrollButton2').addEventListener('click', goToRecord);
const scrollButton3 = document.getElementById('scrollButton3').addEventListener('click', goToRecord);
const scrollButton4 = document.getElementById('scrollButton4').addEventListener('click', goToRecord);
const scrollButton5 = document.getElementById('scrollButton5').addEventListener('click', goToRecord);
var tarif;


function goToRecord(){
	document.getElementById('form-section').scrollIntoView({behavior: 'smooth'});
	choosTatif(this)
	document.getElementById('tarif').value = tarif;
}


function choosTatif(but){
	switch (but.id) {
		case 'scrollButton1':
			tarif = 'Индивидуальные занятия по математике';
			break;
		case 'scrollButton2':
			tarif = 'Индивидуальные занятия по физике';
			break;
		case 'scrollButton3':
			tarif = 'Индивидуальные занятия по физике по программе IB';
			break;
		case 'scrollButton4':
			tarif = 'Групповые занятия по физике';
			break;
		case 'scrollButton5':
			tarif = 'Групповые занятия по математике';
			break;
		default:
			tarif = '';
			break;
	}
}