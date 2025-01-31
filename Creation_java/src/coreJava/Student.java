package coreJava;

public class Student {
	int id;
	String name;
	char grade;
	int mark;
	
	public Student(int id, String name, char grade, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", mark=" + mark + "]";
	}
	
	
	
}
