
public class Constructor 
{
	String name;

	public Constructor(String name) 
	{
		this.name = name;
	}

	public Constructor() 
	{
		name = "Vinay";
	}
	
	public static void main(String[] args) {
		Constructor  c = new Constructor();
		System.out.println(c.name);
		
		Constructor c1 = new Constructor("Ghadigaonkar");
		System.out.println(c1.name);
		
	}
	
	
}
