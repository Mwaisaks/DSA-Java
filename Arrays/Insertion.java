public class Insertion {
    public static void main(String[] args) {
        int[] numbers = new int[6];

        System.out.println("Array before insertion: ");
        for (int i = 0; i < 3; i++){
            System.out.println("Numbers[" + i + "] = " + numbers[i]);
        }

        //or
        //System.out.println("Array before insertion: " + java.util.Arrays.toString(numbers));
        System.out.println("Inserting elements...");

        System.out.println("Array after insertion:");
        for (int i = 0; i < 5;i++ ){
            numbers[i] = i+3;
            System.out.println("Numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("Final array: " + java.util.Arrays.toString(numbers));
        //you can also import the java.util.Arrays class and then use Arrays.toString()
    }
}
