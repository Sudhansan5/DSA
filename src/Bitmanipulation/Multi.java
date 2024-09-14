package Bitmanipulation;

public class Multi {
    public int solve(int A) {
        int ans = 1;
        int num=1;
        if(A == 1){
            return A;
        }
        while((num<<1) <= A){
            System.out.println(num+" #");
            num = num<<1;
        }
        ans+=A-num;
        return ans;
    }
    public static void main(String[] args) {
        Multi obj = new Multi();
        System.out.println(obj.solve(7));
    }
}
