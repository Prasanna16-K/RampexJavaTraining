package Day21.Classtask;

public class Fibonacci {
    public static void main(String[] args){
        System.out.println(fibo(4));
    }
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
