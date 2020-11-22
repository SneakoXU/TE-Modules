

let leftOperand = 0;
let rightOperand = 0;
let correctAnswer = 0;

displayProblem();

function generateProblem(){
    leftOperand = getRandomNumber(9);
    rightOperand = getRandomNumber(9);
    correctAnswer = leftOperand * rightOperand;
    return `${leftOperand} * ${rightOperand}`;

}

function displayProblem(){
    let display = document.querySelector('#problem .expression');
    display.innerText = generateProblem(leftOperand, rightOperand);
    
}

/**
 * Utility function to generate a random number based on max
 * @param {number} max
 */
function getRandomNumber(max) {
  return Math.floor(Math.random() * Math.floor(max));
}

/**
 * Utility function to shuffle the items in an array
 * @param {object} arr
 */
function shuffleArray(arr) {
    return arr.sort(function (a, b) { return Math.random() - 0.5 })
  }