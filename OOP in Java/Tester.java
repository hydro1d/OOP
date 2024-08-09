public class Tester {
    public static void main(String[] args) {
        // Create SimpleLocation objects with the provided constructor
        SimpleLocation jinis = new SimpleLocation(12.2, 34);
        SimpleLocation lima = new SimpleLocation(24.5, 21);

        // Update lima's left value
        lima.left = -22;

        // Print the distance between jinis and lima
        System.out.println(jinis.overall_difference(lima));
    }
}
//previous related to SimpleLocation.Java