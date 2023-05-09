import React from 'react';
import Home from "./components/Home";
import AboutUs from "./components/About";
import Shop from "./components/Shop";
import Errors from "./components/Errors";
import Navbar from "./components/Navbar";
import Login from "./components/Login";
import Register from "./components/Register";
import LoginDetails from "./components/LoginDetails";
import {BrowserRouter,Routes,Route} from 'react-router-dom';

function  App () {
        return (
            <BrowserRouter>
            <Routes>
                        <Route path="/" element={<Navbar />} />
                        <Route path="/home" element={<Home />} />
                        <Route path="/about" element={<AboutUs />}  />
                        <Route path="/shop" element={<Shop />}  />
                        <Route path="/login" element={<Login />}  />
                        <Route path="/logindetails" element={<LoginDetails />}  />
                        <Route path="/register" element={<Register />}  />
                        <Route element={<Errors />} />
            </Routes>
            </BrowserRouter>
         
        )


}

export default App;