public class Nurse {
    private String name;
    private int employeeId;
    private int salary;
    private int numberOfPatients;
    private boolean beenPaid;
    public void drawBlood() {
        //patient blood levels drop
    }
    public void patientCare() {
        //patient health levels rise
    }

    public Nurse(String name, int employeeId, int salary, int numberOfPatients, boolean beenPaid) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.numberOfPatients = numberOfPatients;
        this.beenPaid = false;
        this.drawBlood();
        this.patientCare();
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

    public int getNumberOfPatients() {
        return numberOfPatients;
    }
    
}
