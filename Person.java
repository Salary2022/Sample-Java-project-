record Person(String Name, int Age, String Gender, double ID){
	Person(){
	this("Shivalakshmi",40,"Female",999);}
	public static void main(String arg[]) {
		Person p = new Person("Shivalakshmi",40,"Female",999);
		Person p1= new Person("Srilekha", 22,"Female",3210);
		Person p2= new Person("Saikiran", 21,"Male",83210);
		
	    System.out.println(p);
		System.out.println(p1);	
		System.out.println(p2);
		
	}
}