import java.util.Arrays;

public class MergeSort {

    public static void main(String args[]){

        int[] a = {3, 41, 52, 26, 38, 57, 9};

        System.out.println("Hello World \n" + "Merge Sort");
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(a,0,a.length -1);
        mergeSort.printArray(a);

    }

    public void merge(int[] arr, int left, int mid, int right){

        // Sizes of two sub arrays
        int n1 = mid - left + 1;  
        int n2 = right - mid;

        // new temp arrays 
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int i=0; i<n1; i++){
            leftArr[i] = arr[left+i];
        }

        for(int j=0; j<n2; j++){
            rightArr[j] = arr[mid + 1 + j];
        }

        // Merge temp arrays
        int i= 0;
        int j = 0;

        //Initial Index of merged subarray array
        int k =left;
        while(i<n1 && j<n2){

            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }
            else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;

        }

        // Copy any remaining items
        while(i<n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j<n2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        
    }

    public void mergeSort(int[] arr, int left, int right){

        if(left < right){
            int mid = left + (right-left)/2;

            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);

        }
    }

    void printArray(int[] a){
        System.out.println("Sorted Array [] --> "+Arrays.toString(a));
    }
}
