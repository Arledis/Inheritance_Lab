package Employee;

public abstract class Employee {

    private String name;
    private String NINo;
    private int salary;

    public Employee(String name, String NINo, int salary) {
        this.name = name;
        this.NINo = NINo;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINo() {
        return NINo;
    }

    public int getSalary() {
        return salary;
    }

//    public double raisedSalary(double increment){
//       return this.salary += raise;
//    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
