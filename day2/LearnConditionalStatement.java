package week1.day2;

public class LearnConditionalStatement {

	public static void main(String[] args) {
		int age = 45;
		if (age >=18)
		{
			System.out.println("eligible");
		}
		else 
		{
			System.out.println("not eligible");
		}
		
		System.out.println("***********************");
		
		int mark = 35;
		
		if(mark>=80)
		{
			System.out.println("first class");
		} else if(mark >=60)
		{
			System.out.println("second class");

		}else if(mark >=35)
		{
			System.out.println("third class");

		} else
		{
			System.out.println("fail");
		}
		
		
		System.out.println("------------------------");
		
		String ticketType ="Balcony";
		//Balcoy, fc, sc
		
		switch (ticketType) {
		case "Balcony":
			System.out.println("Ticket cost Rs 200");
			break;
		case "fc":
			System.out.println("Ticket cost Rs 100");
			break;
		case "sc":
			System.out.println("Ticket cost Rs 50");
			break;
		default:
			System.out.println("select option");
			break;
		}
		
		
		
	}

}
