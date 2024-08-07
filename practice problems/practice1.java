//code for printing count of factors for given number N

class practice1 {

    public static int factor(int n) {
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
        return count;
    }

    public static void main(String[] args) {
        int n = 36;
        int r = factor(n);
        System.out.println(r);
    }
}