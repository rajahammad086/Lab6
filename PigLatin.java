// Raja Hammad Mehmood.
// takes string values and prints out PigLatin version of that.

import java.util.Scanner;
public class PigLatin {


    public static void main ( String[] args ) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the word");
    String word=scanner.nextLine();// word saves the string value (original)
   while (word.equalsIgnoreCase("stop")!=true){ // program stops at 'stop' 
    System.out.println("translated word is : " + pigifyWord(word));// calls the pigifyWord function and prints the translated version
    System.out.println("enter another word or type stop to stop");
    
    word=scanner.nextLine();  
    }
    }

    
    /**
     *checks if a character is vowel or not
     *@param1 is the character which needs to be checked
     *@return is true if the character is a vowel and viceversa
     
     */
    public static boolean isVowel (char character) {
        if (character=='a' ||character=='e' ||character=='i'|| character=='o' || character=='u'){
         return true;   
        }
        else{
            return false;
        }
        
    }
    
    
    
   
    /**
     *It takes the word by the user and tells the position where vowel is first occured
     *@param1 is the word entered by user
     *@return is the position at which vowel is first present
     
     */
    public static int findFirstVowel(String word) {
        int position=-1;// tracks the position of vowel
        boolean checkvowel; // this saves if a character is vowel or not.
        for(int count=0; count<word.length() ; count++){
           checkvowel=isVowel(word.charAt(count));
           if (checkvowel==true){
            position=count;
            return position;
           }
        }
        return position;
    }


    
    /**
     *takes the word and presents the translated version.
     *@param1 is the original word
     *@return is the trnaslated version
    
     */
    public static String pigifyWord(String originalword ) {
        int checkposition=findFirstVowel(originalword);// checkposition saves the position of the first vowel.
        if (checkposition==-1){
          return originalword;  
        }
        else if (checkposition==0){
            return originalword+"yay";
        }
        
        else {
            String chunk=originalword.substring(0,checkposition);
            String translated= originalword.substring(checkposition,originalword.length()) + chunk +"ay";
            return translated;
        }

}
}
