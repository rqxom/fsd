function ListComponent(){
    let names=["John","James","Smith","Clara"]
    let fruits=["Apple","Orange","Mango","Starawberry"]
    return(<>
    <h3>List of names</h3>
    <ul>
        {/* STATIC WAY OF DISPLAYING LIST */}
        {/* <li>John</li>
        <li>James</li>
        <li>Smith</li>
        <li>Clara</li>  */}
        {/* Displaying array of values in JSX - Dynamic */}
        {/* if names is not undefined then return li else return empty string '' */}
        {names?names.map((name)=><li>{name}</li>):'Loading....'}
    </ul>
    <h3>List of Fruits</h3>
    <ul>
        {fruits?fruits.map((fruit)=>{return <li>{fruit}</li>}):''}
        {/* if fruits is not yet initialized */}
    </ul>
    </>)
}
export default ListComponent