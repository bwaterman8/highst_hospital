public class Janitor {
    private String name;
    private int employeeId;
    private int salary;
    private boolean isSweeping;
    private boolean beenPaid;

    public Janitor(String name, int employeeId, int salary,boolean isSweeping) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.isSweeping = isSweeping;
        this.beenPaid = false;
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

    public boolean getIsSweeping() {
        return isSweeping;
    }

    public boolean hasBeenPaid() {
        return beenPaid;
    }

}
