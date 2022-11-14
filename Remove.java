class Remove{
	public static void main(String as[]){
		
		String s= "HelloFriends09876&&&*^$$###";
	//Regular Expression :[a-zA-Z0-9]
	
	
	//s=s.replaceAll("[^a-zA-Z0-9]","");
	//System.out.println(s);
	s=s.replaceAll("[^a-zA-Z]","");
	System.out.println(s);
	}
}