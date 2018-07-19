import java.util.*;

public class HW4_13_4 {
	
	public static void main(String[] args) {
		
		Calendar calendar = new GregorianCalendar(Integer.valueOf(args[1]), Integer.valueOf(args[0]) - 1, 1);
		
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		for (int i = 0; i < 10; i ++) {
			System.out.print(" ");
		}
		
		System.out.println(months[calendar.get(Calendar.MONTH)] + ", " + calendar.get(Calendar.YEAR));
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		
		for(int i = 1; i < calendar.get(Calendar.DAY_OF_MONTH); i++) {
			System.out.print("     ");
		}
		
		for(int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++){
			System.out.print("    ");
		}
		
		while (calendar.get(Calendar.DATE) < calendar.getActualMaximum(Calendar.DATE)) {
			if(calendar.get(Calendar.DAY_OF_WEEK) == 7) {
				System.out.printf("%4d\n", calendar.get(Calendar.DATE));
			}
			else {
				System.out.printf("%4d", calendar.get(Calendar.DATE));
			}
			
			calendar.add(Calendar.DATE, 1);
		}
		
		System.out.printf("%4d\n", calendar.get(Calendar.DATE));
	}

}