import { useState } from "react"

function FilteringNames(){
    let [names,setNames]=useState(['James','Adam','Smith','Clara','Tom','John','Alice'])
    let [filteredNames,setFilteredNames]=useState(names)
    let [searchValue,setSearchValue]=useState('')

    const filter=()=>{
        if(searchValue===''){
            setFilteredNames([...names])
        }
        else{
            filteredNames=names.filter((name)=>name.includes(searchValue))
            setFilteredNames([...filteredNames])
        }
    }
    const handleChange=(event)=>{
        setSearchValue(event.target.value)
        filter()
    }
    return(<>
    <b>Search: </b> <input type="text" value={searchValue} onChange={handleChange}></input><br></br>
    <b>List of Names</b><br></br>
    <ul>
        {filteredNames?filteredNames.map((name)=><li>{name}</li>):''}
    </ul>
    </>)
}
export default FilteringNames