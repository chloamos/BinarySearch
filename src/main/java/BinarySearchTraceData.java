/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author chloe
 */
// Test Binary Search and trace the data as you go.
public class BinarySearchTraceData {
// Main method

    public static void main(String[] args) {
        int[] list = new int[10];
        Scanner scan = new Scanner(System.in);
// Create a sorted list and display it
        System.out.print("The list is  ");
        for (int i = 0; i < list.length; i++) {
            list[i] = 2 * i + 1;
            System.out.print(list[i] + "  ");
        }
        System.out.println();
// Prompt the user to enter a key
        System.out.print("Enter a key: ");
        int key = scan.nextInt();
        int index = binSearch(list, key, 0, list.length - 1);
        if (index != -1) {
            System.out.println("The key is found at zero-based index: "
                    + index);
        } else {
            System.out.println("The key is not found in the list.");
        }
    }

    public static int binSearch(int[] list, int target, int first, int last) {
        int mid = (first + last) / 2;
        System.out.print("Entering binSearch: first=" + first + ", last=" + last);
        System.out.println(", mid=" + mid + ", list[" + mid + "]=" + list[mid]);
        if (first > last) {
            return -1;                                     // Not found
        } else if (target == list[mid]) {
            return mid;                                    // Found
        } else if (target < list[mid]) {
            return binSearch(list, target, first, mid - 1);  // Look in first half
        } else {
            return binSearch(list, target, mid + 1, last);   // Look in second half
        }
    }
}
