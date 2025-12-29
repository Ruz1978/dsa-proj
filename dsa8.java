package DSA;

public class dsa8 {

	public static void main(String[] args) {
		//count the no  of zeros 
		System.out.println(count(30201));

	}
static int count(int n) {
	return helper(n,0);
}
private static int helper(int n , int c) {
	if(n==0) {
		return c;
	}
	int rem=n%10;
	if(rem==0) {
		return helper(n/10,c+1);
	}
	return helper(n/10,c);
}
}
