// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code

        String S = args[0];
        int number = Integer.parseInt(args[1]);
        int Slength = S.length();

        char[] specialLetters = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X', 
                                'a', 'e', 'f', 'h', 'i', 'l', 'm', 'n', 'o', 'r', 's', 'x'};


        for (int i = 0; i<Slength ; i++) {
              char charCurrent = S.charAt(i);
                String lettersA = "a";

                for (int j = 0; j<24 ; j++) {
                     if (charCurrent == specialLetters[j]) {
                        lettersA = "an";           
                           }      
                   } 

        System.out.println("Give me "+lettersA+" "+charCurrent+": "+charCurrent+"!"); 
        }
        System.out.println("What does that spell?");

        for (int k = 0; k<number; k++ ) {
           System.out.println(S+"!!!");
                        }      
                } 
        }

