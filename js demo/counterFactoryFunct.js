function CounterFactory(){
    return {
        count:0,
        increment(){
            this.count++
        },
        decrement()
        {
            this.count--
        },
        reset(){
            this.count=0
        },
        displayCount(){
            console.log(this.count)
        }
    }
}
let counter1=CounterFactory()
console.log(counter1)
counter1.increment();
counter1.displayCount();
counter1.increment();
counter1.displayCount();
console.log(counter1 instanceof CounterFactory)
console.log(counter1 instanceof String)
console.log(Object.keys(counter1))