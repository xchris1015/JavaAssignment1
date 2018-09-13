import java.io.*;
public class EmployeeTest {
    public static void main(String args[]){
        Employee empA=new Employee("Jingdi Chen");
        Employee empB=new Employee("Chang Xu");
        Employee empC=new Employee("Cube");

        empA.empAge(24);
        empA.emDesignation("Lord");
        empA.emSalary(300);
        empA.printEmployee();

        empB.empAge(25);
        empB.emDesignation("Server");
        empB.emSalary(0);
        empB.printEmployee();

        empC.empAge(1);
        empC.emDesignation("Baby");
        empC.emSalary(0);
        empC.printEmployee();

    }
}
