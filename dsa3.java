package DSA;

public class dsa3 {

	public static void main(String[] args) {
		// reverse of no n to 1
funrev(10);
	}
static void funrev(int n) {
	if(n==0) {
		return;
	}
	funrev(n-1);
	System.out.println(n);
	
}
}
