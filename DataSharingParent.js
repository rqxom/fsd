import {useState} from 'react'
import DataSharingChild from './DataSharingChild'
function DataSharingParent(){
    let [color,setColor]=useState('black')
    const chooseColor=(color)=>{
        setColor(color)
    }
    return(<>
    <b>Parent Component</b>
    Choosen Color is {color}<br></br>
    <DataSharingChild chooseColor={chooseColor}></DataSharingChild>
    </>)
}
export default DataSharingParent