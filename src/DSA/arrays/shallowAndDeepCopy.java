package DSA.arrays;

import java.util.Arrays;

public class shallowAndDeepCopy {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        //Shallow Copy
        int[] brr = arr;
        brr[0] = 222;
        System.out.println(arr[0]);//222 arr array has been given a new name as brr
        //deep Copy
        int[] crr = Arrays.copyOf(arr,arr.length);
        crr[1] = 333;
        System.out.println(arr[1]);//20 as a new copy of arr is make instead of assigning it a new name

        //method 2 of deep copy
        int[] drr = new int[arr.length];
        for(int i =0 ;i< arr.length;i++){
            drr[i] = arr[i];
        }
        drr[3] = 444;
        System.out.println(arr[3]);//20 as a new copy of arr is make instead of assigning it a new name

    }
}
