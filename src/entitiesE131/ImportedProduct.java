package entitiesE131;

public class ImportedProduct extends Product {

	private double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public final double totalPrice() {
		   return getPrice() + getCustomsFee();
	}
	
	@Override
	public String priceTag() {
		return getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + getCustomsFee() + ") ";	
	}
	
}
