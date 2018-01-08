package RecurTwo;

public class RecursionPractice {

	int n = 0;
	/*
	public long  factorial(long n) {
	
		if (n == 1 || n == 0)
			return 0;
			
		else
			
			
		
	} */
	
	public void upAndDown(int n) {
		
		if (n >= 10)
			return;
		if (n < 1) {
			System.out.print(n);
		}
		if (n > 0) {
			System.out.print(n);
			upAndDown(n-1);
			System.out.print(n);
		}
		
	}
	
	public long fibonacci(int n) {
		
		if (n == 0) {
			System.out.print(", 0");
			return 0;
		}
		else if (n==1) {
			System.out.print(", 1");
			return 1;
		}
		else {
			long fn2 = fibonacci(n-2);
			long fn1 = fibonacci(n-1);
			System.out.print(", " + (fn1 + fn2));
			return fn1 + fn2;
		
		}
	}
	
	public int sumDigits(int n) {
		
		if (n < 10)
			return n;
		else 
			return n%10 + sumDigits(n/10);
		
		
	}
	
	public int count5(int n) {
		if (n < 10) {
			if (n == 5)
				return 1;
			else 
				return 0;
		}
		else {
			if (n % 10 == 5)
				return 1 + count5(n/10);
			else
				return count5(n/10);
		}
	}
	
	
	public static void main (String[] args) {
		RecursionPractice rp = new RecursionPractice();
	/*	for (int n - 1; n < 68; n++) {
		//	long x - (long)(Math.random() * 65);
			System.out.print("Factorial %d is );
			
		}
		
		
		for (int n = 1; n <5; n++) {
			System.out.print(rp.fibonacci(n));
		}
		
		for (int n =1; n <= 10; n++) {
			int x = (int)(Math.random() * 99);
			System.out.println("The sum of digits in " + x + ": are " + rp.sumDigits(x));
		}
		
		
		for (int n =1; n <= 10; n++) {
			int x = (int)(Math.random() * 35000);
			System.out.println("The number of 5's in " + x + ": are " + rp.count5(x));
		}
		*/
		rp.upAndDown(5);
	}
	
}
