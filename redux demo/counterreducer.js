import { createSlice } from "@reduxjs/toolkit";

export const counterSlice=createSlice({
    name:'counter',
    initialState:{count:0},
    reducers:{
        increment:(state,action)=>{
            state.count=state.count+1
        },
        decrement:(state,action)=>{
            state.count=state.count-1
    },
    incrementByInput:(state,action)=>{
        console.log(action.payload)
        state.count=state.count+action.payload
}
}
})
export const {increment,decrement,incrementByInput}=counterSlice.actions
export default counterSlice.reducer