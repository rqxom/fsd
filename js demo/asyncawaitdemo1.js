function getNumbers(){
    return new Promise((resolve,reject)=>setTimeout(resolve({'number1':10,'number2':12}),5000))
}
async function calculateSum(){
    let sum
    let numbers={'number1':0,'number2':0}
    await getNumbers().then((data)=>numbers=data).catch((err)=>console.log(err))
    sum=numbers.number1+numbers.number2
    console.log(sum)
}
calculateSum()