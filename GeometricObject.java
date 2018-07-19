import java.util.*;

public abstract class GeometricObject {
	
	//Fields
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	//Default Constructor
	protected GeometricObject() {
		dateCreated = new Date();
	}
	
	//Value Constructor
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new Date();
		setColor(color);
		setFilled(filled);
	}

	//color Getter/Setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//filled Getter/Setter
	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	//date Getter
	public Date getDateCreated() {
		return dateCreated;
	}
	
	@Override
	//Overridden toString method
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	//abstract methods
	public abstract double getArea();
	
	public abstract double getPerimeter();
}
