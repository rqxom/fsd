class Person{
    constructor(name,dob){
        this.name=name;
        this.dob=new Date(dob)
    }
    greet(){
        console.log(`Welcome ${this.name}`)
    }
    calculateAge(){
        let today=new Date()
        console.log(`You are ${(today.getFullYear()-this.dob.getFullYear())} old`)
    }
    displayPersonInfo(){
        console.log(`${this.name} and dob is ${this.dob}`)
    }
}

let person=new Person('James','1990-10-10')
person.greet()
person.calculateAge()
person.displayPersonInfo()