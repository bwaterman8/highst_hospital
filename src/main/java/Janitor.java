public class Janitor extends Employee{
    private boolean isSweeping;

    public Janitor(String name, int employeeId, int salary, boolean beenPaid, boolean isSweeping) {
        super(name, employeeId, salary, beenPaid);
        this.isSweeping = isSweeping;
    }

    public boolean getIsSweeping() {
        return isSweeping;
    }

    public void wasSweeping(boolean isSweeping) {
         this.isSweeping = isSweeping;
    }

    @Override
    public String toString() {
        return "{Janitor " + name  +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                ", beenPaid=" + beenPaid +
                ", isSweeping=" + isSweeping +
                '}';
    }
}
