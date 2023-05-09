import React from 'react';
import ReacDOM from 'react-dom';
import {BrowserRouter} from 'react-router-dom';
import App from './App';

ReacDOM.render(
    <BrowserRouter>
        <App />
    </BrowserRouter>,
    document.getElementById('root')
);