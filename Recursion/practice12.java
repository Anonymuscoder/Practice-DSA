//Write a recursive function to print all numbers from 1 to n.

class practice12 {
    
    public static void inc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        inc(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        inc(5);
    }
}
