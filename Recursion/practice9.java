//code for calculating x^n using recursive function with Time complexity O(n)
class practice9 {

    public static int pow(int a, int n) {
        if (n == 1) {
            return a;
        }
        if (n == 0) {
            return 1;
        }
        int temp = pow(a, n - 1);
        return temp * a;

    }

    public static void main(String[] args) {
        int a = 3, n = 4;
        int r = pow(a, n);
        System.out.println(r);
    }
}
