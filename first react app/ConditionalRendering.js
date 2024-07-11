import React, { Component } from 'react';
class ConditionalRendering extends Component {
    constructor(props) {
        super(props);
        this.state={
            isLoggedIn:false
        };
    }
    toggleLogin=()=>{
        this.setState({isLoggedIn:!this.state.isLoggedIn});
    };
    render(){
        return(
            <div>
                {this.state.isLoggedIn ? (
                    <h1>Welcome back!</h1>
                ) : (
                    <h1>Please log in.</h1>
                )}
                <button onClick={this.toggleLogin}>
                    {this.state.isLoggedIn ? 'Logout' : 'Login'}
                </button>
            </div>
        );
    }
}
export default ConditionalRendering;