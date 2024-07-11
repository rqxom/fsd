console.log('STEP1')
function getData(){
    return new Promise((resolve,reject)=>setTimeout(resolve('Hello....'),5000))
}
async function consumeData(){
    console.log('STEP2')
    console.log('STEP3');

let msg
await getData().then((data)=>msg=data).catch((err)=>console.log(err))
console.log(msg)
console.log('STEP4')
console.log('END')
}
consumeData()