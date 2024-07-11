import { useEffect, useState } from "react"
import CardComp from "./CardComp"

function FetchProducts(){
    let [products,setProducts]=useState([])
    let [search,setSearch]=useState('')

    async function getAllProducts(){
        try{
            let response=await fetch("https://fakestoreapi.com/products")
            let data=await response.json()
            console.log(data)
            setProducts(data)
        }catch(err){
            console.log(err)
        }
    }
    useEffect(()=>{
        getAllProducts()
    },[])
    const handleSearch=(event)=>{
        setSearch(event.target.value)
    }
    let filteredProducts=search?products.filter((product)=>product.title.toLowerCase().includes(search.toLowerCase())):products
    return(<>
    <b>Search:</b> <input type="text" value={search} onChange={handleSearch}></input>
    {/* {JSON.stringify(products)} */}
    <div className="card-container">
    {filteredProducts && filteredProducts.map((product)=><CardComp product={product}></CardComp>)}
    </div>
    </>)
}
export default FetchProducts