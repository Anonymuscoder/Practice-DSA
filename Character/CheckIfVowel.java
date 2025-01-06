//code for checking if a character is a Vowel or Consonant

import java.util.Scanner;

class CheckIfVowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] vowel = {'a','e','i','o','u','A','E','I','O','U'};
        System.out.println("Enter a character to check if it is vowel or consonant");
        char ch = sc.next().charAt(0);
        for(int i=0; i<vowel.length; i++){
            if(ch==vowel[i]){
                System.out.println("Character "+ch+" is Vowel");
                break;
                
            }else{
                System.out.println("Character "+ch+" is consonant");
                break;
            }
        }

        sc.close();
    }
}