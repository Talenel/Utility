
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.print(DateUtility.displayCalendar(12, 2017));
		//System.out.println(DateUtility.getLastDayOfMonth(5, 2017));
		System.out.println(DateUtility.toString(5, 1, 2017, "-"));
		System.out.println(DateUtility.isLeapYear(1900));
		for(int i=0; i<100;i++)
		{
			System.out.println(NumberUtility.getRandomBetween(2, 5));
		}
		System.out.println(NumberUtility.getPercent(.515));
		System.out.println(NumberUtility.getCurrency(125.734));
		System.out.println(NumberUtility.getSpecificDecimal(1005.456789, 3));

	}

}
