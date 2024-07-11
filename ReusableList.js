function ReusableList(props){
    let title=props.heading
    let values=props.data
    return(<>
    <h3>{title}</h3>
    <ul>
        {values?values.map((value)=><li>{value}</li>):''}
    </ul>
    </>)
}
export default ReusableList