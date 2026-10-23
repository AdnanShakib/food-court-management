import java.lang.*;
import fileio.*;
import classes.*;
import java.util.*;


public class Start
{
	public static void main(String args[])
	{
		FoodCourt foodCourt = new FoodCourt();
		FoodItem.perTradeLimit = 8000.0;
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in); 
		boolean repeat = true;
		
		System.out.println("-------------------");
		System.out.println("Welcome to Ocean Blue Food Court");
		System.out.println("-------------------");
		
		while(repeat)
		{
			System.out.println("What do you want to chose?\n");
			System.out.println("1. Employee Management");
			System.out.println("2. Restaurant Management");
			System.out.println("3. Restaurant FoodItem Management");
			System.out.println("4. FoodItem Quantity Add-Sell");
			System.out.println("5. Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
						switch(choice)
			{
				case 1:
					
					System.out.println("***********************************");
					System.out.println("Your Choice is: Employee Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Search an Employee");
					System.out.println("3. Remove Existing Employee");
					System.out.println("4. Show All Employees");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					
				switch(option1)
					{
						case 1: 
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Employee");
							System.out.println("***********************************");
							
							System.out.print("Enter EmpId: ");
							String empId1 = sc.next();
							System.out.print("Enter Name: ");
							String name1 = sc.next();
							System.out.print("Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(foodCourt.insertEmployee(e1)){System.out.println("Employee Inserted..... ID: "+e1.getEmpId());}
							else{System.out.println("Oops.... Something is Wrong....");}
							
							System.out.println();
							break;

						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Search an Employee");
							System.out.println("***********************************");
							
							System.out.print("Enter EmpId: ");
							String empId2 = sc.next();
							
							Employee e2 = foodCourt.searchEmployee(empId2);
							
							if(e2 != null)
							{
								System.out.println("Employee Found.......");
								System.out.println("Employee ID: "+e2.getEmpId());
								System.out.println("Employee Name: "+e2.getName());
								System.out.println("Employee Salary: "+e2.getSalary());
								System.out.println();
							}
							else{System.out.println("No Such Employee Found....");}
								
							System.out.println();
							break;

						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove an existing Employee");
							System.out.println("***********************************");
							
							System.out.print("Enter EmpId: ");
							String empId3 = sc.next();
							
							Employee e3 = foodCourt.searchEmployee(empId3);
							
							if(e3 != null)
							{
								if(foodCourt.removeEmployee(e3)){System.out.println("Employee Removed.... ID: "+e3.getEmpId());}
								else{System.out.println("Oops.... Something is wrong...");}
							}
							else{System.out.println("No employee found to remove");}
							
							System.out.println();
							break;

						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Employees");
							System.out.println("***********************************");
							
							foodCourt.showAllEmployees();
							
							System.out.println();
							break;

						case 5:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back.......");
							System.out.println("***********************************");
							
							System.out.println();
							break;

						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
					}
					
					System.out.println();
					break;

				case 2:
					
					System.out.println("***********************************");
					System.out.println("Your Choice is: Restaurant Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Restaurant");
					System.out.println("2. Search a Restaurant");
					System.out.println("3. Remove Existing Restaurant");
					System.out.println("4. Show All Restaurants");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();	

					switch(option2)
					{
						case 1: 
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Customer");
							System.out.println("***********************************");
							
							System.out.print("Enter Restaurant ID: ");
							String rid1 = sc.next();
							System.out.print("Enter Restaurant Name: ");
							String name1 = sc.next();
							
							Restaurant r1 = new Restaurant();
							r1.setRid(rid1);
							r1.setName(name1);
							
							if(foodCourt.insertRestaurant(r1)){System.out.println("Restaurant Inserted..... RID: "+r1.getRid());}
							else{System.out.println("Oops..... Something is Worng....");}
							
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Search a Restaurant");
							System.out.println("***********************************");
							System.out.print("Enter Restaurant Id: ");
							String rid2 = sc.next();
							
							Restaurant r2 = foodCourt.searchRestaurant(rid2);
							
							if(r2 != null)
							{
								System.out.println("Restaurant Found.......");
								System.out.println("Restaurant ID: "+r2.getRid());
								System.out.println("Restaurant Name: "+r2.getName());
								System.out.println();
							}
							else{System.out.println("No Such Restaurant Found....");}
							
						
							System.out.println();
							break;
							
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove an existing Restaurant");
							System.out.println("***********************************");
							System.out.print("Enter Restaurant Id: ");
							String rid3 = sc.next();
							
							Restaurant r3 = foodCourt.searchRestaurant(rid3);
							
							if(r3 != null)
							{
								if(foodCourt.removeRestaurant(r3)){System.out.println("Restaurant Removed.... ID: "+r3.getRid());}
								else{System.out.println("Oops.... Something is wrong...");}
							}
							else{System.out.println("No restaurant found to remove");}
							
							
							
							System.out.println();
							break;

						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Restaurants");
							System.out.println("***********************************");
							
							foodCourt.showAllRestaurants();
							
							System.out.println();
							break;
						
						case 5:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back.......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
						
					}
					
					System.out.println();
					break;

				case 3:
				
					System.out.println("***********************************");
					System.out.println("Your Choice is: Restaurant FoodItem Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New FoodItem");
					System.out.println("2. Search a FoodItem");
					System.out.println("3. Remove Existing FoodItem");
					System.out.println("4. Show All FoodItem");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();	

					switch(option3)
					{
						case 1: 
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New FoodItem");
							System.out.println("***********************************");
							
							System.out.println("There are two Types of FoodItem: ");
							System.out.println("1. Main Dish");
							System.out.println("2. Appetizers");
							System.out.println("3. Go Back");
							
							System.out.print("Enter Your Type: ");
							int type = sc.nextInt();
							
							FoodItem fi = null;		
							
							if(type == 1)
							{
								System.out.println("***********************************");
								System.out.println("Your Type is: Main Dish");
								System.out.println("***********************************");
							
							    System.out.println("Enter Food ID: ");
	                            String fio = sc.next();
								System.out.println("Enter Food Name: ");
								String fon = sc.next();
	                            System.out.println("Enter Available Quantity: ");
								int avq = sc.nextInt();
	                            System.out.println("Enter Price: ");
								double pr = sc.nextDouble();
								System.out.println("Enter Catagory: ");
								String cat = sc.next();
								
								MainDish md = new MainDish(fio, fon, avq, pr, cat);
								
								fi = md;
							}
							else if(type == 2)
							{
								System.out.println("***********************************");
								System.out.println("Your Type is: Appetizers");
								System.out.println("***********************************");
							
							    System.out.println("Enter Food ID: ");
	                            String fio = sc.next();
								System.out.println("Enter Food Name: ");
								String fon = sc.next();
	                            System.out.println("Enter Available Quantity: ");
								int avq = sc.nextInt();
	                            System.out.println("Enter Price: ");
								double pr = sc.nextDouble();
								System.out.println("Enter Size: ");
								String siz = sc.next();
								
								Appetizers ap = new Appetizers(fio, fon, avq, pr, siz);
								
								fi = ap;
							}
							else if(type == 3)
							{
								System.out.println("***********************************");
								System.out.println("Going Back........");
								System.out.println("***********************************");
							}
							else
							{
								System.out.println("***********************************");
								System.out.println("Invalid Type........");
								System.out.println("***********************************");
							}
							
							if (fi != null)
							{
								System.out.print("Enter Restaurant RID: ");
								String rid = sc.next();
								
								Restaurant r = foodCourt.searchRestaurant(rid);
								
								if(r != null)
								{
									if(r.insertFoodItem(fi)){System.out.println("FoodItem Inserted.... "+ fi.getFid() + " for "+ r.getRid());}
									else{System.out.println("Oops.... Something is Wrong......");}
								}
								else{System.out.println("Oops.... Something is Wrong......");}
							}
						
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Search a FoodItem");
							System.out.println("***********************************");
							System.out.print("Enter Food Id: ");
							String fid2 = sc.next();
							
							FoodItem f2 = restaurant.searchFoodItem(fid2);
							
							if(f2 != null)
							{
								System.out.println("Food Item Found.......");
								System.out.println("Food ID: "+f2.getFid());
								System.out.println("Food Name: "+f2.getName());
								System.out.println("Price : "+f2.getPrice());
								System.out.println("Available Quantity : "+f2.getAvailableQuantity());
								System.out.println();
							}
							else{System.out.println("No Such Food Found....");}
							
							
							System.out.println();
							break;
							
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove Existing FoodItem");
							System.out.println("***********************************");
							System.out.print("Enter Food Id: ");
							String fid3 = sc.next();
							
							FoodItem f3 = restaurant.searchFoodItem(fid3);
							
							if(f3 != null)
							{
								if(restaurant.removeFoodItem(f3)){System.out.println("Restaurant Removed.... ID: "+f3.getFid());}
								else{System.out.println("Oops.... Something is wrong...");}
							}
							else{System.out.println("No Food Item found to remove");}
							
							
							
							System.out.println();
							break;
							
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All FoodItems");
							System.out.println("***********************************");
							
							System.out.print("Enter Restaurant RID: ");
							String rid4 = sc.next();
							
							Restaurant r4 = foodCourt.searchRestaurant(rid4);
							
							if(r4 != null)
							{
								r4.showAllFoodItems();
							}
							else{System.out.println("Oops...... Something is Wrong.......");}
							
							System.out.println();
							break;
							
						case 5:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back.......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
						
					}
					
					System.out.println();
					break;

				case 4:
				
					System.out.println("***********************************");
					System.out.println("Your Choice is: FoodItem Quantity Add-Sell");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Add FoodItem");
					System.out.println("2. Sell FoodItem");
					System.out.println("3. Show Add-Sell History");
					System.out.println("4. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();

				    System.out.print("Enter your option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1: 
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Add FoodItem");
							System.out.println("***********************************");	
							
							System.out.print("Enter RID: ");
							String rid1 = sc.next();
							
							Restaurant r1 = foodCourt.searchRestaurant(rid1);
							
							if(r1 != null)
							{
								System.out.print("Enter Food ID: ");
								String fio = sc.next();
								
								FoodItem fi = r1.searchFoodItem(fio);
								
								if(fi != null)
								{
									System.out.print("Enter Amount: ");
									int am = sc.nextInt();
									System.out.println("Current Available Quantity: " + fi.getAvailableQuantity());
									if(fi.addQuantity(am))
									{
										System.out.println("Adding Amount: "+ am + "     Successfull");
										System.out.println("New Available Quantity: "+fi.getAvailableQuantity());
										frwd.writeInFile("Add: "+am+" in "+fi.getFid());
										
									}
									else
									{
										System.out.println("Oops... Something is Wrong....");
									}
								}
								
							}
							
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Sell FoodItem");
							System.out.println("***********************************");
							
							System.out.print("Enter RID: ");
							String rid2 = sc.next();
							
							Restaurant r2 = foodCourt.searchRestaurant(rid2);
							
							if(r2 != null)
							{
								System.out.print("Enter Food ID: ");
								String fio = sc.next();
								
								FoodItem fi = r2.searchFoodItem(fio);
								
								if(fi != null)
								{
									System.out.print("Enter Amount: ");
									int am = sc.nextInt();
									System.out.println("Current Available Quantity: " + fi.getAvailableQuantity());
									if(fi.sellQuantity(am))
									{
										System.out.println("Selling Amount: "+ am + "     Successfull");
										System.out.println("New Available Quantity: "+fi.getAvailableQuantity());
										frwd.writeInFile("Sell: "+am+" from "+fi.getFid());
										
									}
									else
									{
										System.out.println("Oops... Something is Wrong....");
									}
								}
								
							}
							
							System.out.println();
							break;
							
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Tradings");
							System.out.println("***********************************");
							
							frwd.readFromFile();
							
							System.out.println();
							break;
							
						
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back.......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
					}
					
					System.out.println();
					break;
				
				case 5:
				
					repeat = false;
					System.out.println("******************************");
					System.out.println("Thank you for using our System");
					System.out.println("******************************");
					
					System.out.println();
					break;
					
				default:
				
					System.out.println("******************************");
					System.out.println("Invalid Choice.....");
					System.out.println("******************************");
					
					System.out.println();
					break;
			}
		}
	}
}
					
							
							
							
							
							
							
							
							
							