package entity;
public class Stock {

	private String name;
	private double percentChange;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentChange() {
		return percentChange;
	}

	public void setPercentChange(double percentChange) {
		this.percentChange = percentChange;
	}
	
	public Stock() {
	}
}
