
const fun1=() =>{
    console.log("This is fun1")
}
const fun2=() =>{
    setTimeout( ()=>{
    console.log("This is fun2 expected to time out in");
},5000);
console.log("This is fun2")
}
const fun3=() =>{
    console.log("This is fun3")
}
fun1();
fun2();
fun3();