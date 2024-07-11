import { useState,useMemo } from "react";
function factorial(n){
    console.log('calculating factorial of ' + n)
    if(n<=1) return 1;
    return n*factorial(n-1);
}
function UseMemoDemo1(){
    let [number,setNumber]=useState(0)
    let [count,setCount]=useState(0)
    let result=useMemo(()=>factorial(number),[number])
    console.log('Component is re-rendering')
    return(<>
    <b>Factorial result is</b>{result}<br></br>
    <b>Count is</b>{count}<br></br>
    <button onClick={()=>setNumber(number+1)}>Increment number{number}</button><br></br>
    <button onClick={()=>setNumber(count+1)}>Increment count{count}</button><br></br>
    </>)
}
export default UseMemoDemo1