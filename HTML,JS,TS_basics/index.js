        var name="Ramsagar";
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

        operators(87);
//Switch
        function creditScore(score){
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
//loop
        function counting(){
            for(let i=1;i<10;i++){
                console.log(i);
            }
        }
     counting();

     var car=new Object();
     car.brand="Marcdes";
     car.model="c class";
     car.price=6000000
     console.log(car);

     var names= ["Nishat","Ramsagar","Mukesh"];
     console.log(names);