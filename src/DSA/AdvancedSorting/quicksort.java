package DSA.AdvancedSorting;

public class quicksort {
    public static void print(int[] arr){
        for(int elm : arr){
            System.out.print(elm+" ");
        }
        System.out.println();
    }
    static void main() {
        int[] arr ={1,3,5,7,95,2,78,33,9};
        print(arr);
        quick(arr,0,arr.length-1);
        print(arr);
    }

    private static void quick(int[] arr, int low, int hi) {
        if(low>=hi) return;
        int pivot =partision(arr,low,hi);
        quick(arr,low,pivot-1);
        quick(arr,pivot+1,hi);
    }

    private static int partision(int[] arr, int low, int hi) {
        int piv=arr[low],pindx=low,smaller=0;

        for(int i=pindx+1;i<=hi;i++) {
            if(arr[i]<piv){
                smaller++;
            }
        }
        swap(arr,pindx,pindx+smaller);
        int pivot=pindx+smaller;
        int i=low,j=hi;
        while(i<pivot&&j>pivot){
            if(arr[i]<arr[pivot]){
                i++;
            }
            else if(arr[j]>arr[pivot]){
                j--;
            }
            else if(arr[i]>arr[pivot]&&arr[j]<arr[pivot])
                swap(arr,i,j);
        }
    return pivot;
    }

    private static void swap(int[] arr, int pindx, int i) {
        int temp=arr[pindx];
        arr[pindx]=arr[i];
        arr[i]=temp;
    }
}
