package corejava;

public class logicaloperater {

	public static void main(String[] args) {
		//initializing variables
		int a=10, b=1, c=10, d=30;
		//displaying a,b,c
		System.out.println("value of a: " +a);
		System.out.println("value of b: " +b);
		System.out.println("value of c: " +c);
		System.out.println("value of d: " +d);
		
		//using logical AND to verify two constraints
		if(a>b || c==d) 
			
			System.out.println("One or both" + " the conditions are true");
		
		else 
			System.out.println("Both the"+ " conditions are false");		
		}

}
