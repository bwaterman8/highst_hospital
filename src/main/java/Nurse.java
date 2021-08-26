public class Nurse extends Employee {
    private int numberOfPatients;

    public Nurse(String name, int employeeId, int salary, boolean beenPaid, int numberOfPatients) {
        super(name, employeeId, salary, beenPaid);
        this.numberOfPatients = numberOfPatients;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public static void drawBlood(int amount) {
        Patient.bloodDrawn(amount);
    }
    public static void patientCare(int amount) {
        Patient.receiveCare(amount);
    }


}
