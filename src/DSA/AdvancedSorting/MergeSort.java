package DSA.AdvancedSorting;

public class MergeSort {
    public static void main(String[] args) {

        print(arr);
        merge(arr);
        System.out.println();
        print(arr);
    }
    public static void merge(int[] arr){
        int n= arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0,j=0;i<n;i++){
            if(i<n/2){
                a[i]=arr[i];
            }
            else{
                b[j++]=arr[i];
            }
        }
        merge(a);
        merge(b);
        mergeTwo(a,b,arr);

    }
    public static void mergeTwo(int[] arr,int[] brr,int[] crr){
        int a=0,b=0,c=0,n=arr.length,m=brr.length;
        while(a<n&&b<m){
            if(arr[a]<brr[b]){
                crr[c]=arr[a];
                a++;
            }
            else{
                crr[c]=brr[b];
                b++;
            }
            c++;
        }
        while(a<n){
            crr[c]=arr[a];
            a++;
            c++;
        }
        while(b<m){
            crr[c]=brr[b];
            b++;
            c++;
        }
    }

    private static void print(int[] arr) {
    for(int elm:arr){
        System.out.print(elm+" ");
    }
    }
}
