//Here http module of node js is imported in this program or file
const http = require('http');
const hostname = '127.0.0.1';//ip address of localhost
const port = 3000; // port number on which our web or http server will listen the request from client or end user
/**
 * In http module we have createServer function
 */
const server = http.createServer((req, res) => {
    res.statusCode = 200;
    res.setHeader('Content-Type', 'text/plain');
    res.end('Hello World');
  });

  /**
   * listen function is a higher order function which takes arrow function as an argument
   */
  server.listen(port, hostname, () => {
    console.log(`Server running at http://${hostname}:${port}/`);
  });