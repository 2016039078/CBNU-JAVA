
public class Exercise6_2 {
	public static void main(String args[]) {
		
		Student s = new Student();
		s.name = "±Ëº“πŒ";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("¿Ã∏ß:"+s.name);
		System.out.println("√—¡°:"+s.getTotal());
		System.out.println("∆Ú±’:"+s.getAverage());
		}

}
class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int getTotal() 
	{
		return kor + eng + math;
	}
		float getAverage() 
		{
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
		}
}