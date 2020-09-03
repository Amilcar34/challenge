package polymorphism;

public class DraculaChalleng {
  public static void main(String... doYourBest){
	Dracula dracula = new Alucard();
	
	System.out.println(dracula.name + dracula.getName());
	System.out.println(dracula.metamorphosis());
  }
  
  static class Dracula {
	String name = "Dracula";
	
	static String metamorphosis(){
	  return "werewolf";
	}
	
	String getName(){
	  return this.name;
	}
  }
  
  static class Alucard extends Dracula {
	String name = "Alucard";
	
	static String metamorphosis(){
	  return "bat";
	}
	
	String getName(){
	  return this.name;
	}
  }
  
  /**
   * Es clave entender que en polimorfismo no se sobrescriben los atributos.
   */
}
