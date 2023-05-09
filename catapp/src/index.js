//Entry point of your application
import ReactDOM from 'react-dom';
//import Cafe from "./component/cafe";
//import CafeClass from "./component/cafeclass";
//import HelloWorld from "./component/helloworld";
import Cafe from "./component/statemgmt/cafe";

const root = ReactDOM.createRoot(document.getElementById('root'));
//root.render(<Cafe />);
//root.render(<CafeClass />);

//root.render(<HelloWorld />);
root.render(<Cafe />);