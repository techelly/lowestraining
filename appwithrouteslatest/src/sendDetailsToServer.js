import axios from 'axios';
//import url from 'url';
//const url = require("url");
const sendDetailsToServer=(props)=>{
    let payload= {
        "email": props.email.toString(),
        "password":props.password.toString()
        }
    
    const customConfig = {
        headers: {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': '*'
        }
    };

   // const params = new url.URLSearchParams(payload.email); 
    /**
    axios.post('http://localhost:8080/login',payload,customConfig).then(function(response){
            console.log(response.status);
            console.log(response);
    }); */

    axios.get(`http://localhost:8080/logindetails?email=`+props.email.toString()).then(function (response){
        console.log(response.status);
        console.log(response);
    }

    );
}

export default sendDetailsToServer;