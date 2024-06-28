//code for pascal's triangle (INCOMPLETE)

class Exercise17 {
    public static void main(String[] args) {
        int num=5;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                if(j==i || j==1){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(j +" ");
                }
            }
            System.out.println();
        }
    }
}
