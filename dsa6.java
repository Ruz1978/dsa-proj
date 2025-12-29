package DSA;

public class dsa6 {

	public static void main(String[] args) {
		// product of all the digits
		int multi=prod(55);
		System.out.println(multi);
	}

	static int prod(int k) {
		if(k%10==k) {
			return k;
		}
		return (k%10) * prod(k/10);
	}
	}


