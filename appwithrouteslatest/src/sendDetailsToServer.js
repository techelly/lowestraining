import axios from 'axios';
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
    /**
    axios.post('http://localhost:8080/login',payload,customConfig).then(function(response){
            console.log(response.status);
            console.log(response);
    }); */

    axios.get('http://localhost:8080/logindetails/',payload,customConfig).then(function (response){
        console.log(response.status);
        console.log(response);
    }

    );
}

export default sendDetailsToServer;