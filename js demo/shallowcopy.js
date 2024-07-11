// let values=[102,3492,13,24,4,5,6,1];
// let copyValues=values
// console.log(values)
// console.log(copyValues)
// copyValues.push(200)
// console.log(values)
// console.log(copyValues)

const compareFn=(a,b)=>a-b
const compareFn1=(a,b)=>b-a

let values=[102,3492,13,24,4,5,6,12];
let copyValues=[...values]
console.log(values)
console.log(copyValues)
copyValues.push(200)
console.log(values)
console.log(copyValues)
copyValues.sort(compareFn)
console.log(copyValues)
copyValues.sort(compareFn1)
console.log(copyValues)
