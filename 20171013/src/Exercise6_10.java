
public class Exercise6_10 {
	public static boolean isNumber(String str) {
		if(str==null || str.equals(""))
			return false;
		for(int i=0; i< str.length();i++) {
			char ch = str.charAt(i);
			
		if(ch < '0' || ch > '9') {
			return false;
				}
			}
		return true;
		}
public static void main(String[] args) {
	String str = "613";
	System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
	
	str = "0613a";
	System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
		}
}
