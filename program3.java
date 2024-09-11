
class utility{
	
	public static long factorial(long num){
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		
		return fact;
		
	}
	public static boolean isPrime(long num){
		boolean a;
		
		for(int i=2;i<=(num/2)+1;i++){
			if(num%i==0){
			return false;
			}
		
		return true;
		
	}
	public static boolean isEven(long num){
		
		
			if(num%2==0){
			return true;
			}
			return false;
		
	}
	public static boolean isOdd(long num){
		
		if(num%2==0){
			return false;
			}
			return true;
		
	}
}



class program_3	{
	public static void main(String[] args){
		
		long num = 12;
		utility ul = new utility();
		boolean Even =ul.isEven(num);
		System.out.println("Is Even : "+Even);
		
		boolean Odd =ul.isOdd(num);
		System.out.println("Is Odd: "+Odd);
		
		boolean Prime =ul.isPrime(num);
		System.out.println("Is Prime: "+Prime);
		
		//boolean Even =ul.isEven(num);
		//System.out.println(Even);
		
		
		long fac = ul.factorial(num);
		system.out.println("Fact = "+fac);
		
		
		
	}
	
	
	
	
	
	
}
