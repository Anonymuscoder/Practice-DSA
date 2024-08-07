//code for returning floor(sqrt(n))
public class practice3 {

    public static int sqrt(int n){
        int ans = 1;
        int i=1;
        while(i*i<=n){
            ans=i;
            i++;
        }
        return ans;
    } 
    
    public static void main(String[] args) {
        int n=54;
        int r = sqrt(n);
        System.out.println(r);
    }
}
