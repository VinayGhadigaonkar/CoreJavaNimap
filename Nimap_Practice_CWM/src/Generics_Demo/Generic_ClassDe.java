package Generics_Demo;

public class Generic_ClassDe<T> 
{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
	public static void main(String[] args) 
	{
		Generic_ClassDe<Integer> inte = new Generic_ClassDe<Integer>();
		inte.setT(20);
		
		Generic_ClassDe<String> name = new Generic_ClassDe<String>();
		name.setT("Vinay");
		
		System.out.println(inte.getT());
		System.out.println(name.getT());
		
	}
	
	
	
}
