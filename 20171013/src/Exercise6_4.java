class Mypoint{
	int x;
	int y;
	Mypoint(int x, int y)
	{
	this.x = x;
	this.y = y;
	}
		double getDistance(int x1, int y1)
		{
			return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
		}
	class Exercise6_4 {
	public void main (String args[])
	{
		Mypoint p = new Mypoint(1,1);
		System.out.println(p.getDistance(2,2));
		}
	}
}
/*
class PlayingCard {
	int kind;
	int num;
	static int width;
	static int height;
	PlayingCard(int k, int n)
	 {
	kind = k;
	num = n;
	}
	public static void main(String args[]) {
		PlayingCard card = new PlayingCard(1,1);
		}
	}
- 클래스변수(static변수) : width, height
- 인스턴스변수 : kind, num
- 지역변수 : k,n,card
*/
