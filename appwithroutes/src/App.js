import React from 'react';
import Home from "./components/Home";
import AboutUs from "./components/About";
import Shop from "./components/Shop";
import Errors from "./components/Errors";
import Navbar from "./components/Navbar";
import {Switch,Route} from 'react-router-dom';

function  App () {
        return (
            <main>
                    <Navbar />
                    <Switch>
                        <Route path="/" component={Home} exact />
                        <Route path="/about" component={AboutUs}  />
                        <Route path="/shop" component={Shop} exact />
                        <Route component={Errors} />
                    </Switch>
            </main>           
        )


}

export default App;