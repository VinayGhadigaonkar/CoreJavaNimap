public class Interfaces_Demo implements demoes 
{

	@Override
	public void dmo() {
		System.out.println("This is dmo Method");
	}

	public static void main(String[] args) {
		Interfaces_Demo d = new Interfaces_Demo();
		d.dmo();
	}
}

interface demoes {
	void dmo();
}