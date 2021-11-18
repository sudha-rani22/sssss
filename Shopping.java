import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
 
public class Shopping {
 
	/**
	 * In this program you will replicate an online shopping
	 * cart. You will use the ArrayList class to hold the
	 * items in your shopping cart.
	 * You will use the CartItem class to represent items in
	 * your shopping cart.
	 * In this driver program you will do the following:
	 * Create the shopping cart object
	 * Offer a menu of options:
	 * 1 add an item to your cart
	 * 2 remove an item from your cart
	 * 3 view the items in your cart
	 * 4 end shopping and go to checkout
	 * 5 empty your cart
	 * 6 exit the program
	 * Use the Scanner class to collect input
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CartItem> shoppingCart = new ArrayList<CartItem>();
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> intList = new ArrayList<Integer>();
		boolean keepGoing = true;
		int choice = 0;
		int input = 0;
		int index=0;
		int total = 0;
		Integer item;
 
		while(keepGoing)
		{
			System.out.println("\nMenu - Managing a List");
			System.out.println("1 Add an item to your cart");
			System.out.println("2 Remove an item from your cart");
			System.out.println("3 View the items in your cart");
			System.out.println("4 Exit and add up the total");
			System.out.println("5 Empty your cart");
			System.out.println("6 Exit");
			System.out.println("Select a menu option");
			choice = scan.nextInt();
			if (choice <1 || choice >6)
			{
				System.out.println("Enter a value between 1 and 6:");
			}
			else
			{
				switch (choice)
				{
				case 1:
					//add an integer
					System.out.println("Enter an item:");
					input = scan.nextInt();
					item = new Integer(input);
					intList.add(item);
					//intList.add(input);
					break;
				case 2:
					//remove from the list
					System.out.println("Enter an item to remove:");
					input = scan.nextInt();
					item = new Integer(input);
					if (intList.contains(item))
					{
						intList.remove(item);
						System.out.println(item + " has been removed.");
					}
					else
					{
						System.out.println(item + " was not found in your shopping cart.");
					}
					break;
				case 3:
					//view the items in your cart
					System.out.println(intList);
					break;
				case 4:
					//Exit and add up the total
					for (int i = 0; i<intList.size(); i++)
					{
						item = intList.get(i);
						total = total + item.intValue();
					}
					System.out.println("Total is "+ total);
					System.out.println("Goodbye");
					keepGoing = false;
					break;
				case 5:
					//Empty the list
					intList.clear();
					break;
				case 6:
					//exit
					keepGoing = false;
					System.out.println("Goodbye");
					break;
 
				}
			}
		}
	}
}
public class CartItem {
	private String product;
	private int quantity;
	private double price;
 
	//constructor
	public CartItem()
	{
		product = "";
		quantity = 0;
		price = 0.0;
	}
	public String getProduct()
	{
	return product;
	}
	public double getPrice()
	{
	return price;
	}
	public int getQuantity()
	{
	return quantity;
	}
 
	//constructor with parameters
	public CartItem(String inProduct, int inQuant, double inPrice)
	{
		product = new String(inProduct);
		quantity = inQuant;
		price = inPrice;
	}
	//getter setter public methods for each instance data
	public boolean equals(CartItem item)
	{
		//write the code for the equals method
		//return true;
		boolean result = false;
		if (this.product.equalsIgnoreCase(item.getProduct()) && this.price == item.getPrice())
			result = true;
		else
			result = false;
 
		return result;
	}
 
	public String toString()
	{
		//write code for toString method
		String result="";
 
		return result;
	}
}
