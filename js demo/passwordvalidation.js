function passwordValidation(password){
    let passwordPattern=/^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#&])[A-Za-z\d@#&]{8,}$/
    return passwordPattern.test(password)
}

console.log(passwordValidation('text'))
console.log(passwordValidation('123'))
console.log(passwordValidation('Ab3@sd12'))