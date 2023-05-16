/**
 * What is Axios?
 * Axios is an HTTP client library that allows you to make requests to a given endpoint:
 * This could be an external API or your own backend Node.js server, for example.
 * By making a request, you expect your API to perform an operation according to 
 * the request you made.
 * For example, if you make a GET request, you expect to get back data to display 
 * in your application.
 * Why Use Axios in React
 * There are a number of different libraries you can use to make these requests, 
 * so why choose Axios?
 * Here are five reasons why you should use Axios as your client to make HTTP requests:
 * 1. It has good defaults to work with JSON data. Unlike alternatives such as the 
 * Fetch API, you often don't need to set your headers. Or perform tedious tasks like converting your request body to a JSON string.
 * Axios has function names that match any HTTP methods. To perform a GET request, 
 * you use the .get() method.
 * 2.Axios does more with less code. Unlike the Fetch API, you only need one .then() 
 * callback to access your requested JSON data.
 * 3.Axios has better error handling. Axios throws 400 and 500 range errors for you. 
 * Unlike the Fetch API, where you have to check the status code and throw 
 * the error yourself.
 * 4.Axios can be used on the server as well as the client. If you are writing a Node.js 
 * application, be aware that Axios can also be used in an environment separate from 
 * the browser.
 * 
 */

import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
//import Tutorials from "./components/addtutorials";

ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);
