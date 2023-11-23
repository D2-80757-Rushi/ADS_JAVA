package question4;

import java.util.Objects;

public class Employee {
int empid;
String name;
int salary;
	@Override
	public int hashCode() {
		return Objects.hash(empid, name, salary);
	}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Employee))
		return false;
	Employee other = (Employee) obj;
	return empid == other.empid && Objects.equals(name, other.name) && salary == other.salary;
}
	@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Employee [empid=");
	builder.append(empid);
	builder.append(", name=");
	builder.append(name);
	builder.append(", salary=");
	builder.append(salary);
	builder.append("]");
	return builder.toString();
}
	public Employee(int empid, String name, int salary) {
	super();
	this.empid = empid;
	this.name = name;
	this.salary = salary;
}
	public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
	public Employee() {
	}

	public static int LinearSearchForID(Employee[] e,int key)
	{
	for(int i=e.length-1;i>=0;i--)
	{
		if(e[i].empid==key)
			return i;
	}
	return -1;
	}
	
	public static int LinearSearchForname(Employee[] e,String key)
	{
	for(int i=0;i<e.length-1;i++)
	{
		if(e[i].getName().equals(key))
			return i;
	}
	return -1;
	}
	
	public static int LinearSearchForSalary(Employee[] e,int key)
	{
	for(int i=e.length-1;i>=0;i--)
	{
		if(e[i].salary==key)
			return i;
	}
	return -1;
	}
	

	public static void main(String[] args) {
		Employee[] earr= {new Employee(5,"zoro",50000),new Employee(6,"luffy",6000),new Employee(1,"jinbei",8000),new Employee(9,"eren",8800),new Employee(7,"kakashi",56000)};
	//int index=LinearSearchForID(earr, 6);
	int index=LinearSearchForname(earr, "jinbei");
	//int index=LinearSearchForSalary(earr, 8800);
	if(index==-1)
		System.out.println("Not found");
	else 
		System.out.println("Element found at index :"+ index);
	}
}
