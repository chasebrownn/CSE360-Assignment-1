package cse360assignment02;

public class Tester {
	
	public static void main(String[] args)
	{
		int total;
		
		AddingMachine Calculator = new AddingMachine();
		
		System.out.println("Test");
		
		Calculator.add(4); 
		Calculator.subtract(2); 
		Calculator.add(5);
		
		total = Calculator.getTotal();
		System.out.println(total);
	}

}
