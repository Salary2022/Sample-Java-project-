class StringReverse{
	public static void main(String[] args)
	{   
		String s= "Sri lekha";
		int len= s.length();
		String rev="";
		for(int i= len-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
	//		System.out.println(rev);     /*we placed sysout ststement here output will be display like a/ah/ahk/....*/
	
		}
		System.out.println(rev);
		
		
		
		//using String Buffer class
		   
		   StringBuffer sb = new StringBuffer(s);
		   System.out.println(sb.reverse());
		
		
	}
}