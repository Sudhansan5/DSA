package TwoDArray;


public class Tcs {
    public static void main(String[] args){
        int arr[]={3,1,2,5};
        int ans=0;
        int max = 0;
        for(int i=0;i<arr.length;i++){

            if (arr[i]>=max){
                max = arr[i];
                ans++;
            }
        }
        System.out.println(ans);
    }
}
