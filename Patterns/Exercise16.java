//code for printing hallow rhombus

class Exercise16 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=2*(5-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=5; j++){
                if(j==1 || j==5 || i==1 || i==5){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
