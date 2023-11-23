package question3;

import java.util.Arrays;
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
	return  salary == other.salary;
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

	public static void insertionSortForSalary(Employee[] arr,int N) {
	for(int i = 1 ; i < N ; i++) {
		int temp = arr[i].salary;
		int j;
		for(j = i-1 ; j >= 0 && arr[j].salary < temp ; j--) {
		arr[j+1].salary = arr[j].salary;
	}

	arr[j+1].salary = temp;
}
	}

	public static void main(String[] args) {
		Employee[] earr= {new Employee(5,"zoro",50000),
				new Employee(6,"luffy",6000),
				new Employee(1,"jinbei",8000),
				new Employee(9,"eren",8800),
				new Employee(7,"kakashi",56000)};
		
		for (Employee employee : earr) {
            System.out.println(employee.getName() + ": $" + employee.getSalary());
        }
	insertionSortForSalary(earr, earr.length);
	System.out.println("After Sort");
	for (Employee employee : earr) {
        System.out.println(employee.getName() + ": $" + employee.getSalary());
    }
	}
}