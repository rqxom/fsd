import logo from './logo.svg';
import './App.css';
import Counter from './Counter';
import Account from './Account';
import Todos from './Todos';
import UseMemoDemo from './UseMemoDemo';
import UseMemoDemo1 from './UseMemoDemo1';
import Book from './Book';
import Posts from './posts';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Layout from './layout';
import Post from './post';

function App() {
  return (
    <div className="App">
      
       {/* <Counter></Counter>
       <Account></Account> */}
       {/* <Todos></Todos> */}
       {/* <UseMemoDemo a='10' b='20'></UseMemoDemo> */}
       {/* <UseMemoDemo1></UseMemoDemo1><br></br>
       <Book></Book> */}
      {/* <Posts></Posts> */}
      <BrowserRouter>
       <Routes>
        <Route path='/' element={<Layout></Layout>}>
        <Route path='/posts' element={<Posts></Posts>}></Route>
        <Route path='/post/:id' element={<Post></Post>}></Route>
        </Route>
      </Routes>
      </BrowserRouter>
     
    </div>
  );
}

export default App;
