package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumericSubset {
    static List<List<Integer>> arr ;
    public static void helper(int i, int[] nums, ArrayList<Integer> ans){
        if(i==nums.length){
            ArrayList<Integer> list= new ArrayList<>();
            for(int j=0;j<ans.size();j++){
                list.add(ans.get(j));
                System.out.print(ans.get(j));
            }
            System.out.println();
            arr.add(list);
            return;
        }
        helper(i+1,nums,ans);
        ans.add(nums[i]);
        helper(i+1,nums,ans);
        ans.remove(ans.size()-1);
    }

    public static void subsets(int[] nums) {
        arr= new ArrayList<>();
        ArrayList<Integer> ans= new ArrayList<>();
        helper(0,nums,ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]= sc.nextInt();
        }
        subsets(nums);

    }
}
