package DSA.AdvancedSorting;

public class merge2 {
    public static void print(int[] arr){
        for(int elm:arr){
            System.out.print(elm+" ");
        }
        System.out.println();
    }
    static void main() {
        int[] arr={90,80,20,11,22,455,78,1,40,50};
        print(arr);
        mergesort(arr);
        print(arr);

    }


    private static void mergesort(int[] arr) {
        int n= arr.length;
        if(n==1) return;
        int[] arr1=new int[n/2];
        int[] arr2= new int[n-n/2];
        for (int i = 0; i <n/2; i++) {
            arr1[i]=arr[i];
        }
        for (int i = 0; i <n-n/2; i++) {
            arr2[i]=arr[i+n/2];
        }
        mergesort(arr1);
        mergesort(arr2);
        merge(arr1,arr2,arr);
    }

    private static void merge(int[] arr1, int[] arr2, int[] arr) {
        int i=0,j=0,k=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j])
                arr[k++]=arr1[i++];
            else
                arr[k++]=arr2[j++];
        }
        while(i<arr1.length)
            arr[k++]=arr1[i++];
        while(j<arr2.length)
            arr[k++]=arr2[j++];
    }
}
