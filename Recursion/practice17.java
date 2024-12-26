//Write a recursive function to count the number of times a digit appears in a number n.

class practice17 {
    
    public static int countDigits(int n){
        int count = 0;
        int t = 2; 
        return countDigits(n, count, t);
    }
    public static int countDigits(int n, int count, int t){
        if(n==0){
            return count;
        }
        if(n%10==t){
            count = count +1;
        }
        int temp = countDigits(n/10, count, t);
        return temp;
    }

    public static void main(String[] args) {
        int r = countDigits(22222);
        System.out.println(r);
    }
}
