package coreJava;
import java.util.*;
public class SortStudentByIdAsc implements Comparator<Student>{
	
	public int compare(Student s1,Student s2) {
		return s1.id - s2.id;
	}
}

 class SortStudentByIdDsc implements Comparator<Student>{
	
	public int compare(Student s1,Student s2) {
		return s2.id - s1.id;
	}
}
 