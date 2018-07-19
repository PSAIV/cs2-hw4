
public class MyInteger {
	//Fields
	private int value;
	
	//Value  constructor
	MyInteger(int v) {
		value = v;
	}
	
	//Value Getter
	public int getValue(){
		return value;
	}
	
	//Return true if this object's value is even
	public boolean isEven() {
		return isEven(value);
	}
	
	//Return true if this object's value is odd
	public boolean isOdd() {
		return isOdd(value);
	}
	
	//Return true if this object's value is prime
	public boolean isPrime() {
		return isPrime(value);
	}
	
	//Return true if the passed value is even.
	public static boolean isEven(int value) {
		if(value % 2 == 0 ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Return true if the passed value is odd.
	public static boolean isOdd(int value) {
		if(value % 2 == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Return true if the passed value is prime.
	public static boolean isPrime(int value) {
		if(value == 1){
			return false;
		}
		
		if(value == 2){
			return true;
		}
		
		else {
			for(int i = 2; i < value; i++){
				if(value % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	//Return true if the value of the passed object is even.
	public static boolean isEven(MyInteger i) {
		return isEven(i.getValue());
	}
	
	//Return true if the value of the passed object is odd.
	public static boolean isOdd(MyInteger i) {
		return isOdd(i.getValue());
	}
	
	//Return true if the value of the passed object is prime.
	public static boolean isPrime(MyInteger i) {
		return isPrime(i.getValue());
	}
	
	//Return true if the passed value is equal to this object's value
	public boolean equals(int val) {
		return this.value == val;
	}
	
	//Return true if the passed object's value is equal to this object's value
	public boolean equals(MyInteger i) {
		return this.value == i.value;
	}
	
	//Returns an integer converted from a character array
	
	public static int parseInt(char[] ch) {
		int length = ch.length;
		int placeMulti = 1;
		int result = 0;
		
		for(int i = length - 1; i > 0; i--){
			placeMulti *= 10;
		}
		
		for(int i = 0; i < length; i++) {
			result += Character.getNumericValue(ch[i]) * placeMulti;
			placeMulti /= 10;
		}
		
		return result;
	}
	
	//Returns an integer converted from a string
	public static int parseInt(String s) {
		return parseInt(s.toCharArray());
		
	}
}
