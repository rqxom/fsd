import { useContext } from "react"
import { NameProvider } from "./App"

function GreatGrandChild({name}){
    const context=useContext(NameProvider)
    return(<>
    <b>GreatGrandChild</b><br></br>
    {/* <b>By using props drilling : {name}</b><br></br> */}
    <b>By using Context :{context.name}</b>
    </>)
}
export default GreatGrandChild