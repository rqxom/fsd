let pricedetails=new Map()
pricedetails.set('Product1',100)
pricedetails.set('Product2',200)
pricedetails.set('Product3',500)
export function getPrice(productname){
    return pricedetails.get(productname)
}