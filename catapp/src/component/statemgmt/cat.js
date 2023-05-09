import React, { useState } from "react";

const Cat = (props) => {
    //Here we are using useState(true) to initialize the isHungry variable
  const [isHungry, setIsHungry] = useState(true); //useState is React Hooks function
  return (
    <h1>
      <p>
        I am {props.name}, and I am {isHungry ? "hungry" : "full"}!
      </p>
      <button type="button"
        onClick={() => {
          setIsHungry(false);
        }}
        disabled={!isHungry}
        title={isHungry ? "Pour me some milk, please!" : "Thank you!"}
      >Check Hungry</button>
    </h1>
  );
}

export default Cat;