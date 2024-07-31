//program for printing number from 1 to 5 using recursion

class A {

    public void printNum(int n) {

        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNum(n + 1);
    }
}

class Demo {
    public static void main(String[] args) {
        int n = 1;
        A obj = new A();
        obj.printNum(n);
    }
}