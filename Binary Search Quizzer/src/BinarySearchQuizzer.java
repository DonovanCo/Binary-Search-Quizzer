import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class BinarySearchQuizzer
	{
	
	public static void quizzer()
		{
		Scanner filler = new Scanner(System.in);
		System.out.println("Enter a list of numbers between 1 and 20. Enter -1 when you wish to stop.");
		ArrayList elements = new ArrayList();
		
		do
			{
			int a = filler.nextInt();
			if((a>=1&&a<=20))
				{
				elements.add(a);
				}
			else if(a==-1)
				{
				break;
				}
			else
				{
				System.out.println("That is not valid. Enter another number.");
				}
			
			}
		while(true);
		
		Collections.sort(elements);
		
		for(Object x : elements)
			{
			System.out.print(x+" ");
			}
		System.out.println("");
		
		int ran = (int)(Math.random()*(elements.size()));
		int target =
		}


	public static void main(String[] args)
		{
		quizzer();

		}

	}
