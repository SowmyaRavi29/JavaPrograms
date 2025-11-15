import java.util.Arrays;

public class maximum<T extends Comparable<T>> {

    T[] values;

    // Var-args constructor
    @SafeVarargs
    public maximum(T... values) {
        this.values = values;
    }

    // Instance method calling the static method
    public T testMaximum() {
        T max = maximum.testMaximum(values);
        printMax(values); // print the maximum
        return max;
    }

    // Static Generic Method to find max among n parameters
    @SafeVarargs
    public static <T extends Comparable<T>> T testMaximum(T... values) {
        Arrays.sort(values);               // Sorting
        return values[values.length - 1];  // Last element is max
    }

    // Generic Method to print max value
    @SafeVarargs
    public static <T extends Comparable<T>> void printMax(T... values) {
        T max = testMaximum(values);
        System.out.println("Maximum value is: " + max);
    }
}
