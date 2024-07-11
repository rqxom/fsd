import { useState } from "react";
//REUSABLE SEARCH COMPONENT
//Filtering students, products, employees, fruits, cart
function SearchComponent({handleSearch}){
   let [searchTerm,setSearchTerm]=useState('')
 
   const handleChange=(event)=>{
    setSearchTerm(event.target.value)
    handleSearch(event.target.value)//calling a function in the parent
   }

   return(<>
   <b>CHILD COMPONENT</b>
   <b>Search</b><input type="text" value={searchTerm} onChange={handleChange}></input><br></br>
   </>)
}
export default SearchComponent