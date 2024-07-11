import logo from './logo.svg';
import './App.css';
import Counter from './counter';
import BankAccount from './bankaccount';
import Todo from './todos';

function App() {
  return (
    <div className="App">
      <Counter></Counter><br></br>
      <BankAccount></BankAccount><br></br>
      <Todo></Todo>
    </div>
  );
}

export default App;
