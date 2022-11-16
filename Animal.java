record Animal(String Name, String color, int Legs){
	Animal(){
	this("Cow","White",4);}
	public static void main(String arg[]) {
		Animal p = new Animal("Cow","White",4);
		Animal p1= new Animal("Goat", "Black",4);
		Animal p2= new Animal("Tiger", "Yellow",4);
		
	    System.out.println(p);
		System.out.println(p1);	
		System.out.println(p2);
		
	}
}