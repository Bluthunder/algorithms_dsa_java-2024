import java.util.Arrays;

public class SquareSortedArray {
    public static void main(String[] args) {
        int[] a = {-4,-1,0,3,10};

        SquareSortedArray squareSortedArray = new SquareSortedArray();
        a = squareSortedArray.sqaureArray(a);
        squareSortedArray.printArray("Squared Array--> ",a);
        a = squareSortedArray.sortArray(a);
        squareSortedArray.printArray("Sorted Array--> ",a);

    }

    public int[] sqaureArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]*arr[i];
        }
        return arr;
    }
    public void printArray(String text, int[] arr){
        System.out.println(text + Arrays.toString(arr));
    }

    public int[] sortArray(int[] arr){

        for(int i=0;i<arr.length;i++){
            int k = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > k){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = k;
        }
        return arr;
    }
}
