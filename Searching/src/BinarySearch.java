/**
 * This Binary Search solution classes implements both recursive and iterative way
 */

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Hello World !!" + "Binary Search");

        int [] a = {2,4,5,6,7,8,9};
        int key = 6;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter type of binary Search you want to proceed \n" +
                "Enter I for Iterative search \n" +
                "Enter R for Recursive search" );

        String searchType = scan.next();

        BinarySearch binarySearch = new BinarySearch();

        switch (searchType.toUpperCase()){

            case "I":
                int binarySearchIterative = binarySearch.binarySearchIterative(a, key);
                binarySearch.print(binarySearchIterative,searchType);
                break;

            case "R":
                int binarySearchRecursive = binarySearch.binarySearchRecursive(a, 0, a.length - 1, key);
                binarySearch.print(binarySearchRecursive,searchType);
                break;
            default:
                System.out.println("Bravooo!!!!!");
        }
    }

    public <T, String> void print(T arg, String type){
        System.out.println("Search type:"+ type +" --- Element Found at index --> "+ arg);
    }
    public int binarySearchIterative(int[] arr, int k){

        int left = 0;
        int right = arr.length -1 ;

        int mid = left + (right-left)/2;

        if(arr[mid]==k){
            return mid;
        }

        if(arr[mid] < k){
            left = mid + 1;
        }
        else {
            right = mid - 1;
        }

        return -1;

    }

    public int binarySearchRecursive(int[] arr, int left, int right, int k){

        while (left < right){
            int mid = left + (right-left)/2;

            if(arr[mid] == k){
                return mid;
            }
            if(arr[mid]>k){
                return binarySearchRecursive(arr,left, mid-1, k);
            }
            return binarySearchRecursive(arr,mid+1, right, k);
        }

        return -1;
    }

}
