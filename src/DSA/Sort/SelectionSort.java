package DSA.Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {3,2,4,5,1};
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int smallest =i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[smallest]){
                    smallest= j;
                }
                }
            int temp = arr[i];
            arr[i]=arr[smallest];
            arr[smallest] = temp;

        }
    }
}
