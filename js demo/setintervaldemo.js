console.log('START')
console.log('Welcome')
console.log(1+3)
const intervalId=setInterval(()=>console.log('This message will get displayed for every 1000 ms'),1000)
console.log('Message after setInterval')
console.log('END')
setTimeout(()=>clearInterval(intervalId),5000)
console.log('statement after setTimeout...')