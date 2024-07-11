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
const entries=Object.entries(person)
console.log(entries);
for(const [key,value] of entries)
    console.log(key + ' ' + value)
for(const key in person)
    console.log(key+' '+ person[key])
let array=[10,400,450,50]
for(const value of array)
    console.log(value)