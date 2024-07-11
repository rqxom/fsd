class Shape{
    constructor(color,noOfSides){
        this.color=color;
        this.noOfSides=noOfSides;
    }
    display(){
        console.log(`${this.color} ${this.noOfSides}`)
    }
    area(){
        console.log('none')
    }
}

class Triangle extends Shape{
    constructor(color,noOfSides,length,height){
        super(color,noOfSides)
        this.length=length;
        this.height=height;
    }
    display(){
        super.display()
        console.log(`${this.length} ${this.height}`)
    }
    area(){
        console.log(`${0.5*this.length*this.height}`)
    }
}
let shape=new Shape('unknown',0)
shape.display()
let triangle=new Triangle('red',3,5,7)
triangle.display()
triangle.area()