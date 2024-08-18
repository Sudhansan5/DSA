package Array.Sorting;

import java.util.Arrays;

public class NobleInteger {

    public int solve(int[] A) {
        Arrays.sort(A);
        int found = -1;
        int index = 0;
        int n = A.length;
        for(int i=0;i<n-1;i++){
            index = i;
            while(index+1<n && A[index]==A[index+1]){
                index++;
            }
            if(A[i]==n-index-1){
                found =1;
            }

        }
        return found;
    }

    public static void main(String[] args) {
        NobleInteger obj = new NobleInteger();
        int arr[] = {-1,-2,0,0,0,-3};
        System.out.println(obj.solve(arr));
    }
}
