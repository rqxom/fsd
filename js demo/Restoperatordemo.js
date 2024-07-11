function concat(arg1,...arg2){
    let str=arg1
    console.log(arg2.length)
    for(let i=0;i<arg2.length;i++)
        str=str.concat(arg2[i])
    return str
}

console.log(concat('Hello','World'))
console.log(concat('One','Two','Three','Four','Five'))
function findSum(...values){
    let sum=0;
    for(let i=0;i<values.length;i++)
        sum=sum+values[i]
    return sum;
}
console.log(findSum(1));
console.log(findSum(1,3,5));