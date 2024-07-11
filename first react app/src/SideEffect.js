import { useEffect, useState } from "react"

function SideEffect(){
    let [content,setContent]=useState('')
    useEffect(()=>{
        setContent('This state variable content wii get initialized in useEffect')
    },[])

    return(<>
    {content}
    </>)
}
export default SideEffect