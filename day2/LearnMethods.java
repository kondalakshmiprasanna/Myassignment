package week1.day2;

public class LearnMethods {
	
	int a=5; //global variable
	public static void  main(String[] args)

	{
		LearnMethods obj = new LearnMethods();
		obj.printMyName();
		int sum = obj.addTwoNumbers(10, 20);
		System.out.println(sum);
		String nameoutput = obj.getMyName(); 
		System.out.println(nameoutput);
		
	} 
	public void printMyName()
	{
		System.out.println("TestLeaf");
	}
	
	private String getMyName()
	{
		String name = "TestLeaf"; // local variable
		return name;
	}
	
	 int addTwoNumbers(int num1, int num2)
	{
		int sum = num1+num2;
		return sum;
	}
	
	
}

