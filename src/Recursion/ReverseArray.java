package Recursion;

public class ReverseArray {

    void sort(int arr[]){
        reverse(arr,0,arr.length-1);
    }

    void reverse(int arr[], int start, int last){
        if ((start == last) || start>=last){
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            return;
        }
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
        reverse(arr,start+1,last-1);
    }

    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        int arr[] = {2,3,1,5,7,9};
        obj.sort(arr);
    }
}
