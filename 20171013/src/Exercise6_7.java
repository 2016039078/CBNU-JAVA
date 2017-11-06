
public class Exercise6_7 { /*
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
	static int cv2 = iv; // 라인 A
	static void staticMethod1() {
	System.out.println(cv);
	System.out.println(iv); // 라인 B
	}
	void instanceMethod1() {
	System.out.println(cv);
	System.out.println(iv); // 라인 C
	 }
	static void staticMethod2() {
	staticMethod1();
	instanceMethod1(); // 라인 D
	}
	void instanceMethod2() {
	staticMethod1(); // 라인 E
	instanceMethod1();
	}
	6 , 9 , 17 번째줄, 
	6번 static 변수의 초기화에 인스턴스변수 사용 할 수 없음
	9번 static 메소드에서는 인스턴스 변수 사용 할 수 없음
	17번 9번과 같은 이유
	
	class Exercise6_19
	{
		public static void change(String str)
		{
		str += "456";
		}
	public static void main(String[] args)
	{
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:"+str);
	}
	}
	ABC123
	After change:ABC123
	//값이 바뀌지 않음
*/
	
}
