/**
 *  JavaScript Call Back Function , Arrow Function
 * Call Back Function :- is a function passed as an argument to another function
 * This allows a function to call another function. 
 * It can run after another function has finished.
 */
function addition(num1,num2){
    let sum = num1+num2;
    console.log("Sum of two numbers is "+sum);
    return sum;
}
function multiply(x,y){
    console.log("Multiplication of two numbers is ---"+x*y);
    addition(x,y);
    return x*y;
}

let result = multiply(2,4);
console.log("Result is ---"+result);
//Call Back to display the result in  console
function displayResult(r){
    console.log("Result of division is ---"+ r);
}
//Actual function which accepts callback function as an argument
function division(a,b,myCallback){
    let res = a/b;
    console.log("Inside division function");
    myCallback(res);
}
division(4,2,displayResult); //calling the function 
//Below line arrow function (i.e. call back function)is used to pass as an argument
division(10,2,(m)=>{console.log("Division of 10 and 2 is ---"+m)}); 