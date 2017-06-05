import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateUtility {
	
	
	
	
	public static String displayCalendar(int month, int year){
		
		LocalDate input = LocalDate.of(year, month, 1);
		Month bMonth= Month.of(month);
		StringBuilder sb= new StringBuilder("        "+bMonth.getDisplayName(TextStyle.FULL, Locale.ENGLISH)+" "+year+
				"\nSun Mon Tue Wed Thu Fri Sat\n");
		int counter =0;
		for(int i=0; i<input.getDayOfWeek().getValue(); i++)
		{
			if(input.getDayOfWeek().getValue()==7)
			{
				
			}
			else
			{
				counter++;
				sb.append("    ");
			}
		}
		for(int i=1; i<=(bMonth.length(input.isLeapYear())); i++)
		{
			if(counter%7==0)
			{
				sb.append("\n");
			}
			if(i<10)
			{
				sb.append(" "+i+"  ");
				counter++;
			}
			else
			{
				sb.append(i+"  ");
				counter++;
			}
			
		}
		sb.append("\n");
		
		return sb.toString();
	}
	public static int getLastDayOfMonth(int month, int year){
		
		
		Month bMonth= Month.of(month);
		return bMonth.length(isLeapYear(year));
				
		
	} 
	public static String toString(int month, int day, int year, String delimiter){
		
		return String.format("%02d%s%02d%s%04d",month,delimiter,day,delimiter,year);
		
		
	} //prints the date as mm/dd/yyyy
	public static boolean isLeapYear(int year){
		
		
		//returns t/f if the year is a leap year
		// leap years are all years divisible by 4 but not 100
		// years that are divisible by 400 are leap years, too
		// is it divisible by 4?
		// Note that the year is not passed as an argument. It could be but 
		// I choose to use the class level private variable for my method.
		boolean bLeapYear = false;
		bLeapYear = (year % 4 == 0);
		// is it divisible by 4 and not 100
		bLeapYear = bLeapYear && (year % 100 != 0);
		// is it divisible by 4 and not 100 unless it's divisible by 400
		bLeapYear = bLeapYear || (year % 400 == 0);
		return bLeapYear;
	}

}
