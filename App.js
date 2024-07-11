import logo from './logo.svg';
import './App.css';
import Greet from './Greet';
import UIButton from './UIButton';
import ImageComponent from './ImgComponent';
import ReusableList from './ReusableList';
import Parent from './Parent';
import ListComponent from './ListComponent';
import Counter from './Counter';
import Input from './InputComponent';
import EvenOrOdd from './EvenOrOdd';
import Arithmetic from './Arithmetic';
import DropDown from './DropDown';
import NameList from './NameList';
import ChangeColor from './ChangeColor';
import FilteringNames from './FilteringNames';
import Products from './Products';
import SideEffectComp from './SideEffectDemo';
import SideEffect from './SideEffect';
import FetchProducts from './FetchingProducts';
import FetchUsers from './FetchUsers';
import CardComp from './CardComp';
import Users from './Users';
import HelloWorld from './HelloWorldClass';
import Login from './loginlogout';
import GreetUser from './PropsInClass';
import CounterClass from './CounterClass';
import ConditionalRendering from './ConditionalRendering';
import UseRefDemo from './UseRefDemo';
import UseRefDemo1 from './UseRefDemo1';
import UseRefDemo2 from './UseRefDemo2';
import UseRefDemo3 from './UseRefDemo3';
import ProductForm from './Productform';
import Todo from './Todo';
import DataSharingParent from './DataSharingParent';
import DataSharingChild from './DataSharingChild';
import StudentDetails from './StudentDetails';

function App() {
  let title="List of Names"
  let names=["James","Joe","Tom","Clara","Smith","Adam","John"]

  let title1="List of fruits"
  let fruits=["Apple","Orange","Mango"]

  let title2="List of Products"
  let products=["Pen","Notebook","Pencil"]
  return (
    <div className="App">
      {/* <b>Hello World!!!</b>
      <Greet></Greet><br/>
      <UIButton></UIButton><br></br>
      <ImageComponent></ImageComponent>
      <ListComponent></ListComponent>
      <ReusableList heading={title} data={names}></ReusableList>
      <ReusableList heading={title1} data={fruits}></ReusableList>
      <ReusableList heading={title} data={products}></ReusableList>
      <Parent></Parent> */}
      {/* <Counter></Counter><br></br>
      <EvenOrOdd></EvenOrOdd><br></br>
      <Arithmetic></Arithmetic><br></br> */}
      {/* <Input></Input><br></br>
      <DropDown></DropDown><br></br>
      <NameList></NameList> */}
      {/* <ChangeColor></ChangeColor> */}
      {/* <FilteringNames></FilteringNames> */}
      {/* <Products></Products> */}
      {/* <SideEffectComp></SideEffectComp><br></br>
      <SideEffect></SideEffect><br></br> */}
      {/* <FetchProducts></FetchProducts><br></br> */}
      {/* <FetchUsers></FetchUsers><br></br>  */}
      {/* <CardComp></CardComp> */}

      {/* <FetchProducts></FetchProducts> */}
      {/* <Users></Users>
      <Login></Login><br></br>
      <HelloWorld></HelloWorld><br></br>
      <GreetUser name='John'></GreetUser><br></br>
      <CounterClass></CounterClass>
      <ConditionalRendering></ConditionalRendering> */}
      {/* <UseRefDemo></UseRefDemo><br></br>
      <UseRefDemo1></UseRefDemo1><br></br> */}
      {/* <UseRefDemo2></UseRefDemo2><br></br> */}
      {/* <UseRefDemo3></UseRefDemo3><br></br> */}
      {/* <ProductForm></ProductForm><br></br> */}
      {/* <DataSharingParent></DataSharingParent> */}
      <StudentDetails></StudentDetails>
      {/* <Todo></Todo> */}
    </div>
  );
}

export default App;
