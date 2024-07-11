let marks=[100,38,78];
let sum=marks.reduce((previousValue, currentValue) => {
    previousValue=previousValue + currentValue;
    console.log(currentValue);
    return previousValue
}, 0);
console.log(`Sum=$(sum)`);
let sum1=marks.reduceRight((previousValue, currentValue) => {
    previousValue = previousValue + currentValue;
    console.log(currentValue);
    return previousValue
}, 0);
console.log(`Sum=$(sum1)`);