const pairs=[['name','john'],['age',20],['science',56],['english',78],['maths',80]]
const student=Object.fromEntries(pairs)
console.log(student);

let marks={'name':'john','age':20,'science':50,'maths':80,'english':78}
let marksEntries=Object.entries(marks)
// let result=marksEntries.map(([key,value]=>[key,value+15]))
let result=marksEntries.map(([key,value])=>{
    if(key==='name' || key==='age')
        return [key,value]
    else
    return [key,value+15]
})
console.log(result)
console.log(Object.fromEntries(result))
console.log(marks)