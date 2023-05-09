/**
 * Lifecycle of Components
 * Each component in React has a lifecycle which you can monitor and 
 * manipulate during its three main phases.
 * The three phases are: Mounting, Updating, and Unmounting.
 * Mounting
 * Mounting means putting elements into the DOM.
 * React has four built-in methods that gets called, in this order, 
 * when mounting a component:
 * constructor()
 * getDerivedStateFromProps()
 * render()
 * componentDidMount()
 * 
 * These methods are called in the following order when an instance of a 
 * component is being created and inserted into the DOM:
 * constructor()
 * static getDerivedStateFromProps()
 * render()
 * componentDidMount()
 * 
 * The render() method is required and will always be called, the others are 
 * optional and will be called if you define them.
 * 
 * Updating
 * An update can be caused by changes to props or state. 
 * These methods are called in the following order when a component is 
 * being re-rendered:
 * static getDerivedStateFromProps()
 * shouldComponentUpdate()
 * render()
 * getSnapshotBeforeUpdate()
 * componentDidUpdate()
 * 
 * Unmounting
 * This method is called when a component is being removed from the DOM:
 * componentWillUnmount()
 * 
 * 
 * Error Handling
 * These methods are called when there is an error during rendering, 
 * in a lifecycle method, or in the constructor of any child component.
 * 
 * static getDerivedStateFromError()
 * componentDidCatch()
 */