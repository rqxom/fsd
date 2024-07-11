import { useDispatch, useSelector } from "react-redux";
import { decrement, increment } from "./counterreducer"
import { useState } from "react";
import { incrementByInput } from "./counterreducer";

function Counter(){
    let [input,setInput]=useState(0)
    let count=useSelector((state)=>state.counter.count)
    let dispatch=useDispatch()
    return(<>
    <b>Enter number</b><input type="text" value={input} onChange={(event)=>setInput(event.target.value)}></input>
    <button onClick={()=>dispatch(increment())}>+</button>{count}<button onClick={()=>dispatch(decrement())}>-</button>
    <button onClick={()=>dispatch(incrementByInput(Number(input)))}>IncrementByInput</button>
    </>)
}
export default Counter