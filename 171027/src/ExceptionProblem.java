class ExceptionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {10,20,30};
		try {
			for(int i =0; i<4;i++)
			{
				System.out.println("ar["+i+"]:"+ar[i]);
			}
			}
		catch(Exception e)
		{
			System.out.println("예외가 발생했습니다.");
		}
		finally
		{
			System.out.print("=========================================\n");
			System.out.append("예외 발생여부와 상관업이 수행됩니다.");
		}
	}
}
