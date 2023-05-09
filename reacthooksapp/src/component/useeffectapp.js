import {useEffect,useState} from 'react';
//Below example , component sets the document title after React updates the DOM:

function UseEffectApp(){
    const [firstName, setFirstName]=useState("Tom");
     //When we call useEffect, we are telling React to run our "effect" function after
    //flushing changes to the DOM.
    //Effects are declared inside the component so they have access to its props and state
    //By default, React runs the effects after every render-- including the first render
    useEffect(()=>{
        //Update the document title using the browser API
        document.title=`Those who are sleeping please wake up specially ${firstName}`;
    });
    return(
        <div>
        <p>You all {firstName}  Good Morning</p>
        <button onClick={()=> setFirstName('Elly')}>Click</button>
    </div>
    );
}

export default UseEffectApp;