package Array;

public class ReverseInRange {

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
    public int[] solve(int[] A, int B, int C) {
        reverse(A,B,C);
        return A;
    }

    public static void main(String[] args) {
        ReverseInRange obj = new ReverseInRange();
        int arr[] = {6,7,10,3,10,10,3,10};
        int array[] = obj.solve(arr,0,4 );
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

}
