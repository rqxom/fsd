import { useEffect, useState } from "react";
import Table from 'react-bootstrap/Table';

function FetchUsers(){
    let[users,setUsers]=useState([])

    async function getAllUsers(){
        try{
            let response=await fetch("https://fakestoreapi.com/users")
            let data=await response.json()
            setUsers(data)
        }catch(err){
            console.log(err)
        }
    }
    useEffect(()=>{
        getAllUsers()
    },[])
    return(<>
    <Table striped bordered hover variant="dark">
      <thead>
        <tr>
          <th>ID</th>
          <th>Email</th>
          <th>Username</th>
          <th>Firstname</th>
          <th>Lastname</th>
        </tr>
      </thead>
      <tbody>
        {users && users.map((user)=>(
            <tr>
                <td>{user.id}</td>
                <td>{user.email}</td>
                <td>{user.username}</td>
                <td>{user.name.firstname}</td>
                <td>{user.name.lastname}</td>
            </tr>
        ))}
      </tbody>
    </Table>
    </>
    );
}
export default FetchUsers