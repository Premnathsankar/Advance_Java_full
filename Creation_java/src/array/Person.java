package array;

public class Person {
	
	private int id;
	private String name;
	private String subject;	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
	
}
