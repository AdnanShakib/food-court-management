package classes;

import java.lang.*;

public class MainDish extends FoodItem
{
	private String catagory;
	
	public MainDish()
	{
		super();
		System.out.println("E-MD");
	}
	public MainDish(String fid, String name, int availableQuantity, double price, String catagory)
	{
		super(fid, name, availableQuantity, price);
		this.catagory = catagory;
		System.out.println("P-MD");
	}


public void setCatagory(String Catagory)
{
	this.catagory = catagory;
}
public String getCatagory()
{
	return catagory;
}


public void showInfo()
    {
	    System.out.println("Food ID: "+fid);
	    System.out.println("Food Name: "+name);
	    System.out.println("Available Quantity: "+availableQuantity);
	    System.out.println("Per Trade Limit: "+price);
	    System.out.println("Catagory: "+catagory);
    }	
}