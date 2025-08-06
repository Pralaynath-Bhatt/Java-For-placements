package DSA.D2Array;

public class transoseOfSquareMatrics {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                if(i<j){
                    temp= arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
