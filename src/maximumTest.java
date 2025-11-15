public class maximumTest {

    public static void main(String[] args) {

        // Integers
        maximumTest intMax = new maximum<>(10, 30, 20, 50, 5);
        System.out.println("Max Integer: " + intMax.testMaximum());

        // Floats
        maximumTest floatMax = new Maximum<>(10.3f, 2.4f, 50.6f, 40.5f);
        System.out.println("Max Float: " + floatMax.testMaximum());

        // Strings
        maximumTest strMax = new Maximum<>("Apple", "Peach", "Banana", "Watermelon");
        System.out.println("Max String: " + strMax.testMaximum());

        // Direct static call (no object created)
        maximumTest.printMax(50, 20, 70, 10);
    }

	private static void printMax(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}
}
