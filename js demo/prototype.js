let person={
    'name':'james',
    'age':20,
    display(){
        console.log(`${this.name} ${this.age}`)
    }
}

let studentmarks={
    'science':40,
    'english':50,
    'maths':70
}
console.log('science marks' + studentmarks.science)
console.log('student name before setting prototype ' + studentmarks.name)
console.log(studentmarks.isPrototypeOf(person))
Object.setPrototypeOf(studentmarks,person)
console.log(studentmarks.isPrototypeOf(person))
console.log('student name after setting prototype ' + studentmarks.name)
person.display()
studentmarks.display()