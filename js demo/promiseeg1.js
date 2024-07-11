let value=100;
let promiseObj=new Promise((resolve,reject) => {
    if(value<150)
        resolve(value);
    else reject("failure");
});
promiseObj
          .then((data)=>console.log(data))
          .catch((err)=>console.log(err))