package coreJava;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1,"muni",'B',400);
		Student s2 = new Student(3,"siva",'O',480);
		Student s3 = new Student(5,"kamlesh",'A',450);
		Student s4 = new Student(4,"prem",'B',441);
		Student s5 = new Student(2,"suki",'B',430);
	
		ArrayList<Student> sl =new ArrayList<Student>();
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		sl.add(s4);
		sl.add(s5);
		
		SortStudentByIdAsc idAsc = new SortStudentByIdAsc();
		SortStudentByIdDsc idDsc = new SortStudentByIdDsc();
		SortStudentByNameAsc nameAsc = new SortStudentByNameAsc();
		SortStudentByNameDsc nameDsc = new SortStudentByNameDsc();
		
		
		Collections.sort(sl,nameAsc);
		
		for(Student s : sl) {
			System.out.println(s);
		}
	}

}
