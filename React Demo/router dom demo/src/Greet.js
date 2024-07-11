import { useParams } from "react-router-dom";

function Greet(){
    let {name}=useParams()
    return(<>
    <b>Welcome {name}</b>
    </>)
}
export default Greet