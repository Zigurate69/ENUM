package ENUM;

public class PrincipalProdutos {

	public static void main(String[] args) {
		
		for (Produtos produto : Produtos.values()) {
			System.out.println(produto);
		}
	}
}