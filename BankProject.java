class Banking{
 int grtInterest(){
	return 0; }
	}
	
	class Srilekha extends Banking {
		int getInterest(){
		return 3; }
	}
	
	
	class Navya extends Banking {
		int getInterest(){
		return 7; }
	}
	
	class Saikiran extends Banking {
		int getInterest(){
		return 11; }
	}
	class Sivalakshmi extends Banking {
		int getInterest(){
		return 13; }
	}
	
	class BankProject {
	public static void main(String[] args) {
		Srilekha sri= new Srilekha();
		System.out.println("Srilekha bank rate of interest is :"+sri.getInterest());
		
		Navya n = new Navya();
		System.out.println("Navya bank rate of interest is :"+n.getInterest());
		
		Saikiran S= new Saikiran();
		System.out.println("Saikiran  bank rate of interest is :"+S.getInterest());
		
		Sivalakshmi siva= new Sivalakshmi();
		System.out.println("Sivalakshmi bank rate of interest is :"+siva.getInterest());
	}
	}