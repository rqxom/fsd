import {useReducer,useState} from 'react'
let initialState={name:'John',accno:'Ac123',balance:10000,error:null}
const reducer=(state,action)=>{
    switch(action.type){
        case 'withdraw':
            if((state.balance - action.payload)<500)
                return {...state,error:'Insufficient balance'}
            else
            return {...state, balance:state.balance - action.payload,error:null}      
        case 'deposit':
            return {...state, balance:state.balance + action.payload,error:null}
        case 'checkbalance':
            return {...state,balance:state.balance,error:null}
    }
}
function BankAccount(){
    let [state,dispatch]=useReducer(reducer,initialState)
    let [amount,setAmount]=useState(0)
    let [showBalance,setShowBalance]=useState(false)
    return(<>
    <b>Name:</b>{state.name}<br></br>
    <b>Accno</b>{state.accno}<br></br>
    <b>Enter the amount</b><input type="text" value={amount} onChange={(event)=>setAmount(event.target.value)}></input>
    <br></br>
    <button onClick={()=>dispatch({'type':'withdraw','payload':Number(amount)})}>withdraw</button><br></br>
    <button onClick={()=>dispatch({'type':'deposit','payload':Number(amount)})}>deposit</button><br></br>
    <button onClick={()=>{setShowBalance(true);dispatch({'type':'checkbalance'})}}>checkbalance</button><br></br>
    {showBalance && <b>Balance is {state.balance}</b> }<br></br>
    {state.error && <p style={{color:'red'}}>{state.error}</p>}
    </>)
}
export default BankAccount