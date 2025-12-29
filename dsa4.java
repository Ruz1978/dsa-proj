package DSA;

public class dsa4 {

	public static void main(String[] args) {
		// factorial of a no N 
int num=fact(6);
System.out.println(num);
	}
static int fact(int n ) {
	if(n<=1) {
		return 1;
	}
	return n *fact(n-1);
}
}
