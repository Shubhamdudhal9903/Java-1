package corejava;

public class Employeeone {
	public void emp_name()
	{
		System.out.println("Amruta");
	}
   }

class department extends Employeeone {
	public void dep()
	{
		System.out.println("HR");
	}
}

class state extends department {
	public void state()
	{
		System.out.println("Maharashtra");
	}
} 

class multiinherit{
	public static void main(String[] args)
	{
		state s = new state();
		s.emp_name();
		s.dep();
		s.state();

}
}
