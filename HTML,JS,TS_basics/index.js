       /* var name="Ramsagar";
        var age=32;
        var isGraduate=true;
        var laptop;
        laptop="LG";
        console.log(name);

        function alertUser(){
            var favChips="Lays Blue"//this variable is defined and destroy
            console.log("This user has loged in "+name);
            alert("This user has loged in "+name);
        }
        alertUser();
        console.log("This user has loged in "+name);

        //if, else, else if statement
        function operators(num){
            if(num>20){
                console.log("Number is greater then 20");
            }else if(num==20){
                console.log("Number is equals then 20");
            }else{
                console.log("Number is smaller then 20");
            }
        }

        operators(87); */
//Switch
  /*      function creditScore(score){
            var creditLimit;
            switch(score){
                case 800 : creditLimit="Above 1 Lac";
                break;
                case 700 : creditLimit="50 K to 1 Lac";
                break;
                case 600 : creditLimit="10 K to 25K";
                break;
                default : creditLimit=" Not eligible";
            }
            console.log("Credit limit"+creditLimit );
        }
        creditScore(700);
*/
     var car=new Object();
     car.brand="Marcdes";
     car.model="c class";
     car.price=6000000
     console.log(car);

     var names= ["Nishat","Ramsagar","Mukesh"];
     console.log(names);

     //Class creating in below ways
     //class Car{
     let  Car= class{

        constructor(brand, modelName, price){
            this.brand=brand;
            this.modelName=modelName;
            this.price=price;
        }
        print(){
            console.log("This is a : "+ this.brand+ " "+this.modelName +" Which cost : "+ this.price);
        }
     }
     var C1= new Car("Mercedes","A Class", 4000000);
     var C2= new Car("BMW","C Class", 8000000);
     C1.print();
     C2.print();

     class TodaysDate extends Date{ //example to make a class a child class of inbuilt js class.
        constructor(){
            super();
        }

        printDate(){
            console.log(this.getDate());
        }
     }
     let today=new TodaysDate();
     today.printDate();


     class AppleLaptops{ // Parent class
         constructor(brands){
             this.brands=brands;

         }
     }

     class MacBookPro extends AppleLaptops{ // child class
        constructor(model,processor,ram){
            super();
            this.model=model;
            this.processor=processor;
            this.ram=ram;
        }

     }
     let l1=new MacBookPro("2021 15 MacBookPro","17",16)
     console.log(l1.brands + " "+ l1.model + " "+ l1.processor+  " "+ l1.ram);

     //Arrays joining below
     let fruits=["Apple","Banana","Primple"]
     let secondFruits=["Mango","Lichi"]
     let AllFruits=[...fruits, ...secondFruits]; // ... is spread operator and it copies all the elements of the array named after the use ...
     console.log(AllFruits);


// //loop
// function counting(){
//     for(let i=1;i<10;i++){
//         console.log(i);
//     }
// }
// counting();


let counting = () =>{ // this is how you define on inline / arrow  function
    for(let i=1;i<10;i++){
   console.log(i);
}}
counting();

//There are three keyword that can be used to declare a variable in javascript.
//Var - this is a scop of function, it can be re-declear
var num1= 1000;
var num1= 2000;
console.log(num1);

//let is a keyword  -> was announce with es6, it has a block scop, a variable decleared with let cannot be re-defineed
let a =100;
function addNumber(){
    a=130;
    let b=100;
    console.log(a+b);
}
addNumber();
console.log(a+ 1000);

//const -> it stands for constent so you can not change the value directly , this also have scop of block.

function addNumbers1(){
    const num2 =230;
    //const num2 =900;

}


function Dog(){
    this.dogName="Lab"
    throw new error("This is not wild dog");
}
dogs.prototype.display = function(){
    return "This dog breed  is : "+ this.dogName;  
}

//constructor  function
function Animal (dogName){
    this.dogName=dogName;
}

//Create object without using constructor
Animal.prototype=Object.create(dogs.prototype)
let tomy=new Animal("German shephred")
console.log(tomy.display)

function Greet(){
    alert("Greetings fellow developers")
}