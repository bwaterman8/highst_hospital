public class Patient {
    private String name;
    private static int bloodLevel;
    private static int healthLevel;

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

    public static void bloodDrawn (int levels) {
        levels -= bloodLevel;
    }

    public static void receiveCare (int care) {
        care += healthLevel;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' + "bloodLevels= " + bloodLevel + " healthLevels= " + healthLevel +
                '}';
    }
}
