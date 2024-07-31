//code for printing factorial of a number using recursion

public class practice3 {

    public static int fact(int n) {
        if (n == 1) {
            return n;
        }
        int temp = fact(n - 1);
        return temp * n;
    }

    public static void main(String[] args) {
        int n = fact(5);
        System.out.println(n);
    }
}
