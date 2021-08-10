public class Doctor {
    private String name;
    private int employeeId;
    private int salary;
    private String specialty;
    private boolean beenPaid;

    public void drawBlood() {
        //patient blood levels drop
    }

    public void patientCare() {
        //patient health levels rise
    }

    public Doctor(String name, int employeeId, int salary, String specialty) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.specialty = specialty;
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public boolean hasBeenPaid() {
        return beenPaid;
    }
}

