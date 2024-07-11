import { useEffect, useState } from "react";
import UserCard from "./UserCard";
import Table from 'react-bootstrap/Table';
function Users() {
  let [users, setUsers] = useState([]);
  let [search, setSearch] = useState("");
  let [displayFmt,setDisplayFmt]=useState('table')
  const handleChange=(event)=>{
    setDisplayFmt(event.target.value)
    console.log(event.target.value)
  }
  const handleSearch = (event) => {
    setSearch(event.target.value);
  };
  let filteredUsers = search
    ? users.filter(
        (user) =>
          user.name.toLowerCase().includes(search.toLowerCase()) ||
          user.address.city.toLowerCase().includes(search.toLowerCase())
      )
    : users;
    async function getAllUsers() {
        try {
          let response = await fetch("https://jsonplaceholder.typicode.com/users");
          let data = await response.json();
          console.log(data);
          setUsers(data); //array of user objects
        } catch (err) {
          console.log(err);
        }
      }
      useEffect(() => {
        getAllUsers();
      }, []);
      return (
        <>
        <b>Select display format</b><select value={displayFmt} onChange={handleChange}>
            <option value='div'>DIV</option>
            <option value='table'>TABLE</option>
            <option value='card'>CARD</option>
        </select>
          <b>Search </b>{" "}
          <input type="text" value={search} onChange={handleSearch}></input>
          {filteredUsers && displayFmt==='div' &&
            filteredUsers.map((user) => (
              <div>
                {JSON.stringify(user)}
                <hr />
              </div>
            ))}
          <div className="card-container">
            {filteredUsers && displayFmt==='card' &&
              filteredUsers.map((user) => <UserCard user={user}> </UserCard>)}
          </div>
          {filteredUsers && displayFmt==='table' &&
          <Table striped bordered hover>
      <thead>
        <tr>
          <th>Username</th>
          <th>name</th>
          <th>address</th>
          <th>email</th>
        </tr>
      </thead>
      <tbody>
        {filteredUsers.map((user)=><tr><td>{user.username}</td><td>{user.name}</td><td>{user.address.city}</td><td>{user.email}</td></tr>)}
      </tbody>
    </Table>
}
    </>
  );
}
export default Users;