import java.util.Scanner;
public class Assignment {
	Scanner sc = new Scanner(System.in);
	
	//function to checkPalindrome
	public void checkPalindrome()  {
		System.out.println("Enter the number to check pallindrome : ");
		int num = sc.nextInt();
		int rev = num,sum=0,remainder;
		
		while(rev>0) {
			remainder = rev%10;
			sum = (sum*10)+remainder;
			rev = rev/10;
		}
		
		if(num == sum)
			System.out.println("Number is a pallindrome number");
		else
			System.out.println("Number is not a pallindrome number");
	}
	// function to print pattern
	public void printPattern() {
		System.out.println("Enter the no of rows for the Star Pattern : ");
		int num = sc.nextInt();
		if(num <= 0) {
			System.out.println("Please enter number greater than 0");
		}
		for(int i=num;i>=1;i--)
		{	
			int j=i;
			while(j>=1)
			{
				System.out.print("*");
				j--;
			}
			System.out.println();
		}
	}
	
	//function to check no is prime or not
	public void checkPrimeNumber() {
		System.out.println("Enter the number to check if Prime : ");
		int num = sc.nextInt();
		boolean flag =  false;
		for(int i=2;i<= num/2;i++)
		{
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		if(num == 1) 
			System.out.println(num + " is not prime nor a composite number");
		
		else if(flag == true || num<= 0) 
			System.out.println(num + " is not a prime number");
		
		else 
			System.out.println(num + " is a prime number");
		
	}
	
	// function to print Fibonacci Series
	public void printFibonacciSeries() {
		//initialize the first and second value as 0,1 respectively.
		int first = 0, second = 1;
		System.out.println("Enter no of terms in Fibonacci Series : ");
		int length = sc.nextInt();
		if(length > 0){
		System.out.println("Fibinocci Series : ");
		for (int i = 1; i <= length; ++i) {
		  System.out.print(first);
		  if(i != length)
			  System.out.print(",");
	      // compute the next term
	      int nextTerm = first + second;
	      first = second;
	      second = nextTerm;
			
		}
		}
		else
			System.out.println("Please enter terms greater than 0");
		
	}

	//main method which contains switch and do while loop
	public static void main(String[] args) {

        Assignment obj = new Assignment();

        int choice;

        Scanner sc = new Scanner(System.in);

		do {
		
		System.out.println("\n Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
		
		+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
		
		+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
		
		System.out.println();
		
		 
		
		choice = sc.nextInt();
		
		switch (choice) {
		
		 
		
		case 0:
		
		choice = 0;
		
		break;
		
		 
		
		case 1: {
		
		obj.checkPalindrome();
		
		}
		
		break;
		
		 
		
		case 2: {
		
		 
		
		obj.printPattern();
		
		}
		
		break;
		
		 
		
		case 3: {
		
		obj.checkPrimeNumber();
		
		}
		
		break;
		
		 
		
		case 4: {
		
		 
		
		obj.printFibonacciSeries();
		
		}
		
		break;
		
		 
		
		default:
		
		System.out.println("Invalid choice. Enter a valid no.\n");
		
		}
		
		 
		
		} while (choice != 0);
		
		System.out.println("Exited Successfully!!!");
		
		sc.close();
		
		}

 

}

