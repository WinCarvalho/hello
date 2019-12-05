package com.util;

import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
	private int empID;
	private String empName;
	private float salary;

	public Employee(int empID, String empName, float salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public int hashCode() {

		return empID;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		Employee other = (Employee) obj;
		if (empID != other.empID)
			return false;

		else if (!empName.equals(other.empName))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee otherEmp) {
		// descending order
		int num = Integer.compare( otherEmp.empID , empID);
		System.out.println("comparing: "+ empID+":"+otherEmp.empID+":"+num);
		return num;
		// ascending orderiof emp

		// return Integer.compare(empID, otherEmp.empID);
	}
	
	static Comparator<Employee> NameComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee emp, Employee otherEmp) {
			return otherEmp.empName.compareTo(emp.empName);
		}
	};
	
	static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee emp, Employee otherEmp) {
			return Float.compare((emp.salary),otherEmp.salary);
		}
	};
}

public class Test_Comparable_Comparator {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "AMAR", 25000f);
		Employee e2 = new Employee(102, "AMA", 2500f);
		Employee e3 = new Employee(103, "AMR", 25050f);

		List<Employee> listemp = Arrays.asList(e1, e2, e3);// single line to add multiple values in list
		System.out.println("Before ID Sorting");
		listemp.forEach(System.out::println);// single line print
		// System.out.println(listemp);

		Collections.sort(listemp, Employee.NameComparator);
		System.out.println("After ID Sorting");
		listemp.forEach(System.out::println);// single line print
		
		Collections.sort(listemp, Employee.SalaryComparator);
		System.out.println("After ID Sorting");
		listemp.forEach(System.out::println);// single line print
		
		
		Collections.sort(listemp);
		System.out.println("After ID Sorting");
		listemp.forEach(System.out::println);// single line print
	}
}
