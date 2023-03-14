package Exercicio1.fibonacci;

public class fibonacci2 {
    public static int fib2(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int n1 = 0, n2 = 1, tempN = 0;
        for(int i = 2; i <= n; i++){
            tempN = n1 + n2;
            n1 = n2;
            n2 = tempN;
        }
        return tempN;
    }
}
