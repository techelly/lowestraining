import React, { Component } from 'react';
import CatClass from './catclass';

import imageLilly from '../assets/images/lilly.jfif';
class CafeClass extends Component{
    render(){
        return(
            <>
            <CatClass   name='Lilly' img={imageLilly} food={["milk","cheese"]} age={2}/>
            </>
        );
    }
}

export default CafeClass;