class Employee { // Parent class
    constructor(companyname) {
        this.companyname = companyname;

    }
}
class Developer extends Employee { // child class
    constructor(empName, ex, department, position, joiningDate, location, emailId, empId, salary) {
        super();
        this.empName = empName;
        this.ex = ex;
        this.department = department;
        this.position = position;
        this.joiningDate = joiningDate;
        this.location = location;
        this.emailId = emailId;
        this.empId = empId;
        this.salary = salary;
    }
}
class HR extends Employee { // child class
    constructor(empName, ex, department, position, joiningDate, location, emailId, empId, salary) {
        super();
        this.empName = empName;
        this.ex = ex;
        this.department = department;
        this.position = position;
        this.joiningDate = joiningDate;
        this.location = location;
        this.emailId = emailId;
        this.empId = empId;
        this.salary = salary;
    }
}
class Finance extends Employee { // child class
    constructor(empName, ex, department, position, joiningDate, location, emailId, empId, salary) {
        super();
        this.empName = empName;
        this.ex = ex;
        this.department = department;
        this.position = position;
        this.joiningDate = joiningDate;
        this.location = location;
        this.emailId = emailId;
        this.empId = empId;
        this.salary = salary;
    }
}
class Sales extends Employee { // child class
    constructor(empName, ex, department, position, joiningDate, location, emailId, empId, salary) {
        super();
        this.empName = empName;
        this.ex = ex;
        this.department = department;
        this.position = position;
        this.joiningDate = joiningDate;
        this.location = location;
        this.emailId = emailId;
        this.empId = empId;
        this.salary = salary;
    }
}
class Marketing extends Employee { // child class
    constructor(empName, ex, department, position, joiningDate, location, emailId, empId, salary) {
        super();
        this.empName = empName;
        this.ex = ex;
        this.department = department;
        this.position = position;
        this.joiningDate = joiningDate;
        this.location = location;
        this.emailId = emailId;
        this.empId = empId;
        this.salary = salary;
    }
}
class QA extends Employee { // child class
    constructor(empName, ex, department, position, joiningDate, location, emailId, empId, salary) {
        super();
        this.empNaexme = empName;
        this.ex = ex;
        this.department = department;
        this.position = position;
        this.joiningDate = joiningDate;
        this.location = location;
        this.emailId = emailId;
        this.empId = empId;
        this.salary = salary;
    }
}
let emp = new Developer("Nishant", "12345", "Dev", "SE", "14 Nov 2022", "Bangalore", "1111222@cognizant.com", "1111222", "35000")
console.log(emp.empName + " " + emp.ex + " " + emp.department + " " + emp.position + " " + emp.joiningDate + " " + emp.location + " " + emp.emailId + " " + emp.empId + " " + emp.salary);

let emp1 = new HR("Nishant", "12345", "Dev", "SE", "14 Nov 2022", "Bangalore", "1111222@cognizant.com", "1111222", "35000")
console.log(emp1.empName + " " + emp1.ex + " " + emp1.department + " " + emp1.position + " " + emp1.joiningDate + " " + emp1.location + " " + emp1.emailId + " " + emp1.empId + " " + emp1.salary);

let emp2 = new Finance("Nishant", "12345", "Dev", "SE", "14 Nov 2022", "Bangalore", "1111222@cognizant.com", "1111222", "35000")
console.log(emp2.empName + " " + emp2.ex + " " + emp2.department + " " + emp2.position + " " + emp2.joiningDate + " " + emp2.location + " " + emp2.emailId + " " + emp2.empId + " " + emp2.salary);

let emp3 = new Sales("Nishant", "12345", "Dev", "SE", "14 Nov 2022", "Bangalore", "1111222@cognizant.com", "1111222", "35000")
console.log(emp3.empName + " " + emp3.ex + " " + emp3.department + " " + emp3.position + " " + emp3.joiningDate + " " + emp3.location + " " + emp3.emailId + " " + emp3.empId + " " + emp3.salary);

let emp4 = new Marketing("Nishant", "12345", "Dev", "SE", "14 Nov 2022", "Bangalore", "1111222@cognizant.com", "1111222", "35000")
console.log(emp4.empName + " " + emp4.ex + " " + emp4.department + " " + emp4.position + " " + emp4.joiningDate + " " + emp4.location + " " + emp4.emailId + " " + emp4.empId + " " + emp4.salary);

let emp5 = new QA("Ramsagar", "12345", "Dev", "SE", "14 Nov 2022", "Bangalore", "1111222@cognizant.com", "1111222", "35000")
console.log(emp5.empName + " " + emp5.ex + " " + emp5.department + " " + emp5.position + " " + emp5.joiningDate + " " + emp5.location + " " + emp5.emailId + " " + emp5.empId + " " + emp5.salary);
