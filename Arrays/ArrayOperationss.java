import java.util.Scanner;

public class ArrayOperationss {

    private int[] score;
    private int size = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner();

        System.out.println("Array Operations");
        System.out.println("1. Insert element " +
                "\n2. Delete element " +
                "\n3. Search element " +
                "\n4. Traverse array" +
                "\n5. Update array " +
                "\n6. Display array " +
                "\n7. Exit");
        System.out.println("Pick one operation to perform(1-7: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1: insertElement();
            case 2: deleteElement();
            case 3: searchElement();
            case 4: traverseArray();
            case 5: updateArray();
            case 6: displayArray();
            case 7: break;
            default:
                System.out.println("Invalid choice!");
        }

        public void insertElement(int position){
            System.out.println("Array Insertion Options ");
            System.out.println("1. At beginning" +
                    "2. At end" +
                    "3. At specific index");

            System.out.println("At what position will you insert the element? ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            //Why use IF and not switch?
            if (choice == 1){
                
            } else if (choice == 2) {
                
            } else if (choice == 3) {
                
            }
        }
    }
}