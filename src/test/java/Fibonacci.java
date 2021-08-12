import org.junit.jupiter.api.Test;

public class Fibonacci {

    static int fibo(int n) {
        int fiboNum = 0;
        if (n == 1 || n == 2)
            return 1;
        else
            fiboNum = fibo(n - 1) + fibo(n - 2);

        return fiboNum;
    }

    static int fibo2(int n) {
        if (n == 1 || n == 2)
            return 1;
        int fiboNum1 = 1;
        int fiboNum2 = 1;
        int fiboNum3 = 1;
        for(int i=3 ;i<=n;i++)
        {
            fiboNum3=fiboNum1+fiboNum2;
            fiboNum1=fiboNum2;
            fiboNum2 = fiboNum3;
        }

        return fiboNum3;
    }

    public static void main(String[] ars) {
        int n = 4;
        System.out.println("Fibonacis up to " + n);
        for (int i = 1; i <= n; i++) {
            int fibo = fibo(i);
            System.out.println(fibo);
        }
        System.out.println("Fibonacis up to2 " + n);
        for (int i = 1; i <= n; i++) {
            int fibo1 = fibo2(i);
            System.out.println("new "+fibo1 );
        }
    }
}
