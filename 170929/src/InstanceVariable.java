class student{
	int m_nKor;
	int m_nEng;
	int m_nMat;
	static String g_strTeacher = "김소만";
}
class InstanceVariable {
	public static void main(String[] args) {
		student obj = new student();
		obj.m_nKor =30;
		obj.m_nEng =40;
		obj.m_nMat =50;
		System.out.println("obj의 국어점수 ="+obj.m_nKor);
		System.out.println("obj의 국어점수 ="+obj.m_nEng);
		System.out.println("obj의 국어점수 ="+obj.m_nMat);
		System.out.println("obj의 선샌님 ="+obj.g_strTeacher);
		student.g_strTeacher= "성채원";
		System.out.println("obj의 국어점수 ="+obj.g_strTeacher);
		
	}

}
