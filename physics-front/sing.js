const goToReg = document.getElementById('goToReg');
const goToSign = document.getElementById('goToSign');
const formGroup = document.getElementById('form-group');
var goTo = 'sign'


render();

async function render(){
    formGroup.innerHTML = '';
    if (goTo === 'sign'){
        formGroup.insertAdjacentHTML('beforeend', `<h2>Вход</h2>
        <label for="number">Номер телефона:</label>
        <input type="text" id="number" name="number" required>
        <label for="password">Пароль:</label>
        <input type="password" id="password" name="password">
        <button>Войти</button>`)
    }else{
        formGroup.insertAdjacentHTML('beforeend', `<h2>Регистрация</h2>
        <label for="fio">Имя</label>
        <input type="text" id="fio" name="fio" required>
        <div class="add">
            
        </div>
        <label for="regNumber">Номер телефона:</label>
        <input type="text" id="regNumber" name="regNumber" required>
        <div class="">
            <label for="gender">Класс:</label>
            <select id="gender" name="gender">
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
                <option value="11">11</option>
            </select>
        </div>
        <label for="regPassword">Придумайте пароль:</label>
        <input type="password" id="regPassword" name="regPassword">
        <label for="regPassword1">Подтвердите пароль:</label>
        <input type="password" id="regPassword1" name="regPassword1">
        <button>Зарегистрироваться</button>`)
    }

goToReg.onclick = async function(){
    goTo = 'reg';
    render();
}
goToSign.onclick = async function(){
    goTo = 'sign';
    render();
}



}

