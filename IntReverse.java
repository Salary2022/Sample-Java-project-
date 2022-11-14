class IntReverse{
	public static void main (String[] args){
     //1.Using While loop	

	long num =123456789;
		long rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse num is :"+rev);
		
		// 2. Using StringBuffer method
		
		   long num1 =123456789;
		StringBuffer g=new StringBuffer(String.valueOf(num1));
		System.out.println("Second type :"+g.reverse());
	}
}