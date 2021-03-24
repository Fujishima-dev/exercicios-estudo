package entitiesE131;

public class UsedProduct extends Product{

	private String date;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, double price, String date) {
		super(name, price);
	    this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String priceTag() {
		return getName() + "(Used) $ " + String.format("%.2f", getPrice()) + " (Manufacture date: " + getDate() + ") ";	
	}
	
}
