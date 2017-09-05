package creating_constructors;

public class Earth {

	public static void main(String[] args) {
		
		Human naveen = new Human(); /*using the constructor to create Human Naveen Ravi*/
		naveen.name = "Naveen Ravi";
		naveen.eyecolor = "Brown";
		naveen.age = 32;
		naveen.height = 175;
		naveen.speak();
		
		Human praveen = new Human(); /*using same constructor to create Human Praveen Ravi*/
		praveen.name = "Praveen Ravi";
		praveen.eyecolor = "yellow";
		praveen.age = 35;
		praveen.height = 185;
		praveen.speak();
		praveen.sleep();

	}

}
