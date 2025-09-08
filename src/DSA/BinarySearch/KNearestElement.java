package DSA.BinarySearch;

import java.util.*;
public class KNearestElement
{
    public static void print(List<Integer> ans){
        System.out.println();
        for(int elm:ans){
            System.out.print(elm+" ");
        }
    }
    public static void main(String[] args) {
        //Write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k= sc.nextInt();
        int x=sc.nextInt();
        List<Integer> ans=new ArrayList<>();

        if(x<=arr[0]){
            for(int i=0;i<k;i++){
                ans.add(arr[i]);
            }
            print(ans);
        }
        if(x>=arr[n-1]){
            for(int i=n-1;i>n-k-1;i--){
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            print(ans);
        }
        int lb=-1,lo=0,hi=n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>=x){
                lb=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        int j=lb,i=lb-1;
        while(k>0 && i>=0 && j<=n-1){
            int dj= Math.abs(x-arr[j]);
            int di= Math.abs(x-arr[i]);
            if(di<=dj){
                ans.add(arr[i]);
                i--;
            }
            else {
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        while(k>0){
            if(i>=0){
                ans.add(arr[i]);
                i--;
            }
            else if(j<=n-1){
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        Collections.sort(ans);
        print(ans);
    }
}