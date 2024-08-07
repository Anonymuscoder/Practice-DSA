//code for checking whether the given number N is prime or not

public class practice2 {

    public static void prime(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i != n / i) {
                    count = count + 2;
                } else {
                    count = count + 1;
                }
            }
        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("not prime");
        }
    }

    public static void main(String[] args) {
        prime(11);
    }
}
