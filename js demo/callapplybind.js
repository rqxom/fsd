function displayDetails(){
    console.log(`${this.name} ${this.age} ${this.gender}`)
}

let person={
    'name' : 'John',
    'age' : 20,
    'gender' : 'Male'
}
let person1={
    'name' : 'James',
    'age' : 22,
    'gender' : 'Male'
}

displayDetails.call(person)
displayDetails.call(person1)

function displayEmployeeDetails(hra,bonus,pf){
    console.log(`${this.empname} ${this.age} ${this.salary} ${hra} ${bonus} ${pf}`)
}
let employee={'empname':'John','age':20,'salary':10000}
displayEmployeeDetails.call(employee,100,50,100)
displayEmployeeDetails.apply(employee,[100,40,100])

let employeDetails=displayEmployeeDetails.bind(employee,100,20,10)
employeDetails()