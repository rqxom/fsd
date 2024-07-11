const printEmployees=(e)=>
    console.log(`${e.name} ${e.age} ${e.dept.deptname} ${e.dept.location} ${e.salary}`)
let employees=[
    {'name':'john','age':20,'dept':{'deptname':'Finance','location':'BlockA'},'salary':10000},
    {'name':'james','age':21,'dept':{'deptname':'Infra','location':'BlockB'},'salary':12000},
    {'name':'adam','age':20,'dept':{'deptname':'Finance','location':'BlockA'},'salary':11000},
    {'name':'clara','age':22,'dept':{'deptname':'HR','location':'BlockC'},'salary':13000},
    {'name':'smith','age':21,'dept':{'deptname':'HR','location':'BlockC'},'salary':14000},
    {'name':'joe','age':23,'dept':{'deptname':'Finance','location':'BlockA'},'salary':15500},
    {'name':'tom','age':21,'dept':{'deptname':'Infra','location':'BlockB'},'salary':17590}
]
console.log('TRADITIONAL FOR LOOP');
for(let i=0;i<employees.length;i++)
    console.log(`${employees[i].name} ${employees[i].age} ${employees[i].dept.deptname} ${employees[i].dept.location} ${employees[i].salary}`)
console.log('DISPLAY USING FOREACH')
console.log('--'.repeat(50));
employees.forEach(printEmployees)
console.log('--'.repeat(50));
console.log('SORT BY NAME')
let sortedByName=employees.sort((a,b)=>a.name.localeCompare(b.name))
sortedByName.forEach(printEmployees)
console.log('--'.repeat(50));
let sortByAge=employees.sort((a,b)=>a.age - b.age)
console.log('SORT BY AGE')
sortByAge.forEach(printEmployees)
console.log('--'.repeat(50));
employees.forEach(printEmployees)
console.log('Filter')
let financeEmps=employees.filter((e)=>e.dept.deptname.toLowerCase()==='FINANCE'.toLowerCase())
financeEmps.forEach(printEmployees)
console.log('--'.repeat(50));
employees.forEach(printEmployees)
let salGt15000=employees.filter((e)=>e.salary>15000)
console.log('--'.repeat(50));
salGt15000.forEach(printEmployees)
console.log('--'.repeat(50));
let empAdam=employees.find((e)=>e.name==='adam')
console.log(empAdam)
let tableEmp=employees.map((e)=>`${e.name} ${e.age} ${e.salary}`)
console.log(tableEmp)
employees.forEach(printEmployees)