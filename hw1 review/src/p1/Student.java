package p1;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private Name name;
	private String ID; // unique
	private double gpa;
	
	
	public Student(String firstName, String lastName, String iD, double gpa) { // make name object more user friendly
		super();
		this.name = new Name (firstName, lastName);
		ID = iD;
		this.gpa = gpa;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}
	
	public void setName(String firstName, String lastName) { //overloaded method (Same name and return; different parameters/arguments)
		this.name = new Name(firstName, lastName);
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + ID + ", gpa=" + gpa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, gpa, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(ID, other.ID) && Double.doubleToLongBits(gpa) == Double.doubleToLongBits(other.gpa)
				&& Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Student o) {
		return this.name.getLastName().compareTo(o.name.getLastName());
		//return this.ID.compareTo(o.ID);
	}
	
	
	
	
	
	

}
