package cse360assignment02;

public class AddingMachine {
	private int total;
	private String stringTotal;

	  
	  public AddingMachine ()
	  {
		  total = 0;  // not needed - included for clarity
	  }
	  
	  public int getTotal ()
	  {
		  return total;
	  }
	  
	  public void add (int value)
	  {
		  total = total + value;
		  stringTotal += " " + "+" + " " + value;
	  }

	  public void subtract (int value)
	  {
		  total = total - value;
		  stringTotal += " - " + value;
	  }

	  public String toString ()
	  {
		  return stringTotal;
	  }

	  public void clear()
	  {
		  total = 0;
		  stringTotal = "";
	  }
}
