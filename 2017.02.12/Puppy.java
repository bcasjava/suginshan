public class Puppy{

	public Puppy(String name){
		//this constructor has one parameter, name.
		System.out.println("passed name is : " + name);
	}
		
	public Puppy(String name1,String name2){
		//this constructor has two parameter, name.
		System.out.println("passed name is : " + name1+ " and "+name2);
	}
	public Puppy(String name1,String name2,String name3){
		//this constructor has three parameter, name.
		System.out.println("passed name is : " + name1+ " and "+name2+ " and " +name3);
	}
	public static void main(String[]args){
		//following statement would create an object myPuppy
		//puppy myPuppy = new puppy( "tommy");
		//Puppy myPuppy = new Puppy( "Dreamer", "Demon");

		Puppy myPuppy = new Puppy( "Dreamer", "Demon", "LEgend_Killer");
		
	}
}

//out put is :