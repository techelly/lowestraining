import React from 'react';
import {Outlet,Link} from 'react-router-dom';

function Navbar(){
    return (
            <>
            <nav>
                <ul>
                <li>    
                <Link to ="/home"> Home </Link>
                </li>
                <li>
                <Link to ="/about"> About Us </Link>
                </li>
                <li>
                <Link to ="/shop"> Shop Now </Link>
                </li>
                <li>
                <Link to ="/login"> Login </Link>
                </li>
                <li>
                <Link to ="/register"> Register </Link>
                </li>
                <li>
                <Link to ="/logindetails"> LoginDetails </Link>
                </li>
                </ul>
            </nav>    
            <Outlet />
            </>

    );
}

export default Navbar;