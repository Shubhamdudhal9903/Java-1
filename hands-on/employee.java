package corejava;

public class employee {
	public void name() {
		System.out.println("Amruta");
	}
}
class departement extends employee {
    public void dep() {
        System.out.println("HR");
    }
}
class RunEmployee{
    
    public static void main(String[] args) {        
        departement d= new departement();
        d.name();
        d.dep();
        d.name();
    }
}

	

