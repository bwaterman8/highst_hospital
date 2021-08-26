public class Employee {
    private String name;
    private int employeeId;
    private int salary;
    private boolean beenPaid;

    public Employee (String name, int employeeId, int salary, boolean beenPaid) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.beenPaid = beenPaid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isBeenPaid() {
        return beenPaid;
    }

    public void setBeenPaid(boolean beenPaid) {
        this.beenPaid = beenPaid;
    }
}
