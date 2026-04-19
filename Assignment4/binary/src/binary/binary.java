package binary;

public class binary {
	
	    public static void printBinary(int n) {
	        
	        if (n > 0) {
	           
	            printBinary(n / 2);
	            
	            System.out.print(n % 2);
	        } else if (n == 0) {
	            
	            return;
	        }
	    }

	    public static void main(String[] args) {
	        int decimal = 13;
	        System.out.print("Binary of " + decimal + " is: ");
	        if (decimal == 0) System.out.print(0);
	        else printBinary(decimal);
	    }
	}



