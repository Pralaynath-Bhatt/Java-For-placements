package DSA.D2Array;

import java.util.ArrayList;
import java.util.List;

public class spiral_52 {
        public List<Integer> spiralOrder(int[][] arr) {
            int n = arr.length;
            int m = arr[0].length;
            int maxRow=n-1;
            int maxColumn=m-1;
            int minRow = 0;
            int minColumn =0;
            List<Integer> ans = new ArrayList<>();
            while((minRow<=maxRow)&&(minColumn<=maxColumn)){
                for(int i=minRow,j=minColumn;j<=maxColumn;j++){
                    ans.add(arr[i][j]);
                }
                minRow++;
                if(minRow>maxRow || minColumn>maxColumn) break;
                for(int i=minRow,j=maxColumn;i<=maxRow;i++){
                    ans.add(arr[i][j]);
                }
                maxColumn--;
                if(minRow>maxRow || minColumn>maxColumn) break;
                for(int i=maxRow,j=maxColumn;j>=minColumn;j--){
                    ans.add(arr[i][j]);
                }
                maxRow--;
                if(minRow>maxRow || minColumn>maxColumn) break;
                for(int i=maxRow,j=minColumn;i>=minRow;i--){
                    ans.add(arr[i][j]);
                }
                minColumn++;

            }
            return ans;
        }

    }
