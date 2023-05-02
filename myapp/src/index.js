import ReactDOM from 'react-dom';
import HelloWorld from './component/helloworld';
import HelloClass from './component/helloclass';
import Hello from './component/hello';

const root = ReactDOM.createRoot(document.getElementById('root'));
//Below ReactDOM.render() renders the elements on the screen on the first 
//load by creating the real and virtual DOM trees
//root.render(<HelloWorld />);
//root.render(<HelloWorldClass />);
root.render(<Hello />);