function Cat(props){
    return(
    <>
        <p>I am also a cat and my name is {props.name} and age is {props.age} . Food I love  {props.food[0]} and {props.food[1]}</p>
        <p>I look like <img src={props.img} height="200px"  width="100px" alt="maasi"/> </p>
    </>
    );
}

export default Cat;