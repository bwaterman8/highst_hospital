public class Nurse extends Employee {
    private int numberOfPatients;

    public Nurse(String name, int employeeId, int salary, boolean beenPaid, int numberOfPatients) {
        super(name, employeeId, salary, beenPaid);
        this.numberOfPatients = numberOfPatients;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public static void drawBlood(int level) {
        Patient.bloodDrawn(5);
    }
    public static void patientCare(int caring) {
        Patient.receiveCare(2);
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
