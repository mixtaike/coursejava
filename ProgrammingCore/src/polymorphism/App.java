package polymorphism;

abstract class Mamifero {
	  public abstract double obterCotaDiariaDeLeite();
	}

	class Elefante extends Mamifero {
	  public double obterCotaDiariaDeLeite(){
	    return 20.0;
	  }
	}

	class Rato extends Mamifero {
	  public double obterCotaDiariaDeLeite() {
	    return 0.5;
	  }
	}

	class App {
	  public static void main(String args[]){
	    System.out.println("Polimorfismo\n");
	    Mamifero mamifero1 = new Elefante();
	    System.out.println("Cota diaria de leite do elefante: " + mamifero1.obterCotaDiariaDeLeite());
	    Mamifero mamifero2 = new Rato();
	    System.out.println("Cota diaria de leite do rato: " + mamifero2.obterCotaDiariaDeLeite());
	  }
	}




