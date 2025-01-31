package coreJava;

import java.util.*;

class SortStudentByNameAsc implements Comparator<Student>{
	 
	 public int compare(Student s1,Student s2) {
		 return s1.name.compareTo(s2.name);
	 }
}

class SortStudentByNameDsc implements Comparator<Student>{
	 
	 public int compare(Student s1,Student s2) {
		 return s2.name.compareTo(s1.name);
	 }
}

