import Cat from './cat';
import imageTom from '../assets/images/tom.jfif';
function Cafe(){
    return(
        <>
        <Cat name='Tom' img={imageTom} food={["mice","cheese"]} age={5} />
        </>
    );
}
export default Cafe;