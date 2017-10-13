import org.omg.CORBA.CODESET_INCOMPATIBLE;

public class ex2 {

	public static void main(String[] args) {
		int[] coinUnit = {500,100,50,10};
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length;i++) {
			int change=0;
			change = money/coinUnit[i];
			System.out.println(coinUnit[i]+ "¿ø : " +change);
			money -= coinUnit[i]*change;
		}
	}
}
