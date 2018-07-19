
public class HW4_13_10 {
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(1, 1);
		Rectangle rect2 = new Rectangle(1, 1, "red", true);
		
		System.out.println("A rectangle " + rect1.toString());
		System.out.println("With area " + rect1.getArea() + " and perimeter " + rect1.getPerimeter() + "\n");
		
		System.out.println("A rectangle " + rect2.toString());
		System.out.println("With area " + rect1.getArea() + " and perimeter " + rect2.getPerimeter() + "\n");
		
		if(rect1.equals(rect2)) {
			System.out.println("The rectangles have equal sides");
		}
		else {
			System.out.println("The rectangles are not equal");
		}
	}

}
