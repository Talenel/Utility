import java.text.NumberFormat;
import java.util.Random;

public class NumberUtility {
	
	
	public static String getPercent(double pct)
	{
		NumberFormat percent = NumberFormat.getPercentInstance();
		return percent.format(pct);
	}
	
	public static String getCurrency(double money)
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(money);
		
	}
	
	public static String getSpecificDecimal(double num, int numDec)
	{
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(numDec);
		return number.format(num);
	}
	
	public static int getRandomBetween(int min, int max)
	{
		Random r = new Random();
		return min+r.nextInt(max-min+1);
		
		
	}
	public static int max(int num1, int num2)
	{
		return Math.max(num1, num2);
	}
	public static int min(int num1, int num2)
	{
		return Math.min(num1, num2);
	}

}
