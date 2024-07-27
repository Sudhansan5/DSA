package Recursion;

public class nToOneBacktracking {
    void printAll(int num){
        int i=num;
        printRecursively(1,num);
    }

    void printRecursively(int i,int num){
        if (i>num){
            return;
        }
        printRecursively(i+1,num);
        System.out.println(i);
    }
    public static void main(String[] args) {
        nToOneBacktracking obj = new nToOneBacktracking();

        obj.printAll(6);
    }
}
