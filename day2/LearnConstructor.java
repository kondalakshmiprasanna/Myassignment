package week1.day2;

public class LearnConstructor {
	
	public LearnConstructor()
	{
		System.out.println("This is from a constructor");
	}
	

	public LearnConstructor(String name)
	{
		System.out.println("This is from a constructor"+name);
	}

	public static void main(String[] args) 
	{
		LearnConstructor obj = new LearnConstructor();
		
		System.out.println(obj);

	}

}
