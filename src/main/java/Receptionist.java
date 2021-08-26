public class Receptionist extends Employee {
    private boolean onPhone;

    public Receptionist(String name, int employeeId, int salary, boolean beenPaid, boolean onPhone) {
        super(name, employeeId, salary, beenPaid);
        this.onPhone = onPhone;
    }

    public boolean getisOnPhone() {
        return onPhone;
    }

    public void wasOnPhone(boolean onPhone) {
        this.onPhone = onPhone;
    }

}
