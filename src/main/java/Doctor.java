public class Doctor extends Employee {
    private String specialty;

    public void drawBlood() {
        //patient blood levels drop
    }

    public void patientCare() {
        //patient health levels rise
    }

    public Doctor(String name, int employeeId, int salary, boolean beenPaid, String specialty) {
        super(name, employeeId, salary, beenPaid);
        this.specialty = specialty;
        this.drawBlood();
        this.patientCare();
    }


    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

}

