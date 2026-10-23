package classes;

import java.lang.*;

public class Appetizers extends FoodItem
{
	private String size;
	
	public Appetizers()
	{
		super();
		System.out.println("E-A");
	}
	public Appetizers(String fid, String name, int availableQuantity, double price, String size)
	{
		super(fid, name, availableQuantity, price);
		this.size = size;
		System.out.println("P-A");
	}


public void setSize(String size)
{
	this.size = size;
}
public String getSize()
{
	return size;
}


public void showInfo()
    {
	    System.out.println("Food ID: "+fid);
	    System.out.println("Food Name: "+name);
	    System.out.println("Available Quantity: "+availableQuantity);
	    System.out.println("Per Trade Limit: "+perTradeLimit);
	    System.out.println("Size: "+size);
    }	
}