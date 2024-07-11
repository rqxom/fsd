function OuterFunction(){
    let outerVar=10
    function innerFunction(){
        let innerVar=20
        console.log('OuterVariable ' + outerVar)
        console.log('innerVariable ' + innerVar)
    }
    innerFunction()
}
OuterFunction()