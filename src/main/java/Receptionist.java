public class Receptionist {
    private String name;
    private int employeeId;
    private int salary;
    private boolean onPhone;
    private boolean beenPaid;

    public Receptionist(String name, int employeeId, int salary, boolean onPhone) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.onPhone = onPhone;
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

    public boolean isOnPhone() {
        return onPhone;
    }

    public void wasOnPhone(boolean onPhone) {
        this.onPhone = onPhone;
    }
}
