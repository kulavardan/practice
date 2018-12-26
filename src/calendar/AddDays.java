package calendar;
import java.util.Calendar;

public class AddDays {

	public static void main(String[] args){
		Calendar now = Calendar.getInstance();
		System.out.println("Current time: "+ (now.get(Calendar.MONTH)+1) + "-" + (now.get(Calendar.DATE)) + "-" + (now.get(Calendar.YEAR)) );
	
		now.add(Calendar.MONTH,2);
		System.out.println("Time + 2 months: "+ (now.get(Calendar.MONTH)+1) + "-" + (now.get(Calendar.DATE)) + "-" + (now.get(Calendar.YEAR)) );
	
	}
}
