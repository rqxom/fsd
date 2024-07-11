function validatePattern(inputStr){
    let pattern=/^(?=.*[&@%*$]).*$/
    return pattern.test(inputStr)
}

console.log(validatePattern('abc'))
console.log(validatePattern('abc&'))
console.log(validatePattern('abc@laskd'))
console.log(validatePattern('%abc'))
console.log(validatePattern('abcasdkj%'))
console.log(validatePattern('1334'))
console.log(validatePattern('&'))
console.log(validatePattern('ajdk$$$*akjsd'))