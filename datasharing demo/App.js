import './App.css';
import BoxComponent from './BoxComponent.js';
import Welcome from './Welcome.js';

function App() {
    return (
        <div className="App">
            <BoxComponent bgcolor='red' text='Box2'></BoxComponent>
            <BoxComponent bgcolor='green' text='Box1'></BoxComponent>
            <Welcome name='John'></Welcome><br/>
            <Welcome name='James'></Welcome>
        </div>
    );
}
export default App;