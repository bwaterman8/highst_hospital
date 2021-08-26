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

    public static void drawBlood(Patient patient) {
        Patient.bloodLevel -= 10;
    }

    public static void giveCare(Patient patient) {
        Patient.healthLevel += 5;
    }

    @Override
    public String toString() {
        return "{Doctor " + name  +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                ", beenPaid=" + beenPaid +
                ", specialty='" + specialty + '\'' +
                '}';

    }
}

