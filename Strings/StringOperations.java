//code for performing operations on strings;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to perform operations..");
        String st = sc.nextLine();

        String subStr = st.substring(0,1).toUpperCase() + st.substring(1); // geting first character out
        System.out.println("After converting first character of string: "+subStr);

        int length = st.length();
        System.out.println("Length of String: "+length); //finding length

        String subStr1 = st.substring(2,4); //getting substring out string
        System.out.println(subStr1);

        sc.close();
    }
}
