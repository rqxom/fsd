function getLuckyNumber() {
    let randomNumber=Math.floor(Math.random() * 10) + 1;
    console.log(randomNumber);
    return new Promise((resolve, reject) => {
        if(randomNumber % 2 === 0) resolve(`Lucky number is ${randomNumber}`);
        else reject("Not a lucky number");
    });
}
setInterval(()=>
getLuckyNumber()
   .then((luckyNumber) => console.log(luckyNumber))
   .catch((err) => console.log(err)),1000)