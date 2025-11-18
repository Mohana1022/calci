package calci;

import java.util.Scanner;

public class calciDriver {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			Calci calculator = new CalciImpl();
			
			System.out.println("Enter a value");
			int a = scanner.nextInt();
			System.out.println("Enter b value");
			int b = scanner.nextInt();
			System.out.println("Enter Operator type");
			System.out.println("1.Add");
			System.out.println("2.Sub");
			System.out.println("3.Mul");
			System.out.println("4.Div");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			
			boolean flag = true;
			while(true)
			{
				switch(choice)
				{
					case 1:
					{
						
					}break;
					
					case 2:
					{
						
					}break;
					
					case 3:
					{
						
					}break;
					
					case 4:
					{
						
					}break;
					
					default :
					{
						System.out.println("Invalid choice");
					}
				}
			}
		}
}
