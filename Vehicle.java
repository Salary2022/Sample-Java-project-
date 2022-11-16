record Vehicle(String Name,String Type,String Color,int Mileage){
	Vehicle(){
	this("Car","SUV","Maroon",25);}
	public static void main(String arg[]) {
		Vehicle p = new Vehicle("Car","SUV","Maroon",25);
		Vehicle p1= new Vehicle("Motercycles","Activa","Red",45);
		Vehicle p2= new Vehicle("Jeep","Gladiator","White",20);
		
	    System.out.println(p);
		System.out.println(p1);	
		System.out.println(p2);
		
	}
}