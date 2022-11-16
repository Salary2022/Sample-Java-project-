record Student ( int RollNo,String Name, int Age, String Gender,int TotalMarks){
	Student(){
	this(1,"Shivalakshmi",20,"Female",550);}
	
}
record Vehicle(String Name,String Type,String Color,int Mileage){
	Vehicle(){
	this("Car","SUV","Maroon",25);}
	}

record Employee ( int IDNo,String Name, int Age, String Gender,double Sal){
	Employee(){
	this(1,"Shivalakshmi",20,"Female",550);}
}

record Person(String Name, int Age, String Gender, double ID){
	Person(){
	this("Shivalakshmi",40,"Female",999);}
}
record Animal(String Name, String color, int Legs){
	Animal(){
	this("Cow","White",4);}
}

	class TestRecord{
	public static void main(String arg[]) {
		Student std = new Student(1,"Shivalakshmi",20,"Female",550);
		Student std1 = new Student(2,"Srilekha", 22,"Female",580);
		
		Vehicle p = new Vehicle("Car","SUV","Maroon",25);
		Vehicle p1= new Vehicle("Motercycles","Activa","Red",45);
		
		Employee Emp= new Employee(101,"Shivalakshmi",20,"Female",55550);
		Employee Emp2 = new Employee(303,"Saikiran", 21,"Male",69510);
		
	    Person s = new Person("Shivalakshmi",40,"Female",999);
		Person s1= new Person("Srilekha", 22,"Female",3210);
		
		Animal A = new Animal("Cow","White",4);
		Animal A1= new Animal("Tiger", "Yellow",4);
		
	    System.out.println(std);
		System.out.println(std1);
		 System.out.println("");
		System.out.println(p);
		System.out.println(p1);
		
		System.out.println(Emp);
		System.out.println(Emp2);
		
		System.out.println(s);
		System.out.println(s1);
		
		
		System.out.println(A);
		System.out.println(A1);
	}
	}