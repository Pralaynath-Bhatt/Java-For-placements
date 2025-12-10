package DSA.AdvancedSorting;

public class KthLargestt {
    static void main() {
        int[] arr={1,3,5,7,95,2,78,33,9};
        int k=4;
        int largestk = arr.length-k;
        quick(arr, largestk,0,arr.length-1);
    }

    private static void quick(int[] arr, int k,int low,int hi) {
        int pivot= partition(arr,low,hi);
        if(pivot == k) {
            System.out.println(arr[k]);
            return;
        }
        else if (k>pivot)   quick(arr,k,pivot+1,hi);
        else quick(arr,k,low,pivot-1);
    }

    private static int partition(int[] arr, int low, int hi) {
        int pivot=arr[low];
        int pIndex=low;
        int small=0;
        for(int i=pIndex+1;i<=hi;i++){
            if(arr[i]<pivot) {
                small++;
            }
        }
        swapper(arr,pIndex,pIndex+small);
        pivot=pIndex+small;
        int i=low,j=hi;
        while(i<pivot&&j>pivot){
            if(arr[i]<arr[pivot]){
                i++;
            }
            else if(arr[j]>arr[pivot]){
                j--;
            }
            else if(arr[i]>arr[pivot]&&arr[j]<arr[pivot])
                swapper(arr,i,j);
        }
        return pivot;
    }

    private static void swapper(int[] arr, int pIndex, int i) {
        int temp = arr[pIndex];
        arr[pIndex]=arr[i];
        arr[i]=temp;
    }
}
