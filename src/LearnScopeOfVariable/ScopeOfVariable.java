package LearnScopeOfVariable;

public class ScopeOfVariable {
	// 'counter' is a static variable with class scope
    static Integer counter = 0;

    public ScopeOfVariable() {
        counter++; // Increment 'counter' for each new instance created
    }

    public static void displayCounter() {
        System.out.println("Counter: " + counter+"hascode"+counter.hashCode()); // 'counter' is accessible here
    }
    public static void main(String[] args) {
    	ScopeOfVariable sb=new ScopeOfVariable();
    	ScopeOfVariable sb1=new ScopeOfVariable();
    	sb1.displayCounter();
	}
}
