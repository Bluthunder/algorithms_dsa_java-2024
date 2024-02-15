import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Hello world! \n"+ "Insertion Sort");
        int[] a  = {5, 2, 4, 6, 1, 3};

        InsertionSort insertionSortObject = new InsertionSort();
        int[] sortedArray = insertionSortObject.insertionSort(a);
        insertionSortObject.printArray(sortedArray);

    }

    int[] insertionSort(int[] a){
        for(int i=1; i<a.length; i++){
            int k = a[i];
            int j = i-1;

            while(j >= 0 && a[j]>k){
                a[j+1] = a[j];
                j = j - 1;
            }
            a[j+1] = k;
        }
        return a;
    }

    void printArray(int[] a){
        System.out.println("Sorted Array [] --> "+Arrays.toString(a));
    }
}