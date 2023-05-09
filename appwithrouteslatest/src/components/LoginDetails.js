import React,{useState} from 'react';
import sendDetailsToServer from '../sendDetailsToServer';

function LoginDetails() {
    
    const [data,setData] = useState({
        email:"",
        password:""
    });
    
    const {email,password}=data;//destructuring
   
    const changeHandler = e=>{
        setData(
            {
                ...data,[e.target.name]: [e.target.value]
            }
        );
    }
    const submitHandler = e=>{
        e.preventDefault();
       sendDetailsToServer(data);
        console.log(data);
    }

   
    return(
    
        <div>
            <form onSubmit={submitHandler}>
                <label>User Name</label><br />
                <input type="text" name="email" value={email} onChange={changeHandler}/> <br />
                <input type="submit" name="submit"/>
            </form>
        </div>


    );
}
 
export default LoginDetails;