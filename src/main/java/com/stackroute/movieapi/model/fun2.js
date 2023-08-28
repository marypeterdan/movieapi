//function to remove a element from the given array - robus
function removeElement(array,element){
    var index = array.indexOf(element);
    if(index === -1){
        return array;
    }
    array.splice(index,1);
    return array;
}
// call the function and pass the arguments
console.log(removeElement([1,2,3,4,5,6],5));
 