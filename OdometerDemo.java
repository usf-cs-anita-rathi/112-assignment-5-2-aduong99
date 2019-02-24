import java.util.Scanner;
public class OdometerDemo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		OdometerTry car1 = new OdometerTry();
		boolean tryAgain = true;
		System.out.println(" Car #1: ");
		car1.efficiency();

		while (tryAgain == true)
		{
			car1.mileage();
			car1.gallons();
			car1.vehicleInfo();
			car1.reset();
			System.out.println("Would you like to go on another trip? ");
			String newTrip = input.next();
			if (newTrip.equals("yes"))
				tryAgain = true;
			else if (newTrip.equals("no"))
				System.exit(0);
			else
				System.out.println("Invalid input.")
		}
	}
}