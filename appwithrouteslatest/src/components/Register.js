import React,{useState} from 'react';
function Register(){
/**
    const [regdata,setRegdata] = useState({
        email:"",
        password:"",
        username:""
    });
    
    const {email,password,username}=regdata;//destructuring
    const changeHandler = e=>{
        setRegdata(
            {
                ...regdata,[e.target.name]: [e.target.value]
            }
        );
    }
    const submitHandler = e=>{
        e.preventDefault();
       // sendDetailsToServer(data);
        console.log(regdata);
    }
    return(
        <div>
            <form onSubmit={submitHandler}>
                <label>User Name</label><br />
                <input type="text" name="username" value={username} onChange={changeHandler}/> <br />
                <label>Email</label><br />
                <input type="text" name="email" value={email} onChange={changeHandler}/> <br />
                <label>Password</label><br />
                <input type="password" name="password" value={password} onChange={changeHandler}/> <br />
                <input type="submit" name="submit"/>
            </form>
        </div>
    ); */

    return (<><h1>Register Page</h1></>);
}
export default Register();