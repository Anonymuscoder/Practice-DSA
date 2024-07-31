//code for printing x^n with (log n) height

public class practice6 {

    public static int calcPow(int x, int n) {
        if (n == 0 || n == 1) {
            return x;
        }
        int temp = calcPow(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else
            return temp * temp * x;
    }

    public static void main(String[] args) {
        int r = calcPow(2, 5);
        System.out.println(r);
    }
}
