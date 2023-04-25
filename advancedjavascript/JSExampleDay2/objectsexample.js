/**
 * JS has 8 datatypes
 * 1. String 
 * 2. Number
 * 3. Bigint
 * 4. Boolean
 * 5. Undefined
 * 6. Null
 * 7. Symbol
 * 8. Object
 * 
 * This object data type can contain:
 * 1. An object
 * 2. An array
 * 3. A date
 */

let p;
console.log(typeof(p));
p=null; //null is always null type of null is null(object)
console.log(typeof(p));
//p=Null;//Error: Null is not defined
//console.log(typeof(p)); 

/**
 * Objects are variable
 */
let name="Karthik"; //JS variables can contain single values
/**
 * JS varaibles can also contain many values
 * Objects are variables too. But objects can contain multiple values.
 * JS object is a collection of named values
 * An object will have properties and methods
 * Methods are actions that can be performed on objects.
 * In other words, JS objects are containers for named values, called properties and methods
 */
let employee={
    firstName:"Karthik", 
    lastName:"Srinivasmurthy",
    city:"Alaska",
    height:"6ft",
    salary:1555.50,
    dateofbirth:"15-10-2000",
    fullName: function(){
        return this.firstName+ "   "+this.lastName; //this keyword refers to an object
    }
};
// We are accessing employee object property firstName
console.log(employee.firstName);
console.log(typeof(employee));
console.log(employee.fullName());//accessing the methods of an object

/**
 * Creating a JS Object
 * Different ways to create new objects:
 * 1. Create a single object using an object literal   --- see employee example
 * 2. Create a single object, with the keyword new.
 * 3. Define an object constructor, and then create objects of the constructed type
 * 4. Create an object using Object.create().
 */
/**
 * 1. Create a single object using an object literal   --- see employee example
 */
const person= {};
person.firstName="Arya";
person.lastName="Jad";
console.log(person.firstName);

/**
 * 2. Create a single object, with the keyword new.
 */
const student= new Object();
student.firstName="Samiksha";
student.city="Rohtak";
console.log(student.city);

/**
 * JS Objects are mutable.
 * Objects are mutable:
 * They are addressed by reference , not by value
 */

const x = student; //will not create copy of student. x is student both x and student are the same object.
x.city="Bhiwani";
console.log(student.city);
console.log(x.city);

/**
 * Display JS Objects:
 * Displaying the Object properties by name
 * Displaying the Object properties in a loop
 * Displaying the Object using Object.values()
 * Displaying the Object using JSON.stringify()
 *   
 */
//Displaying the Object properties in a loop
let value ="";
for(let x in employee){
    value += employee[x]+ " ";
}
//console.log(value);
console.log("****************************************");
console.log(Object.values(employee)); // All values of properties we will get in JS array format
console.log("****************************************");
console.log(JSON.stringify(student));
console.log(JSON.stringify(employee));
console.log(employee.dateofbirth.toString());
console.log("*********************Accessor Methods--- Getter and Setter*******************");
//create an object
const product={
    sku:1,
    name:"iPhone14 Pro",
    description:"Mobile Phone by Apple",
    price:15555,
    set productPrice(p){
        this.price=p;
    },
    get desc(){
        return this.description.toUpperCase();
    }

}
product.productPrice=111;
console.log(product.price);
console.log(product.desc);


/**
 * Constructor function or method
 * The way to create an object type is to use an object constructor function
 */

function Address(hNo,st,city,pincode,country){
    this.houseNo=hNo;
    this.street=st;
    this.city=city;
    this.pincode=pincode;
    this.country=country;
}

const resaddr = new Address(11,"Commercial Street","Bengaluru",560001,"IN");
console.log(JSON.stringify(resaddr));
