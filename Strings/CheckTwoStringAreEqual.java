//code for checking if two strings are equal or not
import java.util.*;

class CheckTwoStringAreEqual{
    public static boolean checkEqual(String st, String st1){ //or use equal() method of string class
        if(st.length()!=st1.length()){
            return false;
        }else{
            for(int i=0; i<st.length(); i++){
                if((st.charAt(i))!=st1.charAt(i)){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String one:");
        String st = sc.nextLine();
        System.out.println("Enter String two:");
        String st1 = sc.nextLine();
        boolean result = checkEqual(st, st1);
        System.out.println("result:"+ result);

        sc.close();
    }
}