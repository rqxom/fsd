import { useState } from "react"

export default function ImageComponent(){
    let [imgSrc,setImageSrc]=useState("howgarts.jpg")
    const changeImage=()=>{
        alert('changeImage')
        if(imgSrc==='howgarts.jpg')
            setImageSrc('logo512.png')
        else{
            setImageSrc('howgarts.jpg')
        }
    }
    return(
        <>
        <img src={imgSrc} height="140px" width="140px" style={{'border-radius':'10px'}} onClick={()=>changeImage()}></img><br></br>
        <p style={{color:'blue','fontWeight':'bold'}}>This is a paragraph</p>
        </>)
}