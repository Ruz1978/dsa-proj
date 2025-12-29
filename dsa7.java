package DSA;

public class dsa7 {

	public static void main(String[] args) {
		// reverse of a number 
		//method 1
		rev1(1234);
		System.out.println(sum);
rev2(12321);
	}
static int sum=0;
static void rev1(int n) {
	if(n==0) {
		return;
	}
	int rem =n%10;
	sum=sum*10+rem;
	rev1(n/10);
}
//method 2
static int rev2(int n) {
	int digits=(int)(Math.log10(n)) +1;
	return helper(n,digits);
}
private static int helper(int n,int digits) {
	if(n%10==n) {
		return n;
	}
	int rem=n%10;
	return rem*(int)(Math.pow(10, digits-1))+ helper(n/10,digits-1);
}
//for palindrome 
public boolean palin(int n) {
	return n==rev2(n);
	
}


}
