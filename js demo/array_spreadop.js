let array1=[10,304,50,20,40]
// let array2=[56,78,65,46,7,744]
// let array3=[...array1,...array2]
console.log(array1)
// console.log(array2);
// console.log(array3);
const square=([...array])=>{
    for(let i=0;i<array.length;i++)
        array[i]=array[i]*array[i]
    console.log(array)
}
square(array1)
console.log(array1);