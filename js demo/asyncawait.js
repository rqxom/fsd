function validateEmail(email) {
    let setOfEmails = new Set([
        "John@gmail.com",
        "James@gmail.com",
        "clara@gmail.com",
        "smith@gmail.com",
    ]);
    return new Promise((resolve, reject) => {
        if(setOfEmails.has(email)) setTimeout(resolve(true), 5000);
        else setTimeout(reject(false), 5000);
    });
}
// async function checkEmail(){
//     let validEmail=await validateEmail("joe@gmail.com").then((data)=>data).catch((err)=>err)
//     console.log(validEmail)
// }
async function checkEmail() {
    let validEmail;
    try {
        validEmail = await validateEmail("John@gmail.com");
    } catch (err) {
        console.log("catch block " + err);
        validEmail = err;
    }
    console.log(validEmail);
}
checkEmail();