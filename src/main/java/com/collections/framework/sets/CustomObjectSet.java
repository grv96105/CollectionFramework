package com.collections.framework.sets;

import java.util.HashSet;
import java.util.Set;

//POJO

class Employee {

	int empId;
	String name;

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=");
		builder.append(empId);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
}

public class CustomObjectSet {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Gaurav");
		Employee e2 = new Employee(1, "Gaurav");
		Employee e3 = new Employee(2, "Sakshi");

		// HashCode and equals method should have to be override for Custom Object Sets
		// Set of Custom Object or Set of Employee
		Set<Employee> employees = new HashSet<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);

		System.out.println("Employees :" + employees);
	}

}
