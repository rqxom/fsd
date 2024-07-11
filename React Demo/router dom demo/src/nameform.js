import { useState } from "react";
import { useNavigate } from "react-router-dom";
function NameForm(){
    let [name,setName]=useState()
    let navigate=useNavigate()
    const handleClick=()=>{
        navigate(`/greet/${name}`)
    }
    return(<>
    <b>Enter your name</b>
    <input type="text" value={name} onChange={(e)=>setName(e.target.value)}></input>
    <button onClick={handleClick}>submit</button>
    </>)
}
export default NameForm