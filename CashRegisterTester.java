public class CashRegisterTester 
{
  public static void main( String[] args)
  {
	  CashRegister register = new CashRegister();
	  
	  // add some items to the cash register
	  GroceryItem bananas = new GroceryItem("Bananas", 4.0);
	  register.addItem(bananas);
	  
	  GroceryItem apples = new GroceryItem("Apples", 3.25);
	  register.addItem(apples);
	  
	  GroceryItem milk = new GroceryItem("Milk", 4.99);
	  register.addItem(milk);
	  
	  register.displayAll();
	  
	  System.out.println("Total = " + register.getTotal() + "$");
	  
	  
  }
}