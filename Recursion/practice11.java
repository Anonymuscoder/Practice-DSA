//Write a recursive function to print all numbers from n to 1.
class practice11 {
    public static void desc(int n){
        if(n<1){return;}

        System.out.println(n);

        desc(n-1);
    }
    
    public static void main(String[] args) {
        desc(5);
    }
}
