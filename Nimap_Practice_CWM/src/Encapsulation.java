
class Entity {
	private String name;
	private String idNum;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Encapsulation {
	public static void main(String[] args) {
		Entity e = new Entity();
		e.setAge(25);
		e.setIdNum("7738028020");
		e.setName("Vinay");

		System.out.println("Age " + e.getAge() + " Number " + e.getIdNum() + " Name " + e.getName());
	}
}