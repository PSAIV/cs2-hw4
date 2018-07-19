
public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

  /** Return width */
  	public double getWidth() {
  		return width;
  	}

  /** Set a new width */
  	public void setWidth(double width) {
  		this.width = width;
  	}

  /** Return height */
  	public double getHeight() {
  		return height;
  	}

  /** Set a new height */
  	public void setHeight(double height) {
  		this.height = height;
  	}

  /** Return area */
  	public double getArea() {
  		return width * height;
  	}

  /** Return perimeter */
  	public double getPerimeter() {
  		return 2 * (width + height);
  	}

  	@Override
  	//Overridden comparator method
	public int compareTo(Rectangle o) {
  		if(this.width == o.getWidth() && this.height == o.getHeight()) {
  			return 0;
  		}
  		else {
  			return -1;
  		}
	}
  	
  	//Overridden equals method
  	public boolean equals(Object o) {
  		return this.compareTo((Rectangle)o) == 0;
  	}
}
