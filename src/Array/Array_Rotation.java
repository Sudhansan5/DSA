package Array;

public class Array_Rotation {

    void reverse(int arr[], int B,int C){
        int temp;

        while(B< C){
            temp = arr[B];
            arr[B] = arr[C];
            arr[C] = temp;
            B++;
            C--;
        }
    }
    public int[] solve(int[] A, int B) {

        B = B % A.length;
        reverse(A,0,A.length-1);
        reverse(A,0,B-1);
        reverse(A,B,A.length-1);
        return A;
    }
}
