function Person(name,dob){
    this.name=name;
    this.dob=new Date(dob);
    this.greet=()=>{
      console.log(`Welcome ${this.name}`)
    }
  }
  Person.prototype.calculateAge=function(){
      console.log(this.dob)
      console.log(this.dob.getFullYear())//getFullYear is a function in Date class
      console.log(this.dob.getMonth())
      let today=new Date();
      console.log(`You are ${(today.getFullYear()-this.dob.getFullYear())} yrs old.`)
  
  }
  let person=new Person('John','1999-10-10')
  person.greet()
  person.calculateAge()
  let person1=new Person('James','2000-01-01')
  person1.greet()
  person1.calculateAge()
  console.log(person.__proto__===person1.__proto__)//true