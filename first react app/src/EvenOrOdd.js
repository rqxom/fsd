import { useState } from "react"

function EvenOrOdd(){
    let [num,setNum]=useState(0)
    let [result,setResult]=useState('')
    const isEven=()=>{
        if(num%2===0)
            setResult(`Entered number ${num} is Even`)
        else
        setResult(`Entered number ${num} is odd`)
    }

    return(<>
    <b>Enter the number</b><br></br>
    <input type="text" value={num} onChange={(event)=>setNum(event.target.value)}></input><br></br>
    <button onClick={()=>isEven()}>submit</button><br></br>
    {result}
    </>)
}
export default EvenOrOdd