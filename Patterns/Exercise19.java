//code for printing inverted half pyramid using numbers

class Exercise19 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=i; j<=4; j++){  
                System.out.print(i);   
            }
            System.out.println();
        }
    }
}
