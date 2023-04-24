function addition(num1,num2){
    let sum = num1+num2;
    console.log("Sum of two numbers is "+sum);
    return sum;
}

let add = addition(10,5);
console.log(add);
//Arrow
//Concise way of writing a function 
let sub =(num3,num4)=>{return num3-num4};
let result = sub(4,2);
console.log("Difference of two numbers is --- "+result);