package Exercicio1.fibonacci;

public class fibonacci3 {
    public static int fib3(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int i = 0, n1 = 0, n2 = 1, tempN;
        while (i < n){
            tempN = n1 + n2;
            n1 = n2;
            n2 = tempN;
            i++;
        }
        return n1;
    }
}
