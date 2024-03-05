public class LinearSearch {
    public static void main(String[] args) {

        System.out.println("Hello world!" + "I am Linear Search");

        int[] a = {1, 4, 5, 2, 9, 3};
        int key = 3;

        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.linearSearchIndex(a,key);
        linearSearch.printIndex("Element is found at --> "+index);


    }

    public int linearSearchIndex(int[] arr, int k) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                index = i;
            }
            else{
                index = -1;
            }
        }
        return index;
    }

     public <T> void printIndex(T arg){
        System.out.println(arg);
    }
 }
