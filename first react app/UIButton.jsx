import './sample.css'
function UIButton(){
    const greet=()=>{
        alert('Hello...')
    }
    function sayBye(){
        alert('BYE')
    }
    return(
        <>
        <button className="btn-class" onClick={()=>greet()}>Click Me</button>
        <br></br>
        <button onClick={()=>sayBye()}>Bye</button>
        </>
    )
}
export default UIButton