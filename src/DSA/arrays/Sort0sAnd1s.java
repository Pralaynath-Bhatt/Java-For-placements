package DSA.arrays;

public class Sort0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,0,1,0};
        //2 parser
        //method 1 replacing 0s at first then assigning ones in the end


        //pass2(arr);

        //method 2
        // 1 parser
        pass1(arr);
        System.out.println();
        for(int elm: arr){
            System.out.print(elm + " ");
        }
    }

    private static void pass1(int[] arr) {
        int n =arr.length;
        for(int i =0,j=n-1;i<j;){
            if(arr[i]==0)   i++;
            if(arr[j]==1)   j--;
            if(i<j && arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;j--;
            }
        }
    }

    private static void pass2(int[] arr) {
        int noOfZeros= 0;
        int n =arr.length;
        for(int i = 0; i <n;i++){
            if (arr[i]==0)
                noOfZeros++;
        }
        for(int i = 0; i <n;i++){
            if (i<noOfZeros)
                arr[i]=0;
            else
                arr[i] = 1;
        }

    }
}
