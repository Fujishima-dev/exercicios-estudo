package entitiesE133;

import entities.enums.Color;

public class Rectangle extends Shape{

	private double height;
	private double width;
	
	public Rectangle() {
		super();
	}
	
	

	public Rectangle(Color color, double height, double width) {
		super(color);
        this.height = height;
        this.width = width;
	}



	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
    
	@Override
	public  double area() {
		return width * height;
	}
}
