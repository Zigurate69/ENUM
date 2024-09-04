package ENUM;

public class PrincipalPedido {

	public static void main(String[] args) {
		
		StatusPedido status = StatusPedido.ABERTO;
		StatusPedido status2 = StatusPedido.EM_ANDAMENTO;
		StatusPedido status3 = StatusPedido.ENTREGUE;
		StatusPedido status4 = StatusPedido.CANCELADO;
		
		System.out.println(status);
		System.out.println(status2);
		System.out.println(status3);
		System.out.println(status4);
	}
}