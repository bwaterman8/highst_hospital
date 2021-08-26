import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Doctor mel = new Doctor("Mel", 101, 90000, false, "knee");
        Doctor sahai = new Doctor("Sahai", 102, 90000, false, "anterior");
        Doctor sturgess = new Doctor("Sturgess", 103, 90000, false, "anesthesia");

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(mel);
        doctors.add(sahai);
        doctors.add(sturgess);

        Nurse elle = new Nurse("Elle", 201, 50000, false, 4);
        Nurse keri = new Nurse("Keri", 202, 50000, false, 12);
        Nurse maggie = new Nurse("Maggie", 203, 50000, false, 7);

        List<Nurse> nurses = new ArrayList<>();
        nurses.add(elle);
        nurses.add(keri);
        nurses.add(maggie);

        Receptionist terry = new Receptionist("Terry", 301, 45000, false, true);
        Receptionist brie = new Receptionist("Brie", 302, 45000, false, true);
        Receptionist tiff = new Receptionist("tiff", 303, 45000, false, false);

        List<Receptionist> receptionists = new ArrayList<>();
        receptionists.add(terry);
        receptionists.add(brie);
        receptionists.add(tiff);

        Janitor alex = new Janitor("Alex", 401, 40000, false, false);
        Janitor brad = new Janitor("Brad", 402, 40000, false, true);
        Janitor ian = new Janitor("Ian", 403, 40000, false, false);

        List<Janitor> janitors = new ArrayList<>();
        janitors.add(alex);
        janitors.add(brad);
        janitors.add(ian);

        Patient ted = new Patient("ted");
        Patient turk = new Patient("turk");
        Patient elliot = new Patient("elliot");

        List<Patient> patients = new ArrayList<>();
        patients.add(ted);
        patients.add(turk);
        patients.add(elliot);

        Hospital riverside = new Hospital("Riverside Methodist Hospital", doctors, nurses, receptionists, janitors, patients);
//        System.out.println(riverside);
//        Hospital.payEmployee(ian);
//        System.out.println(ian);
//        Hospital.payEmployee(sturgess);
//        System.out.println(riverside);
        System.out.println(ted);
    }
}
