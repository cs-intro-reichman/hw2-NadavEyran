public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            
        String S = args[0];
        int number = Integer.parseInt(args[1]);
        int Slength = S.length();
        String bigS = "";


        for (int i = 0; i < Slength; i++) {
            char charCurrent = S.charAt(i);

            switch (charCurrent) {
                case 'a': charCurrent = 'A'; break;
                case 'b': charCurrent = 'B'; break;
                case 'c': charCurrent = 'C'; break;
                case 'd': charCurrent = 'D'; break;
                case 'e': charCurrent = 'E'; break;
                case 'f': charCurrent = 'F'; break;
                case 'g': charCurrent = 'G'; break;
                case 'h': charCurrent = 'H'; break;
                case 'i': charCurrent = 'I'; break;
                case 'j': charCurrent = 'J'; break;
                case 'k': charCurrent = 'K'; break;
                case 'l': charCurrent = 'L'; break;
                case 'm': charCurrent = 'M'; break;
                case 'n': charCurrent = 'N'; break;
                case 'o': charCurrent = 'O'; break;
                case 'p': charCurrent = 'P'; break;
                case 'q': charCurrent = 'Q'; break;
                case 'r': charCurrent = 'R'; break;
                case 's': charCurrent = 'S'; break;
                case 't': charCurrent = 'T'; break;
                case 'u': charCurrent = 'U'; break;
                case 'v': charCurrent = 'V'; break;
                case 'w': charCurrent = 'W'; break;
                case 'x': charCurrent = 'X'; break;
                case 'y': charCurrent = 'Y'; break;
                case 'z': charCurrent = 'Z'; break;
                default: break;
            }

            String lettersA = "a  ";

            switch (charCurrent) {
                case 'A': case 'E': case 'F': case 'H': case 'I': case 'L': 
                case 'M': case 'N': case 'O': case 'R': case 'S': case 'X':
                case 'a': case 'e': case 'f': case 'h': case 'i': case 'l':
                case 'm': case 'n': case 'o': case 'r': case 's': case 'x':
                    lettersA = "an ";
                    break;
            }

            bigS = bigS + charCurrent;
            System.out.println("Give me " + lettersA + charCurrent + ": " + charCurrent + "!");
        }

        System.out.println("What does that spell?");

        for (int k = 0; k < number; k++) {
            System.out.println(bigS + "!!!");
        }
    }
}   