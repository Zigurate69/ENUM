package ENUM;

public class PrincipalMarca {

	public static void main(String[] args) {
		
		for (MarcaRoupa marca : MarcaRoupa.values()) {
			System.out.println(marca);
		}
	}
}