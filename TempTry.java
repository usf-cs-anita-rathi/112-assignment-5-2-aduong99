public class Temp
{
	double degree;
	double temp;
	double fahTemp;
	double celTemp;
	String scale;

	public Temp (double temp)
	{
		degree = temp;
		scale = "C";
	}

	public Temp (double temp)
	{
		degree = temp;
		scale = "F";
	}

	public double fahTemp()
	{
		fahTemp = celTemp *5/9-32;
		return fahTemp;
	}

	public double celTemp()
	{
		celTemp = fahTemp +9/5+32;
		return celTemp;
	}

	public String toString()
	{
		return "Fahrenheit Temperature: " + fahTemp;
		return "Celsius Temperature: " + celTemp;
	}

	public void setTemp(double temp)
	{
		degree = temp;
	}

	public String setScale()
	{
		"F" = fahTemp;
		"C" = celTemp;
	}
}