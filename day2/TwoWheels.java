package week1.day2;

public class TwoWheels {
	
	int noOfWheels(int a) {
		return a;
		
	}
	short noOfMirrors(short b) {
		return b;
		
	}
	long chassisNumber(long c) {
		return c;
		
	}
	boolean isPunctured(boolean d) {
		return d;
		
	}
	 String bikeName (String e){
		return e;
		 
	 }
	double runningKM (double f) {
		return f;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheels obj = new TwoWheels();
		
		int wheels = obj.noOfWheels(2);
		System.out.println(wheels);
		
		short mirrors = obj.noOfMirrors((short) -6876);
		System.out.println(mirrors);
		
		long chassis = obj.chassisNumber(2345786543L);
		System.out.println(chassis);
		
		boolean puncture = obj.isPunctured(false);
		System.out.println(puncture);
		
		String bikename = obj.bikeName("Yamaha");
		System.out.println(bikename);
		
		double running = obj.runningKM(3456765.7654345678);
		System.out.println(running);

	}
	

}
