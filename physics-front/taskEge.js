
const tasks = document.querySelectorAll('[id^="task"]');

tasks.forEach(task => {
    const taskId = task.id;
    if (taskId === 'task21'){
        exit;
    }
    if (taskId === 'task18') {
        task18Element = task;
        
    }else {
        task.onclick = async function() {
            console.log(task);
        };
    }
});

task18Element.onclick = async function(){
    console.log('sdfsdads');
}

