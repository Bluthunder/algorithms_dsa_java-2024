import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        System.out.println("HelloWorld!! \n"+ "Bubble Sort");
        int[] a = {4,7,1,5,8,14,11};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(a);
        bubbleSort.printArray(a);


    }

    public void bubbleSort(int[] a){
        for(int i=0; i<a.length-1;i++){
            for(int j=0; j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    void printArray(int[] a){
        System.out.println("Sorted Array [] --> "+ Arrays.toString(a));
    }
}
