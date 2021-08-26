public class Nurse extends Employee {
    private int numberOfPatients;

    public Nurse(String name, int employeeId, int salary, boolean beenPaid, int numberOfPatients) {
        super(name, employeeId, salary, beenPaid);
        this.numberOfPatients = numberOfPatients;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public static void drawBlood(Patient patient) {
        Patient.bloodLevel -= 5;
    }
    public static void patientCare(Patient patient) {
        Patient.healthLevel += 2;
    }



    @Override
    public String toString() {
        return "{Nurse " + name  +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                ", beenPaid=" + beenPaid +
                ", numberOfPatients=" + numberOfPatients +
                '}';
    }
}
