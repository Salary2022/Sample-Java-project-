record Employee ( int IDNo,String Name, int Age, String Gender,double Sal){
	Employee(){
	this(1,"Shivalakshmi",20,"Female",550);}
	public static void main(String arg[]) {
		Employee Emp= new Employee(101,"Shivalakshmi",20,"Female",55550);
		Employee Emp1 = new Employee(202,"Srilekha", 22,"Female",25580);
		Employee Emp2 = new Employee(303,"Saikiran", 21,"Male",69510);
		
	    System.out.println(Emp);
		System.out.println(Emp1);	
		System.out.println(Emp2);
		
	}
}