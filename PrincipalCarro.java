package ENUM;

public class PrincipalCarro {

	public static void main(String[] args) {
		
		for (MarcaCarro carro : MarcaCarro.values()) {
			System.out.println(carro);
		}
	}
}