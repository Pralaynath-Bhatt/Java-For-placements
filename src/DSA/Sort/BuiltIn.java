package DSA.Sort;

import java.util.Arrays;

public class BuiltIn {
    public static void main(String[] args) throws InterruptedException {
        int[] arr ={7,8,1,2,3,-4};
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int n=(int)(Math.random()*10);
        for(int i=0;i<n;i++){
            String text = "sorting";
            for (int j = 0; j < 3; j++) {
                text+=".";
                Thread.sleep(1000);
                System.out.println(text);
            }
        }
        System.out.println();
        Arrays.sort(arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
