//code for recursive function to calculate the sum of the digits of a non-negative integer.

class practice10 {

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sum(n / 10);

    }

    public static void main(String[] args) {
        int r = sum(1234);
        System.out.println(r);
    }

}
