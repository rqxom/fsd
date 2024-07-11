function Person(firstname,lastname,gender){
    this.firstname=firstname;
    this.lastname=lastname;
    this.gender=gender;
    this.greet=()=>{
        console.log(`${this.firstname} ${this.lastname} ${this.gender}`)
    }
}
let p1=new Person('john','smith','m')
console.log(p1)
p1.greet()
let p2=new Person('james','s','m')
p2.greet()
let p3=new Person('clara','j','f')
let p4=new Person('john','smith','m')
console.log(typeof p1)
console.log(p1===p4)
function FactoryPerson(fn,ln,gen){
    return {
        firstname:fn,lastname:ln,gender:gen,
        greet(){console.log(`${this.firstname} ${this.lastname} ${this.gender}`)}
    }
}
let factP1=FactoryPerson('Tom','S','M')
factP1.greet()
console.log(factP1);
