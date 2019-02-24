import java.util.Scanner;
public class weightedGrades
{
	public static void main(String[] args)
	{
		Grade set = new Grade();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in the first quiz score: ");
		double quiz1 = input.nextDouble();
		System.out.println("Enter in the second quiz score: ");
		double quiz2 = input.nextDouble();
		System.out.println("Enter in the third quiz score: ");
		double quiz3 = input.nextDouble();
		System.out.println("Enter in the midterm score: ");
		double midterm = input.nextDouble();
		System.out.println("Enter in the test score: ");
		double finalGrade = input.nextDouble();

		Record newGrade = new Record (quiz1, quiz2, quiz3);
		System.out.println();
		System.out.println(newGrade);

	}
}