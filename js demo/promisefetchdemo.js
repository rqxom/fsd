console.log('START');
function fetchUserData(){
    fetch("https://fakestoreapi.com/users").
    then((response)=>{return response.json()})
    .then((data)=>console.log(data))
    .catch((err)=>console.log(err))
}
fetchUserData()

function fetchProducts(){
    fetch("https://fakestoreapi.com/products")
    .then((response)=>console.log(response.json()))
    .catch((err)=>console.log(err))
}
fetchProducts()
console.log('END')