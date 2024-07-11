import { Outlet } from "react-router-dom";
import Footer from "./footer";
import Header from "./header";

function Layout(){
    return(<>
    <Header></Header>
    <Outlet></Outlet><br></br>
    <Footer></Footer>
    </>)
}
export default Layout