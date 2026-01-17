package DSA;

public class Dsa19 {

	public static void main(String[] args) {
		// skip a String 
		System.out.println(skipApple("skdnapplemjdcj"));
		System.out.println(skipApp("skdnapplemjdcj"));

	}
	static String skipApple(String k) {
		if(k.isEmpty()) {
			return "";
		}
		if(k.startsWith("apple")) {
			return skipApple(k.substring(5));
		}else {
			return k.charAt(0)+ skipApple(k.substring(1));  //main fun is substring 
		}
	}
	
	
	//skip app not apple
	static String skipApp(String k) {
		if(k.isEmpty()) {
			return "";
		}
		if(k.startsWith("app") && !k.startsWith("apple")) {  //the not equal is the added 
			return skipApp(k.substring(3));
		}else {
			return k.charAt(0)+ skipApp(k.substring(1));  //main fun is substring 
		}
	}

}



