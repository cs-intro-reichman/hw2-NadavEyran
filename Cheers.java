// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            
        String S = args[0];
        int number = Integer.parseInt(args[1]);
        int Slength = S.length();

        for (int i = 0; i < Slength; i++) {
            char charCurrent = S.charAt(i);
            String lettersA = "a  ";

            switch (charCurrent) {
                case 'A': case 'E': case 'F': case 'H': case 'I': case 'L': 
                case 'M': case 'N': case 'O': case 'R': case 'S': case 'X':
                case 'a': case 'e': case 'f': case 'h': case 'i': case 'l':
                case 'm': case 'n': case 'o': case 'r': case 's': case 'x':
                    lettersA = "an ";
                    break;
            }

            System.out.println("Give me " + lettersA + charCurrent + ": " + charCurrent + "!");
        }

        System.out.println("What does that spell?");

        for (int k = 0; k < number; k++) {
            System.out.println(S + "!!!");
        }
    }
}   