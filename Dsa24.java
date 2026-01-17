package DSA;

public class Dsa24 {

	public static void main(String[] args) {
		// count the no

		
		System.out.println(permutations("","abc"));
	}

	static int permutations(String p,String up) {
		if(up.isEmpty()) {
		
			return 1;
		}
		int count=0;
		char ch=up.charAt(0);
		for(int i=0;i<=p.length();i++) {
			String f=p.substring(0,i);
			String s=p.substring(i,p.length());
			count =count +permutations(f+ch+s,up.substring(1));
		}
		return count;
	}
}

