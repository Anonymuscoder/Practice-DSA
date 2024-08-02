//code for calculating sum of first n natural numbers
class practice8 {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int temp = sum(n - 1);
        return temp + n;
    }

    public static void main(String[] args) {
        int r = sum(4);
        System.out.println(r);
    }
}
