package generic;

public class GenericsChallenge {
  
  public static void main(String... doYourBest){
	Archer archer = new Archer();
	
	archer.attack("->");
	archer.attack(Double.valueOf(1.0));
	archer.attack(Float.valueOf(1));
  }
  
  static class Archer<T> {
	T t;
	
	void attack(T t){
	  System.out.println(this.t);
	}
  }
}