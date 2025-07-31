package DSA.arrays;

public class RotateByNumer {
    public static void reverse(int[] arr,int i,int j){
        int temp;
        while(i<j){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int[] arr =new int[nums.length];
        int j=0;
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k =5;
        rotate(nums,k);
    }
    public void swapArrays(int[] nums, int k){
        int[] arr =new int[nums.length];
        int j=0;
        for(int i = nums.length-k;i<nums.length;i++,j++){
            arr[j]=nums[i];
        }
        for(int i=0;i<nums.length-k;i++,j++){
            arr[j]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
            System.out.print(arr[i]+" arr ");
            System.out.print(nums[i]+" nums ");

        }
    }
}
