public class SimpleLocation {

    //if private than i cant change it in tester.java
    public double left;
    public double right;

    // Constructor to initialize left and right values
    public SimpleLocation(double left, double right) {
        this.left = left;
        this.right = right;
    }

    // Method to calculate the distance between this location and another location
    public double overall_difference(SimpleLocation other) {
        double left_difference = this.left - other.left;
        double right_difference = this.right - other.right;
        return left_difference-right_difference;
    }
}
//next related to Tester.Java

