public class Nurse extends Employee {
    private int numberOfPatients;
    public void drawBlood() {
        //patient blood levels drop
    }
    public void patientCare() {
        //patient health levels rise
    }

    public Nurse(String name, int employeeId, int salary, boolean beenPaid, int numberOfPatients) {
        super(name, employeeId, salary, beenPaid);
        this.numberOfPatients = numberOfPatients;
        this.drawBlood();
        this.patientCare();
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

}
