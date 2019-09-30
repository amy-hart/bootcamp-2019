public class ExceptionExample {

    public static void main(String[] args) {
        int [] intArr = { 12, 3, 5 };

        printArray(0, intArr);
        printArray(1, intArr);
        printArray(2, intArr);

        // This will throw an error because it's out of bounds
        // We're not forcing try and catch in this example
        /*
        try {
            // try to access element 3
            printArray(3, intArr);
        }
        catch (ArrayIndexOutOfBoundsException ae) {
            System.err.println("Element does not exist: " + ae.getLocalizedMessage());
        }*/

        printArray(3, intArr);

    }

    private static void printArray(int index, int [] arr) {
        System.out.println("Element " + index + " is " + arr[index]);
    }
}
