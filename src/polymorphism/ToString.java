package polymorphism;

public class ToString  { 
  static int number = 10; 

  public static void main(String... doYourBest) {
      new ToString(); 
  } 

  public ToString() { 
      //##REPLACE##
  } 

  public String toString() { return "ToString.number = " + number; } 

  static class MisterBean extends ToString { } 
}

// Despues de ejecutar la siguiente sentencie, ¿que opcion imprime: "ToString.number = 10"?


// A -  System.out.println(this + "" + new MisterBean());

// B -  System.out.println(this);

// C -  System.out.println(new MisterBean());
