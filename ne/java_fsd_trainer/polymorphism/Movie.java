package polymorphism;

public class Movie {
	private String name;

	public Movie(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public String plot() {
		return "No plot here";
	}
	
}
