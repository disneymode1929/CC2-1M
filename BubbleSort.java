
import java.util.Scanner;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements  
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j]	;
                    arr[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Input number of integers to sort: ");
        int length = n.nextInt();

        int arr[] = new int[length];
        System.out.println("Enter the elements: ");
        System.err.print(">> ");

        for (int x = 0; x < arr.length; x++) {
            arr[x] = n.nextInt();
        }

        System.out.println("Array Before Bubble Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);//sorting array elements using bubble sort  

        System.out.println("Array After Bubble Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
