package pre.propertiesEx2;

public class Drama implements Comparable<Drama> {
	private String name;
	private int year;
	private int series;

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public int getSeries() {
		return series;
	}

	public Drama() {

	}

	public Drama(String name, int year, int series) {
		this.name = name;
		this.year = year;
		this.series = series;
	}

	@Override
	public String toString() {
		return name+","+year+","+series;
	}

	@Override
	public int compareTo(Drama o) {
		return this.name.compareTo(o.name);
	}
}
