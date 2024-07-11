function Book(title,author,price){
    this.title=title;
    this.author=author;
    this.price=price;
    this.displayBookDetails=()=>{
        console.log(`${this.title} ${this.author} ${this.price}`)
    }
}

Book.prototype.calculateDiscountPrice=function(discountRate){
    let discountPrice=this.price-(this.price*discountRate/100)
    console.log(`Price after ${discountRate}% is ${discountPrice}`)
}
let book=new Book('Java','xyz',2000)
book.displayBookDetails()
book.calculateDiscountPrice(10)