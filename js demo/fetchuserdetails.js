async function getUserDetails(){
    let users=[]
    // await fetch("https://fakestoreapi.com/users").then((response)=>response.json()).then((data)=>users=data)

    try{
        let response=await fetch("https://fakestoreapi.com/users")
        users=response.json()
    }catch(err){
        console.log(err)
    }
    console.log(users)
}
getUserDetails()