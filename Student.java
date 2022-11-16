record Student ( int RollNo,String Name, int Age, String Gender,int TotalMarks){
	Student(){
	this(1,"Shivalakshmi",20,"Female",550);}
	public static void main(String arg[]) {
		Student std = new Student(1,"Shivalakshmi",20,"Female",550);
		Student std1 = new Student(2,"Srilekha", 22,"Female",580);
		Student std2 = new Student(3,"Saikiran", 21,"Male",510);
		
	    System.out.println(std);
		System.out.println(std1);	
		System.out.println(std2);
		
	}
}