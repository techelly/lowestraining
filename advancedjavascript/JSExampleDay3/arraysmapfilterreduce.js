/**
 * Array map(),filter() and reduce() function 
 * map() it creates a new array from calling a function for every array element
 * it does not execute the function for empty elements
 * it does not change the original array
 * 
 * Syntax:
 * map(function(currentValue,index,arr),thisValue)
 * function()  Required. A function to be run for each array element
 * currentValye Required. The value of the current element
 * index    Optional . The index of the current element
 * arr      Optional the array of the current element
 * thisValue Optional Default value is undefined. A value passed to the function to be used as its this value
 * 
 * This function will return an Array
 */

const numbers = [4,9,16,25];
const nArr=numbers.map(Math.sqrt);//map() returns a new array with square root of all element values
console.log(nArr);

const nums = [5,4,2,6];
const nArray = nums.map(cubeOf);

function cubeOf(value){
    return value*value*value;
}

console.log(nArray);


const students =[
    {firstName:"Rahul", lastName:"Raj"},
    {firstName:"Adah", lastName:"Sharma"},
    {firstName:"Rakul", lastName:"Preet"},
    {firstName:"Akshay", lastName:"Kumar"}
];

const studArray = students.map(getFullName);

function getFullName(name){
    return [name.firstName,name.lastName].join(" ");
}

console.log(students);
console.log(studArray);

console.log("*******************filter***************************");
/**
 * filter() it creates a new array filled with elements that pass a test provided by a function
 * it does not execute the function for empty elements
 * it does not change the original array
 * 
 * Syntax:
 * filter(function(currentValue,index,arr),thisValue)
 * function()  Required. A function to be run for each array element
 * currentValye Required. The value of the current element
 * index    Optional . The index of the current element
 * arr      Optional the array of the current element
 * thisValue Optional Default value is undefined. A value passed to the function to be used as its this value
 * 
 * This function will return an Array
 */

const ages=[10,5,18,30,45,21,17];

function checkAges(age){
    if(age>=18){
        return age;
    }
}


const voters = ages.filter(checkAges);
console.log(voters);

console.log("*******************reduce***************************");
/**
 * reduce() method executes a reducer function for an array element.
 * method will return a single value: the function's accumulated result.
 * method doest not execute the function for empty array elements.
 * method doest not change the original array
 * 
 * const arrNum = [1,2,3,4];

 */
const arrNum = [1,2,3,4];
let result = arrNum.reduce(multiply);
function multiply(x,y){
    return x*y;
}
console.log(result);