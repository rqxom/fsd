//ES6 feature - Spread operator
//1. combine two or more objects/array
//2.Add new properties to an already existing object
//3. Add new elements to an array
//4. To make a shallow of an array
//SPREAD operator - OBJECT

let person={
    'name':'john','age':20,'gender':'Male','city':'CHN','isActive':true
}
let personEmployment={...person,salary:10000,companyname:'xyz'}
console.log(person);
console.log(personEmployment);
let obj1={a:1,b:2}
let obj2={b:5,c:3,d:4}
let obj3={...obj1,...obj2}
console.log(obj3)
//SPREAD operator - ARRAY
let numbers=[10,30,40,60,20,40]
let copyNumbers=[...numbers]
//merge two or more arrays
let arr1=[1,3]
let arr2=[4,5]
let arr3=[6,7]
let arr5=[...arr1,...arr2,...arr3] //to merge three arrays
let arr6=[20,...arr5,100] //add new elements to an existing array
console.log(arr1)
console.log(arr2)
console.log(arr3)
console.log(arr5)
console.log(arr6)

console.log(Math.max(23,56,78,90))
console.log(Math.max(...arr6));//passing an array to a Rest parameter function