package DSA.ArrayList;

import java.util.*;

public class FindNumber {
        public static void main(String[] args) {
            // write your code logic here;
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>(n);
            int index =-1;
            for(int i =0 ;i<n;i++){
                int j = sc.nextInt();
                arr.add(i,j);
            }
            int target = sc.nextInt();
            for(int i =0 ;i<n;i++){
                if(target==arr.get(i))
                {index = i;
                break;
                }
            }
            System.out.println(index+" ");
        }
}
