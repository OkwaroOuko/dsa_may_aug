package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[5];
        System.out.println("Enter the elements of array: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = scn.nextInt(); // Arrays.Inserting values
        }
        System.out.println("The length is "+num.length);
        System.out.println("The elements of array are: ");
        for (int j : num) {
            System.out.print(j + "\t");
        }
    }
}
