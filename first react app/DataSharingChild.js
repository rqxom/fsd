function DataSharingChild({chooseColor}){
    const handleChange=(event)=>{
        chooseColor(event.target.value)
    }
    return(<>
    <b>Child Component</b>
    <select onChange={handleChange}>
        <option value='Red'>Red</option>
        <option value='Blue'>Blue</option>
        <option value='Yellow'>Yellow</option>
        <option value='Orange'>Orange</option>
        <option value='Green'>Green</option>
    </select>
    </>)
}
export default DataSharingChild