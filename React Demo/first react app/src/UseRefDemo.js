import {useRef} from 'react'
function UseRefDemo(){
    let pref=useRef()
        const handleClick=()=>{
            pref.current.style.fontWeight='bold'
            pref.current.style.color='blue'
        }
        return(<>
            <p ref={pref}>This is a paragraph</p>
            <button onClick={handleClick}>Click me</button>
            </>)
    }
export default UseRefDemo