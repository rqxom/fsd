let numbers=[45,23,1,5,6,4,64,75]
console.log(`Length of an array ${numbers.length}`)
let length=numbers.push(34,5,60)
console.log(`Length of an array ${length}`)
console.log(numbers)
console.log(numbers.pop())
console.log(numbers)
console.log(numbers.shift())
console.log(numbers)
numbers.unshift(10,20,40)
console.log(numbers)

const squareNums=numbers.map((num)=>num*num)
console.log(squareNums)
let names=['john','james','smith','adam','abishek','prakash']
const namesCapitalized=names.map((name)=>name.toUpperCase())
console.log(namesCapitalized)
const incNums=numbers.map((num)=>num+10)
console.log(incNums)
const namesContainsa=names.filter((name)=>name.includes('a'))
console.log(namesContainsa)

const numbersGreaterThan50 = numbers.filter(number => number > 50);

console.log(numbersGreaterThan50);
let value=numbers.find((num)=>num%5==0)
console.log(value)
value=numbers.find((num)=>num==10)
console.log(value);
console.log(numbers.filter((num)=>num>10 && num<50))
console.log(numbers.find((num)=>num>10 && num<50))
const namesLengthGreaterThan5 = names.filter(name => name.length > 5);

console.log(namesLengthGreaterThan5);