import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {45,65,73,82,53,29,48,28};

        while (true){
            System.out.println("---Operations in an Array---");
            System.out.println("1. Traversal");
            System.out.println("2. Insertion");
            System.out.println("3. Deletion");
            System.out.println("4. Searching");
            System.out.println("5. Update");
            System.out.println("6. Display Elements");
            System.out.println("7. Exit");
            System.out.print("Choose an operation to perform: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    traversal(arr);
                    break;

                case 2:
                    Insertion();
                    break;
            }
        }

        traversal(arr);
    }

    private static String display(int[] arr){
        return Arrays.toString(arr);
    }
    private static void traversal(int[] arr){
        System.out.print("Numbers[] = [" );
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);

            if(i < arr.length-1)
                System.out.print(", ");
        }
        System.out.print("]");
    }

    private void insertion(int arr[], int n, int x, int pos){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the integer to insert: ");
        int inserted = scanner.nextInt();

        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i+1];
        }
        arr[0] = inserted;


    }
}
