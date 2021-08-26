public class Patient {
    private String name;
    public static int bloodLevel;
    public static int healthLevel;

    public Patient(String name) {
        this.name = name;
        this.bloodLevel = 20;
        this.healthLevel = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' + "bloodLevels= " + bloodLevel + " healthLevels= " + healthLevel +
                '}';
    }
}
