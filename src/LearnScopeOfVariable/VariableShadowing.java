package LearnScopeOfVariable;

public class VariableShadowing {
	 int x = 10; // Instance variable 'x'

	    public void method() {
	        int x = 20; // Local variable 'x' shadows the instance variable 'x'
	        System.out.println(x); // Prints 20, referring to the local variable
	    }

	    public void printX() {
	        System.out.println(x); // Prints 10, referring to the instance variable
	    }
	    public static void main(String[] args) {
	    	VariableShadowing vs= new VariableShadowing();
	    	vs.method();
	    	vs.printX();
		}
}
