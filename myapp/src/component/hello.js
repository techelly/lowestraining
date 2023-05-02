/**
 * Any JavaScript expression will work between curly braces, 
 * including function calls like {getFullName(“Narendra", “Damodar Das", “Modi")}:

 */
const getFullName = (firstName, secondName, thirdName) => {
    return firstName + " " + secondName + " " + thirdName;
  }
  

  const Hello = () => {
    return (
      <p>
        Hello, I am {getFullName("Narendra", "Damodar Das", "Modi")}!
      </p>
    );
  }
  export default Hello;
  