import {useState} from "react"
function NameList(){
    let [names,setNames]=useState([])
    let [inputName,setInputName]=useState('')

    const addName=()=>{
        names.push(inputName)
        console.log(names)
        setNames([...names])
    }

    return(<>
    <b>Enter name</b><br></br>
    <input type="text" value={inputName} onChange={(event)=>setInputName(event.target.value)}></input>
    <button onClick={()=>addName()}>+</button>
    <b>List of names</b><br></br>
    <ul>
        {names?names.map((name)=><li>{name}</li>): ''}
    </ul>
    </>)
}
export default NameList