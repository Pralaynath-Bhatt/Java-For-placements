package DSA.arrays;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] num1={1,32,44,55};
        int[] num2={0,2,4,99};
        int n = num1.length;
        int m= num2.length;
        int[] arr = new int[n+m];
        int k = 0;
        int i=0;
        int j =0;
        while(i<n && j<m){
            if(num1[i]<num2[j]){
                arr[k]=num1[i];
                i++;
            }
            else
            {
                arr[k]= num2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            arr[k]=num1[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k]=num2[j];
            j++;k++;
        }

        for(int elm: arr){
            System.out.print(elm+ " ");
        }
    }
    //leetcode https://leetcode.com/problems/merge-sorted-array
    public void merge(int[] num1, int m, int[] num2, int n) {
        int k = num1.length-1;
        int i=m-1;
        int j =n-1;
        while(i>=0 && j>=0){
            if(num1[i]>num2[j]){
                num1[k]=num1[i];
                i--;
            }
            else
            {
                num1[k]= num2[j];
                j--;
            }
            k--;
        }
        while(i>=0){
            num1[k]=num1[i];
            i--;
            k--;
        }
        while(j>=0){
            num1[k]=num2[j];
            j--;k--;
        }
    }
}
