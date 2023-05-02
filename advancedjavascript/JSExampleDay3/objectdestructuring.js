/**
 * Destructuring is a JS expression that allows us to 
 * extract data from arrays,objects and maps and set them into new distinct variables.
 * It allows us to extract multiple properties, or items from an array at a time.
 * 
 * let {var1,var2}={var1:value1,var2:value2}
 * 
 * The right side of the statement contains the JS object that we want to split into variables;
 * the left side contains a pattern for the corresponding properties of the object.
 * The "pattern" is usually a list of variable names
 */

let employee={
    firstName:"Madhuri",
    lastName:"Nene",
    dateofbirth:"1974"
}
//Destructing of employee object
let {firstName,lastName,dateofbirth} = employee;
console.log(firstName,lastName,dateofbirth);

//Destructing of employee object with different variable name
let {fName,lName,dob} = employee;
console.log(fName,lName,dob);