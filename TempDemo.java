public class TempDemo
{
	public static void main(String [] args) 
	{
		Temp temp1 = new Temp(2);
		double fahTemp;
		double celTemp;

		fahTemp = temp1.fahTemp();
		System.out.println("The Fahrenheit Temperature is: " + fahTemp);

		celTemp = temp1.celTemp();
		System.out.println("The Celsius Temperature is: " + celTemp);
	}
}