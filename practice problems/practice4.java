//code for returning difference between the product and sum of N digits

public class practice4 {

    public static int sum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            product = product * lastdigit;
            n = n / 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        int n = 1234;
        int r = sum(n);
        System.out.println(r);
    }
}
