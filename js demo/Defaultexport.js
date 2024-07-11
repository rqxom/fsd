function greet(name){
    let newName=initCap(name)
    return 'Welcome ' + newName
}

function initCap(name){
    return name.charAt(0).toUpperCase()+name.slice(1)
}
export default greet