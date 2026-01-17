package DSA;

import java.util.ArrayList;

public class Dsa25 {

	public static void main(String[] args) {
		// combinations of a keypad mobile 
pad("","12");
System.out.println(padarr("","12"));
	}
	static void pad(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		int digit =up.charAt(0) -'0';  //this will convert '2' into 2
		for(int i=(digit-1) * 3;i<digit * 3;i++) {
			char ch=(char) ('a'+i); //conversion 
			pad(p+ch,up.substring(1));
		}
	}
	static ArrayList<String> padarr(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		int digit =up.charAt(0) -'0';  //this will convert '2' into 2
		ArrayList<String> list=new ArrayList<>(); //for returning arraylist
		for(int i=(digit-1) * 3;i<digit * 3;i++) {
			char ch=(char) ('a'+i); //conversion 
			list.addAll(padarr(p+ch,up.substring(1)));
		}
		return list;
	}

}


