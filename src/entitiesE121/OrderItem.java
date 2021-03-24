package entitiesE121;

public class OrderItem {
      
	private Integer quantity;
	private double productPriceO;
	
	private Product product;
	
	public OrderItem() {
		
	}

    public OrderItem(Integer quantity, double productPriceO, Product product) {
    	   this.quantity = quantity;
    	   this.productPriceO = productPriceO;
    	   this.product = product;
    }

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getproductPriceO() {
		return productPriceO;
	}

	public void setproductPriceO(double productPriceO) {
		this.productPriceO = productPriceO;
	}

    public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
    	 return productPriceO * quantity;
    }



}

