// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
	    int Number = Integer.parseInt(args[0]);
	    double pi4 = 1;

	    for (int i = 1; i<Number ; i++ ) {
	    	double fraction = (1.0/(2*i+1));
	    	if (i%2 == 0){
	    	pi4 += fraction;
	    }else{
	    	pi4 -= fraction;

	    	}
	    }

	    double pi = 4*pi4;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + pi);	    
	    
	}
}
