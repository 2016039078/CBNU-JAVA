class student{
	int m_nKor;
	int m_nEng;
	int m_nMat;
	static String g_strTeacher = "��Ҹ�";
}
class InstanceVariable {
	public static void main(String[] args) {
		student obj = new student();
		obj.m_nKor =30;
		obj.m_nEng =40;
		obj.m_nMat =50;
		System.out.println("obj�� �������� ="+obj.m_nKor);
		System.out.println("obj�� �������� ="+obj.m_nEng);
		System.out.println("obj�� �������� ="+obj.m_nMat);
		System.out.println("obj�� ������ ="+obj.g_strTeacher);
		student.g_strTeacher= "��ä��";
		System.out.println("obj�� �������� ="+obj.g_strTeacher);
		
	}

}
