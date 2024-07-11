import {useState} from "react"

function Input(){
    let [name,setName]=useState('')
    let [age,setAge]=useState(0)

    const handleChange=(event)=>{
        console.log(event.target)
        setName(event.target.value)
    }
    return(<>
    <b>Enter your name</b><br></br>
    {/* <input type="text" value={name} onChange={(event)=>{console.log(event.target);setName(event.target.value)}}></input><br></br> */}
    <input type="text" value={name} onChange={handleChange}></input><br></br>
    <input type="text" value={age} onChange={(event)=>setAge(event.target.value)}></input><br></br>
    {name}<br></br>
    {age}
    </>)
}
export default Input