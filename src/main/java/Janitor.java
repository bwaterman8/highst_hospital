public class Janitor {
    private String name;
    private int employeeId;
    private int salary;
    private boolean beenPaid;

    public Janitor(String name, int employeeId, int salary) {
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
    
    public boolean hasBeenPaid() {
        return beenPaid;
    }

}
