import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[100];
        int size = 0;
        System.out.print("Enter number of elements: ");
        size = sc.nextInt();
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        while (true) {
            System.out.println("\n--- Array Operations Menu ---");
            System.out.println("1. Display");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. Sort");
            System.out.println("5. Binary Search");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Array elements:");
                    for (int i = 0; i < size; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    if (size >= array.length) {
                        System.out.println("Array is full. Cannot insert.");
                        break;
                    }
                    System.out.print("Enter element to insert: ");
                    int elem = sc.nextInt();
                    System.out.print("Enter position (0 to " + size + "): ");
                    int pos = sc.nextInt();
                    if (pos < 0 || pos > size) {
                        System.out.println("Invalid position.");
                    } else {
                        for (int i = size; i > pos; i--) {
                            array[i] = array[i - 1];
                        }
                        array[pos] = elem;
                        size++;
                        System.out.println("Element inserted.");
                    }
                    break;
                case 3:
                    System.out.print("Enter position to delete (0 to " + (size - 1) + "): ");
                    int delPos = sc.nextInt();
                    if (delPos < 0 || delPos >= size) {
                        System.out.println("Invalid position.");
                    } else {
                        for (int i = delPos; i < size - 1; i++) {
                            array[i] = array[i + 1];
                        }
                        size--;
                        System.out.println("Element deleted.");
                    }
                    break;
                case 4:
                    Arrays.sort(array, 0, size);
                    System.out.println("Array sorted.");
                    break;
                case 5:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    int index = Arrays.binarySearch(array, 0, size, key);
                    if (index >= 0) {
                        System.out.println("Element found at index " + index);
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
