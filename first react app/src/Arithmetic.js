import { useState } from "react"
function Arithmetic(){
    let [num1,setNum1]=useState(0)
    let [num2,setNum2]=useState(0)
    let [result,setResult]=useState(0)

    const add=()=>{
        setResult(num1+num2)
    }

    return(<>
    <b>Enter Number 1</b><br></br>
    <input type="text" value={num1} onChange={(event)=>setNum1(Number(event.target.value))}></input>
    <br></br>
    <b>Enter Number 2</b><br></br>
    <input type="text" value={num2} onChange={(event)=>setNum2(Number(event.target.value))}></input>
    <br></br>
    <button onClick={()=>add()}>Add</button><br></br>
    {result}
    </>)
}
export default Arithmetic