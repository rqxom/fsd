let user={'email':'john@gmail.com','username':'john123','password':'john@123','address':'xyz','phno':'398498398'}
const {email,username}=user;
console.log(email)
console.log(username)

let person={'name':'john','age':20}
let address={'street':'xyz','city':'chennai','pincode':'600001'}
console.log(person)
let persondetails={...person,...address}
console.log(persondetails)
Object.freeze(person)
delete person.name
console.log(person)
person.name='James'
console.log(person)