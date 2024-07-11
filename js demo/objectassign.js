let person={
    'name':'john',
    'age':20,
    'address':"xyz",
    'gender':'male',
    'title':'Project Lead'
}

let designation={
    'title':'Lead',
    'companyname':'xyz',
    'salary':34000
}
let department={
    'deptname':'Hr',
    'location':'BlockA'
}
Object.assign(person,designation,department)
console.log(person)
let person1={}
// let person1=person
Object.assign(person1,person)
delete person1.name
// console.log(person1)
// delete person1.name
console.log(person1)
console.log(person)