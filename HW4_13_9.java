
public class HW4_13_9 {
	
  public static void main(String[] args) {
    Circle circle = new Circle(1);
    System.out.println("A circle " + circle.toString());
    System.out.println("With radius " + circle.getRadius() + "\n");
    Circle circle2 = new Circle(1, "blue", false);
    System.out.println("A circle " + circle2.toString());
    System.out.println("With radius " + circle2.getRadius() + "\n");

    
    
    if(circle.equals(circle2)){
    	System.out.println("Both circles have the same radius");
    }
    else {
    	System.out.println("The circles are not equal");
    }
  }
}
