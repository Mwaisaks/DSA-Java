package DynamicProgramming;

// SPace Optimisation
public class FibonacciSpace {

    static int fibo(int n){
        int prevPrev, prev, curr;

        // Storing the independent values
        prevPrev = 0;
        prev = 1;
        curr = 1;

        // Using the bottom-up approach
        for (int i = 2; i <= n;i++){
            curr = prev + prevPrev;
            prevPrev = prev;
            prev = curr;
        }

        return curr;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibo(n));
    }
}
