
public class Abstraction extends demo{
	@Override
	public void aa() {
		System.out.println("This is Method AA...");
	}
	public static void main(String[] args) {
	Abstraction abstraction = new Abstraction();
	abstraction.a();
	abstraction.aa();
		
	}
}


abstract class demo{
	public void a()
	{
		System.out.println("This is Method A...");
	}
	
	public abstract void aa();
	
	
}
