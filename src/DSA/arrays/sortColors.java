package DSA.arrays;

public class sortColors {
    public static void main(String[] args) {
        int[] arr ={0,0,1,1,2,1,0,2,2,0};
        int n = arr.length;
        //method 1
        // 2 parser
        //pass2(arr,n);


        //method 2
        // 1 parser
        // Dutch flag algorithm
        pass1(arr,n);


        System.out.println();
        for(int elm: arr){
            System.out.print(elm+" ");
        }

    }

    private static void pass1(int[] arr, int n) {
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }

    private static void swap(int[] arr,int i, int i1) {
    int temp= arr[i];
    arr[i]= arr[i1];
    arr[i1]= temp;
    }

    private static void pass2(int[] arr,int n) {
        int noOfZeros=0,noOfOnes=0;
        for(int i=0 ; i<n;i++){
            if(arr[i]==0) noOfZeros++;
            if(arr[i]==1) noOfOnes++;
        }
        for(int i=0;i<n;i++){
            if(i<noOfZeros) arr[i] = 0;
            else if(i<noOfZeros+noOfOnes) arr[i] = 1;
            else arr[i]=2;
        }
    }
}
