var name = "Nishant"; // because this is isn't insid eany function / opertaion this is a global variable
// var age = 32; // define a variable
// var isGraduate = true;
// var laptop;
// laptop = "lg";
// console.log(name);

// function alertUser() {
//   var favChips = "Lays Blue"; // this variable is defined and destroyed inside the function itself so it cant be accessed outside this function
//   console.log("This user has logged in" + name);
//   //  alert("This user has logged in" + name);
// }
// alertUser();
// // if. else, else if statements
// function operators(num) {
//   if (num > 20) {
//     console.log("Number is greater than 20");
//   } else if (num == 20) {
//     console.log("number is equal to 20");
//   } else {
//     console.log("number is smaller than 20 ");
//   }
// }
// operators(87);
function creditScore(score) {
  var creditLimit;
  switch (score) {
    case 800:
      creditLimit = "above 1 lac";
      break;
    case 700:
      creditLimit = "50,000 to 1,00,000";
      break;
    case 600:
      creditLimit = "10,000 tp 25,000";
      break;
    default:
      creditLimit = "not eligible";
  }
  console.log(creditLimit);
}



var car= new Object();
car.brand = "Mercedes"
car.model="C class"
car.price = 6000000

console.log(car);

var names = ["nishant", "vivek", "Abhishek"];
console.log(names);

creditScore(800);


let Car = class{
    // inialize any object 

    constructor(brand, modelName, price) {
        this.brand = brand;
        this.modelName = modelName;
        this.price = price;
    }
    print() {
        console.log("this is a :" + this.brand+ " "+ this.modelName + " which costs : " + this.price);
    }
}

var C1 = new Car("Mercedes", "A class" , 4000000)
var C2 = new Car("BMW", "3-series", 5000000);
C1.print();
C2.print();



class TodaysDate extends Date { // example to make a class a child class of a inbuild JS class
  constructor() {
    super();
  }

  printDate() {
    console.log(this.getDate());
  }
}
let today = new TodaysDate();
today.printDate();


class AppleLaptops { // parent class
  constructor(brand) {
    this.brand = "Apple";

  }
}
class MacBookPro extends AppleLaptops { // child class
  constructor(model,processor,ram) {
    super();
    this.model =model;
    this.processor = processor;
    this.ram = ram
  }
}

let l1 = new MacBookPro("2021 15` Macbook pro", "i7", 16 )
console.log(l1.brand + " " +l1.model + " " + l1.processor + " " + l1.ram);


let fruits = ["Apple", "Banana", "Pineapple"]

let seasonalFruits = ["Mango", "Lichi"]

let allFruits =[ ...fruits, ...seasonalFruits]; // ... is the spread operator and it copies all the elements of the array named after the use of ...

console.log(allFruits);

// an concept of arrow function was introduced

 // conventional method 

let counting = () => {  // this is how you define an inline / arrow function 
   for (let i = 1; i < 10; i++) {
  console.log(i);
}}

counting();

// there ar three keywords that can be used to declare a variable in javascript 
// var -> this has a scope of a function , it can be re-declared

var num1 = 1000;
var num1 = 2000;
console.log(num1);

// let keyword -> was announced with es6 , it has a block scope  , a variable declared using let cannot be re-defined 
let a = 100;
function addNumbers() {
  a = 230;
  let b = 100
  console.log(a+b);
}
 addNumbers();
 console.log(a + 1000);

 // const -> it stands for contant so you cannot change the value diretly , this also has a scope of block 
 function addNumbers1() {
  const num2 = 230;
  // const num2 = 900;

  console.log(num2);
}

addNumbers1();


function dogs() {
  this.dogname = "Lab"
  throw new error("This is not a wild dog")
}

dogs.prototype.display= function(){
  return "this dogs breed is :" + this.dogname;
}

// constructor function 
function Animal(dogname) {
  this.dogname = dogname
}
// create an object without using the constructor 
Animal.prototype= Object.create(dogs.prototype)
let tommy = new Animal("German shepherd")
console.log(tommy.display());

function Greet() {
  alert("Greetings fellow Developer")
}