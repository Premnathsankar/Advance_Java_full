package mock;

public class RemoveDup {

	public static void main(String[] args) {
		
		StringBuilder a = new StringBuilder("zaakapps");
		
		for(int i =0;i<a.length()-1;i++) {
			if(a.charAt(i)==a.charAt(i+1)) {
				a.deleteCharAt(i+1);
			}
		}
		System.out.println(a);
	}

}
