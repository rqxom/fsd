let productdetails=new Map()
productdetails.set("Pen",100)
productdetails.set("Pencil",20)
productdetails.set("Pen",50)
function getProductPrice(productname){
    let price=productdetails.get(productname)
    return new Promise((resolve,reject)=>{
        if(price)
            resolve({'price':price})
        else reject("Productname doesnt exists")
    })
}
let resultPromise=getProductPrice('axk')
resultPromise.then((data)=>console.log(data))
             .catch((err)=>console.log(err))