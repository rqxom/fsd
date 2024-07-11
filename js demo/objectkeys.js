let product={
    'title':'pen',
    'price':100.50,
    'category':'xyz',
    'rating':4.3
}
console.log(Object.keys(product))
let user={
    'username':'john',
    'email':'john@gmail.com',
    'address':{
        'street':'xyz',
        'city':'chn',
        'pincode':'600601'
    },
    'gender':'male',
    'password':'john@124'
}
const {username,password}=user
console.log(username)
console.log(password);