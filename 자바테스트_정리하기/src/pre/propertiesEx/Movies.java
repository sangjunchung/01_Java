package pre.propertiesEx;

public class Movies implements Comparable<Movies> {
	private String name;
	private int rating;
	private int audience;

	public void setName(String name) {
		this.name = name;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setAudience(int audience) {
		this.audience = audience;
	}

	public String getName() {
		return name;
	}

	public int getRating() {
		return rating;
	}

	public int getAudience() {
		return audience;
	}
	
	public Movies() {
		
	}

	public Movies(String name, int rating, int audience) {
		this.name = name;
		this.rating = rating;
		this.audience = audience;
	}

	@Override
	public String toString() {
		return name+","+rating+","+audience;
	}

	@Override
	public int compareTo(Movies o) {
		return this.name.compareTo(o.name);
	}

}
