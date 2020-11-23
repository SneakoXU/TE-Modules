//problem counter
let problemCount = 1;
//# of questions
let questionCount = 10;
//operation
let operation = '*';
//max value
let maxValue = 9;
//correct answer
let correctAnswer;
//score
let score = 0;

reload();
document.addEventListener('DOMContentLoaded', () =>{


    const button = document.querySelector('#btnStartOver');
    button.addEventListener('click', startOver);


    const answerLi = document.querySelectorAll('#answers li').forEach( (choice) => {
    choice.addEventListener('click', (event) =>{
        // const problem = document.querySelector('.currentProblem');
        // problem.innerHTML = problemCount;
        answerQuestion(event);
        
        updateScore();
        (problemCount < questionCount) ? updateProblemCounter() : endGame();
        reload();
    })
    }
    );


});

function start(){
  //should have the problem hidden
  //header text should be changed
  //start over button should say start
  //changed set operation based on user choice

}

function reload(){
  displayProblem();
  displayMultipleChoice();
}

function displayProblem(){
    const expression = document.querySelector('#problem .expression');
    let operand1 = getRandomNumber(maxValue);
    let operand2 = getRandomNumber(maxValue);
    expression.innerHTML = `${operand1} ${operation} ${operand2}`;
    correctAnswer = evalProblem(operand1, operand2, operation);
}
function createMultipleChoice(){
    const rand1 = getRandomNumber(maxValue);
    const rand2 = getRandomNumber(maxValue);
    const a = evalProblem(rand1, rand2, '+');
    const b = evalProblem(rand1, rand2, '-');
    const c = correctAnswer;
    const d = evalProblem(rand1 - rand2, rand1, '+');
    let choices = [a, b, c, d];
    for (let i = choices.length - 1; i > 0; i--){
        if(choices[i] == choices[i - 1]){
            choices[i] +=10;
        }
    }
    return shuffleArray(choices);
}
function displayMultipleChoice(){
    const answers = createMultipleChoice();
    const answerList = document.querySelector('#answers ul');
    const answerArray = Array.from(answerList.children);
    let count = 0;
    answerArray.forEach( (li) => {
        li.innerHTML = answers[count];
        count++;
    });
}

function answerQuestion(event){
    let isCorrect = (event.target.innerHTML == correctAnswer) ? true : false;
    //window.alert('This function activated');
    if(isCorrect){
      score++;
    }
    
}

function updateScore(){
  document.querySelector('.currentScore').innerHTML = score;
}

function evalProblem(num1, num2, operation){
    const basicMath = {
        '+': (num1, num2) => num1 + num2,
        '-': (num1, num2) => num1 - num2,
        '/': (num1, num2) => (num1 / num2).toFixed(2),
        '*': (num1, num2) => num1 * num2,
    }
    return basicMath[operation](num1, num2);
}




function updateProblemCounter(){
    (problemCount < questionCount) ? problemCount++ : endGame();
    document.querySelector('.currentProblem').innerHTML = problemCount;
}

function startOver(){
  problemCount = 1;
  score = 0;
  const show = document.querySelectorAll('.show-hide');
  show.forEach( (element) => {
    element.classList.remove('hidden');
  })
}

function endGame(){
  const hidden = document.querySelectorAll('.show-hide');
  hidden.forEach( (element) => {
    element.classList.add('hidden');
  })
  reload();
}

function getRandomNumber(max) {
    return Math.floor(Math.random() * Math.floor(max)) + 1;
  }

function shuffleArray(arr) {
    return arr.sort(function (a, b) { return Math.random() - 0.5 })
  }

