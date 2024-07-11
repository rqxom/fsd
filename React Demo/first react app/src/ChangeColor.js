import { useState } from "react"

function ChangeColor(){
    let [color,setColor]=useState('black')

    const handleChange=(event)=>{
        setColor(event.target.value)
    }

    return(<>
    <b>Select a color</b><br></br>
    <select onChange={handleChange}>
        <option value="red">Red</option>
        <option value="blue">Blue</option>
        <option value="violet">Violet</option>
        <option value="green">Green</option>
        <option value="orange">Orange</option>
    </select>
    <p style={{color:color}}>This text will be displayed in {color} color</p>
    </>)
}
export default ChangeColor