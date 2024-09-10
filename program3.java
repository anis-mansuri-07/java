
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
		
		
		
	}
	public static boolean isOdd(long num){
		
		
		
	}
}



class program_3	
	public static void main(String[] args){
		
		long num = 12;
		utility ul = new utility();
		ul.isEven(num);
		ul.isOdd(num);
		ul.isPrime(num);
		ul.factorial(num);
		
		
		
	}
	
	
	
	
	
	
}
