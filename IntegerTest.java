//Tests the functionality of the MyInteger class to ensure all functions work as intended.
public class IntegerTest {
	
	public static void main(String[] args){
		
		System.out.println("Value\tEven\tOdd\tPrime");
		System.out.println("-------------------------------");
		
		MyInteger int1 = new MyInteger(1);
		
		System.out.println("  " + int1.getValue() + "\t" + int1.isEven() + "\t" + int1.isOdd() + "\t" + int1.isPrime());
		
		int int2 = 2;
		
		System.out.println("  " + int2 + "\t" + MyInteger.isEven(int2) + "\t" + MyInteger.isOdd(int2) + "\t" + MyInteger.isPrime(int2));
		
		MyInteger int3 = new MyInteger(3);
		
		System.out.println("  " + int3.getValue() + "\t" + MyInteger.isEven(int3) + "\t" + MyInteger.isOdd(int3) + "\t" + MyInteger.isPrime(int3));
		
		System.out.println();
		
		System.out.println("Does the value in int1 equal 1? : " + int1.equals(1));
		System.out.println("Does the value in int1 equal the value in int3? : " + int1.equals(int3));
		
		char[] ch = {'1', '2', '3', '4', '5'};
		
		System.out.println(MyInteger.parseInt(ch));
		
		String s = "54321";
		
		System.out.println(MyInteger.parseInt(s));
	}

}
