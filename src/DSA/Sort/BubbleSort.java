package DSA.Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={3,1,2,4,5};
        int n = arr.length;
        System.out.println("Before sorting ");
        printArr(arr);
        for (int j = 0; j < n-1; j++) {
            boolean flag = true;
            for(int i = 0; i < n-1-j; i++) {
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    flag = false;
                }
            }
            if(flag) break;
        }
        System.out.println();
        printArr(arr);

    }

    private static void printArr(int[] arr) {
        System.out.print("Array is: ");
        for(int elm: arr){
            System.out.print(elm+" ");
        }
    }

    private static void swap(int[] arr, int i,int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
}
