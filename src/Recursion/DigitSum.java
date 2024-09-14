package Recursion;

/*
Given a number A, check if it is a magic number or not.

A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively by adding
the sum of the digits after every addition.
If the single digit comes out to be 1, then the number is a magic number.
A = 83557
Output: 1
 */
public class DigitSum {
    public static void main(String[] args) {
        DigitSum obj = new DigitSum();
        System.out.println(obj.digitSumRec(1291,0));
    }

    public int solve(int A) {
        if(A/10==0){
            if(A==1){
                return 1;
            }
            return 0;
        }
        A= digitSum(A);
        return solve(A);
    }

    int digitSum(int num){
        int r,sum=0;
        while (num!=0){
            r = num%10;
            sum+=r;
            num = num/10;
        }
        return sum;
    }

    int digitSumRec(int num, int sum){
        if(num ==0){
            return sum;
        }
        sum+=num%10;
        return digitSumRec(num/10,sum);
    }
}
