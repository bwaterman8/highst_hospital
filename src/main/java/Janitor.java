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

}
