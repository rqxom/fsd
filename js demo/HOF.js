const square=(x)=>x*x
let numbers=[10,30,40,20,32]
let squarenumbers=numbers.map(square)
console.log(squarenumbers)

const add=(a,b)=> a+b
const sub=(a,b)=> a-b

function calculate(operation,a,b){
    return operation(a,b)
}
console.log(calculate(add,10,10))
console.log(calculate(sub,23,15))