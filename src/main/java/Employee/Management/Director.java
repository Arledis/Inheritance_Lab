package Employee.Management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String NINo, int salary, String deptName, int budget) {
        super(name, NINo, salary, deptName);
        this.budget = budget;
    }

    public int getBudget(){
        return (int) this.budget;
    }

}
