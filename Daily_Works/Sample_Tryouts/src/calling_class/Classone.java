package calling_class;
public class Classone {

	public static void main(String[] args) {
		
		Classtwo performadd = new Classtwo();
		System.out.println(performadd.add());
		
		Classthree performnewadd = new Classthree();
		System.out.println(performnewadd.newadd(20,30));
	}
}
