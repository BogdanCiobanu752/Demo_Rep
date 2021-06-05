package automation.oop1;

public class Teacher extends Person {

	private double salary;
	private String subjectMatter;
	private byte yearsOfexperience;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSubjectMatter() {
		return subjectMatter;
	}

	public void setSubjectMatter(String subjectMatter) {
		this.subjectMatter = subjectMatter;
	}

	public byte getYearsOfexperience() {
		return yearsOfexperience;
	}

	public void setYearsOfexperience(byte yearsOfexperience) {
		this.yearsOfexperience = yearsOfexperience;
	}

}
