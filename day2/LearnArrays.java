package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		String[] names ={"Arun","Tamil","Chandru","Padma","Manon"};
		int[] numbers = {12,8,6,4,45,75,88};
		int length = numbers.length;
		System.out.println(length);
		System.out.println(names[length-1]);
		for (int i=0;i<length;i++)
			System.out.println(names[i]);
		
		Arrays.sort(names);
		
		System.out.println("----------------");
		
		String[] employees = new String[6];
		employees[0]="swetha";
		employees[1]="Mohan";
		employees[2]="Kavitha";
		
	}
}
	
