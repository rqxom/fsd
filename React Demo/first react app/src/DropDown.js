import { useState } from "react"

function DropDown(){
    let [city,setCity]=useState('')
    return(<>
    <b>Select a city</b><br></br>
    <select onChange={(event)=>setCity(event.target.value)}>
        <option value='CHN'>Chennai</option>
        <option value='BANG'>Banglore</option>
        <option value='DEL'>Delhi</option>
        <option value='KOL'>Kolkata</option>
    </select>
    {`you have selected ${city}`}
    </>)
}
export default DropDown