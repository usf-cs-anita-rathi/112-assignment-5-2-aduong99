//import java.util.Scanner;
public class Grade
{
	public class Record
	{
		private double quiz1;
		private double quiz2;
		private double quiz3;
		private double midterm;
		private double finalGrade;

		public String toString()
		{
			double grade = finalWeightedGrade();
			//return ("Student Record: ")
		}

		public void record()
		{
			quiz1 = 0;
			quiz2 = 0;
			quiz3 = 0;
			midterm = 0;
			finalGrade = 0;
		}

		public record()
		{
			if(quiz1 > 100 || quiz1 < 0)
			{
				System.out.println("Invalid quiz score: must be out of 100");
				System.exit(0);
			}
			else if (quiz2 > 100 || quiz2 < 0)
			{
				System.out.println("Invalid quiz score: must be out of 100");
				System.exit(0);
			}
			else if (quiz3 > 100 || quiz3 < 0)
			{
				System.out.println("Invalid quiz score: must be out of 100");
				System.exit(0);
			}
			else if(midterm > 100)
			{
				System.out.println("Invalid quiz score: must be out of 100");
				System.exit(0);
			}
			else if(finalGrade > 100)
			{
				System.out.println("Invalid quiz score: must be out of 100");
				System.exit(0);
			}
		}

		public double getQuizGrade()
		{
			return((quiz1 + quiz2 + quiz3)/3) * 0.25;
		}

		public double getMidterm()
		{
			return midtem * 0.35;
		}

		public double getFinalGrade()
		{
			return exam * 0.4;
		}

		public double finalWeightedGrade()
		{
			return getQuizGrade() + getMidterm() + getFinalGrade();
		}

		pubilc String letterGrade(double grade)
		{
			if (grade >=90)
			{
				return "A";
			}
			else if (grade >=80)
			{
				return "B";
			}
			else if (grade >=70)
			{
				return "C";
			}
			else if (grade >=60)
			{
				return "D";
			}
			else
			{
				return "F";
			}
		}
	}
}