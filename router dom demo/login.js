import { useNavigate } from "react-router-dom"

function Login(){
    let navigate=useNavigate()
    const handleSubmit=(e)=>{
        e.preventDefault()
        navigate('/home')
    }
    return(<>
    <form onSubmit={handleSubmit}>
        <label htmlFor="email">Email</label>
        <input type="email"></input><br></br>

        <label htmlFor="pwd">Password</label>
        <input type="password"></input><br></br>
        <input type="submit" value="submit"></input>
    </form>
    </>)
}
export default Login