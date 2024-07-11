import {useReducer,useState} from 'react'
let initialState={count:0}
const reducer=(state,action)=>{
    switch(action.type){
        case 'increment':
            return {count:state.count+1}
        case 'decrement':
            return {count:state.count-1}
        case 'incrementByInput':
            return {count:state.count + action.payload}
        default:
            return {count:state.count}
    }
}
function Counter(){
    let [state,dispatch]=useReducer(reducer,initialState)
    let [input,setInput]=useState()
    return(<>
    <b>Enter value</b><input type="text" value={input} onChange={(event)=>setInput(event.target.value)}></input>
    <button onClick={()=>dispatch({'type':'increment'})}>Increment</button>
    <b>Count:{state.count}</b>
    <button onClick={()=>dispatch({'type':'decrement'})}>Decrement</button><br></br>
    <button onClick={()=>dispatch({'type':'incrementByInput','payload':Number(input)})}>Increment By Input</button><br></br>
    <button>Decrement By Input</button>
    </>)
}
export default Counter