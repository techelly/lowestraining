/**
 * Javascript Arrays
 * A special variable , which can hold one or more than one value
 * Elements in JS array you can access using the index position starting with 0 to length-1
 */    
const names=["Rahul","Ram","Karan","Arjun"];//array of names
const numbers=[1,2,3,4,5,6,7,8,9,10];//array of numbers
const mixdatatypes=["Rahul","Ram",5,6,7,8.5];//in JS we can have more than one value of different data type
console.log(typeof(names));
console.log(typeof(numbers));
console.log(typeof(mixdatatypes));
console.log(names[1]);
console.log(names.length);
/**
 * Creating an Array using new keyword and invoking Array ()
 */
const ages =new Array();
ages[0]=18;
ages[1]=10;
console.log(typeof(ages));
console.log(ages);

/**
 * methods of arrays
 */
names.sort();
console.log(names);
names.reverse();
console.log(names);
console.log("*******************************************************")
const fruits =["Mango","Litchi","Kiwi","Strawberry"];
let fruitsLength = fruits.length;
for(let index=0;index<fruitsLength;index++){
    console.log(fruits[index]);
}
console.log("*****************************forEach**************************")
fruits.forEach(display);

function display(value){
    console.log(value);
}
console.log(numbers);
function squareOfNumbers(value){
    let square = value * value;
    console.log(square);
}
numbers.forEach(squareOfNumbers);

console.log("*****************************Adding an element in an array**************************")
const courses=["Java","Python","Devops","AWS","AZURE"];
console.log(courses);
courses[5]="GCP";
console.log(courses);
courses[1]="Jenkins";
console.log(courses);
/**
 * push()
 */
courses.push("Python");
console.log(courses);
/**
 * pop()
 */
courses.pop();
console.log(courses);
console.log("********************shifting elements*************************");
/**
 * Shifting is equivalent to popping, but working on the first element instead of the last.
 */
//shift() method removes the first array element and shifts all other elements to a lower index.

courses.shift();
console.log(courses);
//unshift method adds a new element to an array(at the begining) and "unshifts" older elements
courses.unshift("React");
console.log(courses);

console.log("*******************concat two arrays**********************");
const cars =["Audi","Benz","Volvo"];
const bikes=["Ducati","BMW","Honda","Suzuki"];
const vehicles= cars.concat(bikes);
console.log(vehicles);

console.log("*******************")
const nums =[1,2,3,4,5];
const nums1 =[6,7,8,9,10];
const nums2 =[11,12,13,14,15];
const numbersArray=nums.concat(nums1,nums2);
console.log(numbersArray);
const n = nums.concat(16);
console.log(n);

console.log("*****************flat*****************************");
/**
 * Falttening an array is the process of reducing the dimensionality of an array.
 * The flat() method creates a new array with sub-array elements concatenated to a specified path
 * [
 * 1,20
 * 3,4
 * 5,6
 * ]
 */
const myArr=[[1,20],[3,4],[5,6]];
const newArr= myArr.flat();
console.log(newArr);
console.log("*****Accessing two dimensional array****************");
console.log(myArr[0][0]);
console.log(myArr[0][1]);
console.log("**********************Splicing and Slicing of Arrays************************************")
/**
 * Splicing and Slicing of Arrays
 * The splice() method adds new items to an array
 * The slice() method slices out a piece of an array
 */
console.log(numbers);
/**
 * splice method in below example 
 * first parameter(2) defines the position where new elements should be added(spliced in)
 * second parameter(0) defines how many elements should be removed
 * 
 */
numbers.splice(2,0,16,15);
console.log(numbers);
console.log("**********************");
console.log("Length of numbers increased"+numbers.length);
numbers.splice(2,2,17,18);
console.log("**********************");
console.log(numbers);
console.log("**********************");
console.log("Length of numbers remains unchanged "+numbers.length);
console.log("**********************");
/**
 * slice() method slices out a piece of an array into a new array
 */
const numbs = numbers.slice(2);
console.log(numbs);

const numbrs = numbers.slice(2,4);//Start index position is 2 and end index position is 4 not including it
console.log(numbrs);