package DSA;

public class dsa5 {

	public static void main(String[] args) {
		// sum of n nos
int add=sum(7);
System.out.println(add);
int ans=add(3451);
System.out.println(ans);
	}
static int sum(int n) {
	if(n<=1) {
		return 1;
	}
	return n+sum(n-1);

}


//sum of digits
public static void main() {
	int ans=add(3451);
	System.out.println(ans);
}

static int add(int a) {
	if(a==0) {
		return 0;
	}
	return (a%10) + add(a/10);
}
}



















