import React, { Component } from 'react';
class CatClass extends Component{
    render(){
        return(
            <>
            <p>I am also a cat and my name is {this.props.name} and age is {this.props.age} . Food I love  {this.props.food[0]} and {this.props.food[1]}</p>
            <p>I look like <img src={this.props.img} height="200px"  width="100px" alt="maasi"/> </p>
            </>
        );
    }
}

export default CatClass;