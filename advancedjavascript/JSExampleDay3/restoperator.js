/**
 * The rest operator is used to put the rest of some specific user-supplied
 * values into a  JS array
 * 
 * Spread syntax expands iterables into individual elements
 */

function myBio(firstName,lastName,...otherInfo){
    return otherInfo;
}

let info = myBio("Arvind","Kejriwal","Mufler Man","President AAP","Delhi");
console.log(info);