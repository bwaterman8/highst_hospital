public class Doctor extends Employee {
    private String specialty;

    public Doctor(String name, int employeeId, int salary, boolean beenPaid, String specialty) {
        super(name, employeeId, salary, beenPaid);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public static void drawBlood(int level) {
        Patient.bloodDrawn(10);
    }

    public static void patientCare(int caring) {
        Patient.receiveCare(5);
    }

}

