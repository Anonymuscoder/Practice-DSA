//code for printing x^n using recursion
public class practice5 {

    public static int calcPow(int x, int n)
    {   if(n==0){
        return 1;
        }
        if(x==0){
            return 0;
        }
        int temp1 = calcPow(x, n-1);
        int temp2= x*temp1;
         return temp2;
        
    }

    public static void main(String[] args) {
        int x=2, n=5;
        int r = calcPow(x, n);
        System.out.println(r);
    }
}
