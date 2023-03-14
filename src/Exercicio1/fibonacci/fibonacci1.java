package Exercicio1.fibonacci;

public class fibonacci1 {
    public static int fib1(int n ){
        if(n == 0 || n == 1){
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }
}
