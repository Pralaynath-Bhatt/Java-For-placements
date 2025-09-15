package DSA.AdvancedSorting;

public class Merge_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,8,22,44,55,66,77,88};
        int[] brr={0,2,3,6,10,11,24};
        int n= arr.length;
        int m= brr.length;
        int a=0,b=0,c=0;
        int[] crr=new int[n+m];
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
        for(int elm:crr){
            System.out.println(elm);
        }

    }
}
