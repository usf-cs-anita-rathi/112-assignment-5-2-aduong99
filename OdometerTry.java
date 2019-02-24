public class OdometerTry
{
	private double fuel;
	private double mileage;
	private double efficiency;
	private double gallons;

	public void reset()
	{
		Scanner input = new Scanner(System.out.println);
		System.out.println("Would you like to reset your odometer?: ");
		String response = input.next();
		if (response.equals("yes"))
		{
			odometer = 0;
		}
		else
		{
			odometer = odometer;
			System.out.println("Odometer: " + odometer);
		}
	}

	public void mileage()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter miles driver: ");
		mileage = input.nextDouble();
		odometer += mileage;
	}

	public void efficiency()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your vehicle's feul efficiency? ");
		efficiency = input.nextDouble()

	}

	public void gallons()
	{
		Scanner input = new Scanner(System.in);
		gallons = odometer/efficiency;
	}

	public void vehicleInfo()
	{
		System.out.println("Mileage: " + mileage);
		System.out.println("Updated odometer: " + odometer);
		System.out.println("Gallons used since last odometer reset: " + gallons);
]	}
}