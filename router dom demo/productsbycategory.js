import { json, useParams } from "react-router-dom";
import { useState,useEffect } from "react";
import CardComp from "./CardComp";

function ProductsByCategory(){
    let {category}=useParams()
    let [products,setProducts]=useState([])

    async function productsByCategory(){
        try{
            let response=await fetch(`http://fakestoreapi.com/products/category/${category}`)
            let data=await response.json()
            setProducts(data)
        }catch(err){
            console.log(err)
        }
    }
    useEffect(()=>{
        productsByCategory()
    },[category])
    return(<>
    <b>You have selected the category {category}</b>
    {/* {JSON.stringify(products)} */}
    {/* <table>
        {products && products.map((p)=><tr><td>{p.title}</td><td>{p.category}</td><td>{p.image}</td><td>{p.rating.rate}</td></tr>)}
    </table> */}
    {products && products.map((p)=><CardComp product={p}></CardComp>)}
    </>)
}
export default ProductsByCategory