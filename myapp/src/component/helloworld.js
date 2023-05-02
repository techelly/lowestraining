/**
 * Using arraow function we can create functional component
 * function HelloWorld(){
 *   const name = "Daniyal M";
    //HTML code below inside the return statement is known as JSX in ReactJS
    return(
        <>
            <p>Hello , I am {name} !</p>
        </>
    );
 * }
 */
const HelloWorld = ()=>{
    const name = "Daniyal M";
    //HTML code below inside the return statement is known as JSX in ReactJS
    return(
        //react fragment
        <>
            <p>Hello , I am {name} !</p>
        </>
    );

}

export default HelloWorld;