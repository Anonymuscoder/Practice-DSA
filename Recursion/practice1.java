//program for printing numbers from 5 to 1 using recursion

class Calc {

    public void printNum(int n) {

        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n - 1);

    }

}

public class practice1 {
    public static void main(String[] args) {

        int n = 5;
        Calc obj = new Calc();
        obj.printNum(n);

    }
}
