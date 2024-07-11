function add(a,b=0){
    return a+b
}
function welcome(name='unknown'){
    console.log(`Hello ${name}`);
}
console.log(add(1))
console.log(add(1,4))
welcome('john')
welcome()