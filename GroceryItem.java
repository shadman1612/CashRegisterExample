public class GroceryItem 
{
  private String label;
  private double price;
  
  
  public GroceryItem()
  {
	  label = "";
	  price = 0.0;
  }
  
  public GroceryItem(String label, double price)
  {
	  this.label = label;
	  this.price = price;
  }
  
  public double getPrice()
  {
	  return price;
	  
  }
  
  public String getDescription()
  {
	  return label + ": " + price + "$";
  }
}
