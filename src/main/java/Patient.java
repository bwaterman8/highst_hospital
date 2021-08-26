public class Patient {
    private static int bloodLevel;
    private static int healthLevel;

    public Patient() {
        this.bloodLevel = 20;
        this.healthLevel = 10;
    }

    public static void bloodDrawn (int levels) {
        levels -= bloodLevel;
    }

    public static void receiveCare (int care) {
        care += healthLevel;
    }

}
