import {useState,useEffect} from 'react';
/**
 * Effect Hook
 * We will be performing data fetch from DB,subscriptions, or manually changing the
 * DOM from React component before. We call these operations "side effects"
 * (or "effects" for short) because they can effect other components and can't be done during
 * rendering.
 * 
 * The Effect Hook, useEffect , adds the ability to perform side effects from a function
 * component.
 * It serves the same purpose as componentDidMount, componentDidUpdate, and componentWillUnmount
 * in React classes, but unified into a single API.
 *
 *  Effects may also optionally speicify how to "clean up" after them by 
 * returning a function.
 * Below example, component uses an effect to subscribe to a friend's online status, 
 * and cleans up by unsubscribing from it.
 * 
 */
 
function FriendStatus(props){
    const [isOnline,setIsOnline] = useState(true);
    useEffect(() => {
        function handleStatusChange(status) {
            setIsOnline(status.isOnline);
        }
        console.log("CHAT API Subscribe",handleStatusChange(false));
        // Specify how to clean up after this effect:
        return function cleanup() {
            console.log("CHAT API Unsubscribe");
        };

    });

    if(isOnline === null){
        return 'Loading ....';
    }
    return isOnline ? 'Online' : 'Offline';
}

export default FriendStatus;