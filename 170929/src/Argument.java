class Calculate
{
	int result=0;
	void inc1(int n) {
		n++;
	}
	void inc2(Calculate test) {
		test.result++;
	}
}
class Argument{
	public static void main(String[] args) {
		int a=10;
		Calculate cal = new Calculate();
		cal.result=10;
		cal.inc1(a);
		System.out.println("a="+a);
		cal.inc2(cal);
		System.out.println("cal.result="+cal.result);
	}
}