//code for recursively calculating a^n (a raised to the power of b).

class practice16 {
    
    public static int pow(int a, int n){
        if(n<=1){
            return a;
        }
        int temp = pow(a, n/2);
        if(n%2==0){
            return temp*temp;
        }
        else{
            return temp*temp*a;
        }
    }

    public static void main(String[] args) {
        
        int result = pow(2,7);
        System.out.println(result);
    }
}
