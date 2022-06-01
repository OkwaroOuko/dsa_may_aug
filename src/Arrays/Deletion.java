package Arrays;

import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the number of elements in array:");
        int n = scn.nextInt();
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("***MENU***");
        System.out.println("1. Arrays.Deletion from beginning");
        System.out.println("2. Arrays.Deletion from specified location");
        System.out.println("3. Arrays.Deletion from end");
        System.out.println("Enter your choice:");
        int choice = scn.nextInt();
        if (n == 10) {
            System.out.println("Overflow error");
        } else {
            switch (choice) {
                case 1 -> {
                    if (n - 1 >= 0) System.arraycopy(arr, 1, arr, 0, n - 1);
                    System.out.println(" After deletion array is");
                    for (int i = 0; i < n - 1; i++) {
                        System.out.print(arr[i] + "\t");
                    }
                }
                case 2 -> {
                    System.out.println(" Enter position");
                    int pos = scn.nextInt();
                    if (n - 1 - (pos - 1) >= 0)
                        System.arraycopy(arr, pos - 1 + 1, arr, pos - 1, n - 1 - (pos - 1));
                    System.out.println(" After deletion array is");
                    for (int i = 0; i < n - 1; i++) {
                        System.out.print(arr[i] + "\t");
                    }
                }
                case 3 -> {
                    n = n - 1;
                    System.out.println(" After deletion array is");
                    for (int i = 0; i < n ; i++) {
                        System.out.print(arr[i] + "\t");
                    }
                }
                default -> System.out.println("Wrong Choice");
            }
        }


    }
}
