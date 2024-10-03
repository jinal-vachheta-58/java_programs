import java.util.Scanner;

class Convert{
	
	static float currenci;
	static void get_value()
	{
		Scanner curr = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		currenci = curr.nextFloat();
	}
	
	static void conversion()
	{
		Scanner choice = new Scanner(System.in);
		System.out.println("What type of currency do you have?");
			System.out.println("1 USD");
			System.out.println("2 EUR");
			System.out.println("3 JPY");
			System.out.println("4 INR");
			System.out.println("5 GBP");
		System.out.print("Enter Your Choice: ")	;
		int ans = choice.nextInt();	
		
		switch(ans)
		{
		//USD conversion
			case 1:
				System.out.println("In which currency you want to convert?");
				System.out.println("1 EUR");
				System.out.println("2 JPY");
				System.out.println("3 INR");
				System.out.println("4 GBP");
				Scanner value = new Scanner(System.in);
				System.out.print("enter your choice: ");
				int answer = value.nextInt();
				
				switch(answer)
				{
					case 1:
						double rate1 = 0.95;
						double euro = currenci*rate1;
						System.out.println("You have" + euro + "EURO");
						break;
						
					case 2:
						double rate2 = 143;
						double jpy = currenci*rate2;
						System.out.println("you have" + jpy + "JPY");
						break;
						
					case 3:
						double rate3 = 83.72;
						double inr = currenci*rate3;
						System.out.println("you have" + inr + "INR");
						break;
						
					case 4:
						double rate4 = 0.78;
						double gbp = currenci*rate4;
						System.out.println("you have" + gbp + "GBP");
						break;
						
					default:
						System.out.println("Enter valid choice");
				}
			break;
			
		//EUR conversion		
			case 2:
				System.out.println("In which currency you want to convert?");
				System.out.println("1 USD");
				System.out.println("2 JPY");
				System.out.println("3 INR");
				System.out.println("4 GBP");
				Scanner value1 = new Scanner(System.in);
				System.out.print("enter your choice: ");
				int answer1 = value1.nextInt();
				
				switch(answer1)
				{
					case 1:
						double rate1 = 1.09;
						double usd = currenci*rate1;
						System.out.println("You have" + usd + "USD");
						break;
						
					case 2:
						double rate2 = 166.5;
						double jpy = currenci*rate2;
						System.out.println("you have" + jpy + "JPY");
						break;
						
					case 3:
						double rate3 = 90.86;
						double inr = currenci*rate3;
						System.out.println("you have" + inr + "INR");
						break;
					case 4:
						double rate4 = 0.84;
						double gbp = currenci*rate4;
						System.out.println("you have" + gbp + "GBP");
						break;
					default:
						System.out.println("Enter valid choice");
				}
			break;
			
		//JYP conversion		
			case 3:
				System.out.println("In which currency you want to convert?");
				System.out.println("1 USD");
				System.out.println("2 EURO");
				System.out.println("3 INR");
				System.out.println("4 GBP");
				Scanner value2 = new Scanner(System.in);
				System.out.print("enter your choice: ");
				int answer2 = value2.nextInt();
				
				switch(answer2)
				{
					case 1:
						double rate1 = 0.0065;
						double usd = currenci*rate1;
						System.out.println("You have" + usd + "USD");
						break;
						
					case 2:
						double rate2 = 0.0060;
						double eur = currenci*rate2;
						System.out.println("you have" + eur + "EUR");
						break;
						
					case 3:
						double rate3 = 0.54;
						double inr = currenci*rate3;
						System.out.println("you have" + inr + "INR");
						break;
						
					case 4:
						double rate4 = 0.0051;
						double gbp = currenci*rate4;
						System.out.println("you have" + gbp + "GBP");
						break;
						
					default:
						System.out.println("Enter valid choice");
				}
			break;
			
		//INR conversion
		    case 4:
				System.out.println("In which currency you want to convert?");
				System.out.println("1 USD");
				System.out.println("2 EURO");
				System.out.println("3 JYP");
				System.out.println("4 GBP");
				Scanner value3 = new Scanner(System.in);
				System.out.print("enter your choice: ");
				int answer3 = value3.nextInt();
				
				switch(answer3)
				{
					case 1:
						double rate1 = 0.012;
						double usd = currenci*rate1;
						System.out.println("You have" + usd + "USD");
						break;
						
					case 2:
						double rate2 = 0.011;
						double eur = currenci*rate2;
						System.out.println("you have" + eur + "EUR");
						break;
						
					case 3:
						double rate3 = 1.84;
						double jyp = currenci*rate3;
						System.out.println("you have" + jyp + "JPY");
						break;
						
					case 4:
						double rate4 = 0.0093;
						double gbp = currenci*rate4;
						System.out.println("you have" + gbp + "GBP");
						break;
						
					default:
						System.out.println("Enter valid choice");
				}
			break;
		
		//GBP conversion
			case 5:
				System.out.println("In which currency you want to convert?");
				System.out.println("1 USD");
				System.out.println("2 EURO");
				System.out.println("3 JYP");
				System.out.println("4 INR");
				Scanner value4 = new Scanner(System.in);
				System.out.print("enter your choice: ");
				int answer4 = value4.nextInt();
				
				switch(answer4)
				{
					case 1:
						double rate1 = 1.29;
						double usd = currenci*rate1;
						System.out.println("You have" + usd + "USD");
						break;
						
					case 2:
						double rate2 = 1.19;
						double eur = currenci*rate2;
						System.out.println("you have" + eur + "EUR");
						break;
						
					case 3:
						double rate3 = 197.79;
						double jyp = currenci*rate3;
						System.out.println("you have" + jyp + "JPY");
						break;
						
					case 4:
						double rate4 = 107.17;
						double inr = currenci*rate4;
						System.out.println("you have" + inr + "INR");
						break;
						
					default:
						System.out.println("Enter valid choice");
				}
			break;
			
			default:
				System.out.println("Enter valid choice");
		}
	}
	
	public static void main(String args[])
	{
		get_value();
		conversion();
	}	
}