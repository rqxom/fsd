import logo from './logo.svg';
import './App.css';
import Sample from './sample';
import Button from './button';
import Panel from './panel';
import Child from './Child';
import {createContext,useState} from 'react'
import Box from './Box';
export const NameProvider=createContext()

function App() {
  let [color,setColor]=useState('grey')
  let [theme,setTheme]=useState('light')
  return (
    <div className="App">
      <select onChange={(event)=>setColor(event.target.value)}>
        <option value='red'>Red</option>
        <option value='blue'>Blue</option>
        <option value='green'>Green</option>
      </select>
      <select onChange={(event)=>setTheme(event.target.value)}>
        <option value='light'>light</option>
        <option value='dark'>dark</option>
      </select>
      <NameProvider.Provider value={{'name':'John','color':color,'theme':theme}}>
      <Sample>Text to be displayed in Sample Component</Sample>
      <Panel>
        <h1>Panel1</h1>
        <p>This is paragraph in panel 1</p>
        <Button color="white">SignIn</Button>
        <Button>SignOut</Button>
      </Panel>

      <Panel>
        <h1>Panel2</h1>
        <p>This is paragraph in panel 2</p>
        <Button color="green">Login</Button>
        <Button color="green">logout</Button>
      </Panel>
      <Child></Child>
      <Box>This is text</Box>
      </NameProvider.Provider>
    </div>
  );
}

export default App;
