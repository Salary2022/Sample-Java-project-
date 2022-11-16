
class Ex
{
	int a;
	int b;
	 
	 void add()//method definition
	 {
		 System.out.println("Addition result is :"+(a+b));
	 }
	 
	 
	 void add(int a)//method definition
	 {
		 System.out.println("Addition result is :"+(a+b));
	 }
	 
	 void add(float j,float k)//method definition
	 {
		 System.out.println("Addition result is :"+(a+b));
	 }
	 
	 
	 
}
class methods {
	public static void main(String[] args)
	{
		int p=12;
		int q=13;
		Ex obj1= new Ex();
		obj1.a=p;
		obj1.b=q;
		
		
		obj1.add();//method calling
		obj1.add(19);
		obj1.add(2.5f,3.6f);
	}
}
