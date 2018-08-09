public class Fibonacci {
    public static void main(String[] args) {
        FibonacciSolution fibonacciSolution = new FibonacciSolution();
        fibonacciSolution.Fibonacci(4);
    }
}

class FibonacciSolution {
    public int Fibonacci(int n) {
        int one = 0;
        int two = 1;
        int three = 0;
        if(n==0){
            return one;
        }
        if (n==1){
            return two;
        }
        for(int i = 2;i<=n;i++){
                three = one+two;
                 one = two;
                two = three;

        }
        return three;
    }
}