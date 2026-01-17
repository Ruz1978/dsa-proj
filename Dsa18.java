package DSA;

public class Dsa18 {

	public static void main(String[] args) {
		// skip a character
		//skipping "a" & takes 2 arguments
skip("", "baccah");
System.out.println(skip1("baacchah"));
	}
static void skip(String p,String up) {
	if(up.isEmpty()) {
		System.out.println(p);
		return;
	}
 char ch =up.charAt(0);
 if(ch=='a') {
	 skip(p,up.substring(1));
 }else {
	 skip(p+ch,up.substring(1));
 }
}

	//takes single argument 
static String skip1(String up) {
	if(up.isEmpty()) {
		
		return "";
	}
 char ch =up.charAt(0);
 if(ch=='a') {
	return skip1(up.substring(1));
 }else {
	return ch+ skip1(up.substring(1));
 }
}
}
