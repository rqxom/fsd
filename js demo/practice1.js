let marks = [100, 38, 78, 43, 59, 98, 29, 56, 32, 89, 82, 84];

let marksGreaterThan80 = marks.filter(mark => mark > 80);

console.log("Marks greater than 80:", marksGreaterThan80);

let marksLessThan35 = marks.filter(mark => mark < 35);

console.log("Marks less than 35:", marksLessThan35);


let marksEqualTo100 = marks.filter((mark) => mark == 100);

console.log("Marks equal to 100:", marksEqualTo100);

let ascendingOrder = marks.slice().sort((a, b) => a - b);

let descendingOrder = marks.slice().sort((a, b) => b - a);

console.log("Marks in ascending order:", ascendingOrder);
console.log("Marks in descending order:", descendingOrder);