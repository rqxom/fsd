const printCourses=(course,index)=>console.log(`${index+1}. ${course}`)
let user={
    'name':{
        'firstname':'John',
        'lastname':'Smith'
    },
    'email':'john@gmail.com',
    'username':'john123',
    'address':{
        'street':'No5',
        'city':'chennai',
        'state':'TN',
        'pincode':'609000'
    },
    'courses':['Java','Javascript','Html','CSS','React']
}
console.log(`${user.name.firstname} ${user.name.lastname}`)
user.courses.forEach(printCourses)
console.log(user.address)
console.log(user.courses[0])
console.log(user.courses[1])
console.log(user.courses[2])