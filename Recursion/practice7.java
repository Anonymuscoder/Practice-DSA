//code for printing factorial of a number using recursive fuction
class Demo {

    public static int fact(int n) {
        if (n == 1)
            return n;
        int temp = fact(n - 1);
        return temp * n;
    }

    public static void main(String[] args) {
        int r = fact(6);
        System.out.println(r);
    }
}