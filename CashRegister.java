import java.util.ArrayList;

/**
   A simulated cash register that tracks the grocery items and
   the total amount due.
*/
public class CashRegister
{
   private ArrayList<GroceryItem> items;

   /**
      Constructs a cash register with cleared item totals
   */
   public CashRegister()
   {
      items = new ArrayList<GroceryItem>();
   }

   /**
      Adds an item to this cash register.
      @param GroceryItem instance
   */
   public void addItem(GroceryItem item)
   {
      items.add(item);
   }

   /**
      Gets the price of all items of the current sale.
      @return the total price
   */
   public double getTotal()
   {
      double total = 0.0;
      for (GroceryItem item : items)
      {
         total += item.getPrice();
      }
      return total;
   }

   /**
      Gets the number of items in the current sale.
      @return the item count
   */
   public int getNumItems()
   {
      return items.size();
   }

   /**
      Clears the items and the total.
   */
   public void clear()
   {
      items = new ArrayList<GroceryItem>();
   }

   /**
      Displays the items in the current sale.
   */
   public void displayAll()
   {
      for (int i = 0; i < items.size(); i++)
      {
         System.out.println(items.get(i).getDescription());
      }
   }
}
