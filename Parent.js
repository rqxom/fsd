import Child from "./Child";

function Parent(){
    return(<>
    <Child txtColor='red' text='This is message from Parent'></Child>
    <Child txtColor='blue' text='There is a message from Parent'></Child>
    </>)
}
export default Parent