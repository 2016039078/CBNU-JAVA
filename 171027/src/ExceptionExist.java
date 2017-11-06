class ExceptionExist {

	public static void main(String[] args) {
		func();
	}
	static void func() {
		int i =1;
		int j =0;
		System.out.println(i/j); //예외발생(문법에는 문제가 없지만 프로그램 실행중에 발생하는 예기치 않은  사건
	}
}
