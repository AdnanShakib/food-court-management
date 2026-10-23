package classes;
import java.lang.*;

public class Employee
{
	private String name;
	private String empId;
	private double salary;
	
	public Employee()
	{
		System.out.println("empty Employee");
	}
	public Employee(String name, String empId, double salary)
	{
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setEmpId(String empId)
	{
		this.empId = empId;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public String getName()
	{
		return name;
	}
	public String getEmpId()
	{
		return empId;
	}
	public double getSalary()
	{
		return salary;
	}
}