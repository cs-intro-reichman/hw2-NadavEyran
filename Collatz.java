// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
	    int seed = Integer.parseInt(args[0]);
	    String mode = args[1];
	    int steps = 1;
	    System.out.print(seed+" ");

	    switch (mode) {
		    case "v":
			    while ( seed > 1) {
			    	if (seed%2 == 0 ) {
			    	seed = seed/2;
			    	}else{
			    	seed = seed*3+1;
			    		}
			    	steps += 1;
			    	System.out.print(seed+" ");
			    	}
			    	System.out.print("("+steps+")");
			    	break;
			case "c":
		    	while ( seed > 1) {
		    		if (seed%2 == 0 ) {
		    		seed = seed/2;
		    		}else{
		    		seed = seed*3+1;
		    		}
		    		steps += 1;
		    		}
		    		System.out.print("Every one of the first "+steps+" hailstone sequences reached 1.");
		    		break;
		    default:
		    	System.out.print("-1");	
	    	}
	    }
	}
	

