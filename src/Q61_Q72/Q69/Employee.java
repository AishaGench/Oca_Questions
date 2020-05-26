package Q61_Q72.Q69;

public class Employee {
    private String name;
    private int age;
    private int salary;
     public Employee(String name, int age) {
         setName(name);
         setAge(age);
         setSalary(2000);
     }
     public Employee(String name, int age, int salary) {
         this(name, age);
         setSalary(salary);
     }
     //getter and setter methods for attributes go here
     public void setSalary(int salary) {
         this.salary = salary;
     }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Test{
    public static void main(String[] args) {
       //Employee e1 = new Employee(); we need to create constructer
        Employee e2 = new Employee("Jack", 50);
        Employee e3 = new Employee("Chloe", 40, 5000);
//
//        e1.printDetails();
//        e2.printDetails();
//        e3.printDetails();
    }

}
//cevap A: Compilation fails in the Employee class