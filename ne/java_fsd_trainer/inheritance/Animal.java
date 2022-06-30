package inheritance;

public class Animal {
	private String name;
	private int size;
	private int weight;
	protected String foodtype;
	
	public Animal(String name, int size, int weight) {
		
		this.name = name;
		this.size = size;
		this.weight = weight;
	}
	
	public void eat() {
		System.out.println("animal.eat()");
	}
	
	public void move(int speed) {
		System.out.println("animal.move()", +speed);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getFoodtype() {
		return foodtype;
	}

	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}
	
	

}
