function multiply(x){
    return function(y){
        return x*y
    }
}

let func = multiply(2)
console.log(func(3))
console.log(func(10))
function findDiscount(price){
    return function(discount){
        return (price - (price*discount/100))
    }
}
let discountFunc=findDiscount(100)
console.log(discountFunc(10))

//Example 2

function calculateSalary(basicSalary){
    return function(hra,bonus,pf,bonusRate){
        return basicSalary + hra + (bonus*bonusRate) - pf
    }
}
let calculateNetSalary=calculateSalary(10000)
let netSalary=calculateNetSalary(100,100,50,0.5)
console.log(netSalary)
let netSalary1=calculateNetSalary(100,100,50,1)
console.log(netSalary1);