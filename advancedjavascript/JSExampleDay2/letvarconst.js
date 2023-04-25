//variable a cannot be used here
var a ="Karthik";// Global Scope
function greet(){
    //variable a can be used here inside the function
    //var  a= "hello"; // Local Scope  I am reassigning a variable a with value "hello"
    a = "Hello"; // within function scope we are changing the value of varibale a 
    console.log("-----"+a +"---");
}
console.log(a);
var a ="S "; //Redeclaration the value to variable a
a ="S "; //Reassigning the value to variable a
greet();//hello


console.log("*****************************Let example******************");
/**
 * let is block-scoped
 * The variable declared with let can only be accessed inside a block of code
 * 
 * let doesn't allow to redeclare variables
 */

function greetings(){
    let msg="hello";
    //variable msg2 cannot be used here
    if(msg == "hello"){
        msg="how are you ?";
        let msg2 = "world";
        console.log(msg+ ' ' +msg2);       
    }
    //let msg="How are you ?";// error 
      //variable msg2 cannot be used here
    //console.log(msg+ ' ' +msg2);   //error    
}

greetings();


/**
 * const keyword
 */
const mymsg="JS is interesting !!";
console.log(mymsg);
//mymsg="Oh No its too boring !"; //Assignment to constant variable is not allowed
//console.log(mymsg);


/**
 * Javascript Hoisting:-
 * Hositing is JS's default behaviour of moving declaration to the top
 * 
 * In JS a variable can be declared after it has been used
 * 
 */

//var variables are hoisted to the top of the scope of the program
z=5;// Intialized or use it 
console.log(z);// used
var z; // declare it //undefined or 5 (not an error);

//let doesn't allow hoisting
n=6;
console.log(n);
let n; // n is not defined error
