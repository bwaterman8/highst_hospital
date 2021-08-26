import java.util.List;

public class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Nurse> nurses;
    private List<Receptionist> receptionists;
    private List<Janitor> janitors;

    public Hospital(String name, List<Doctor> doctors, List<Nurse> nurses, List<Receptionist> receptionists, List<Janitor> janitors) {
        this.name = name;
        this.doctors = doctors;
        this.nurses = nurses;
        this.receptionists = receptionists;
        this.janitors = janitors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    public List<Receptionist> getReceptionists() {
        return receptionists;
    }

    public void setReceptionists(List<Receptionist> receptionists) {
        this.receptionists = receptionists;
    }

    public List<Janitor> getJanitors() {
        return janitors;
    }

    public void setJanitors(List<Janitor> janitors) {
        this.janitors = janitors;
    }

    public static void payEmployee() {
        Employee.isBeenPaid();
    }
}
