
public class Method_Overloading {
	public void demo() 
	{
		System.out.println("First Method");
	}

	public void demo(String num)
	{
		System.out.println(num + "Method");
	}

	public static void main(String[] args) {
		Method_Overloading mo = new Method_Overloading();
		mo.demo();
		mo.demo("Second ");
	}
}
