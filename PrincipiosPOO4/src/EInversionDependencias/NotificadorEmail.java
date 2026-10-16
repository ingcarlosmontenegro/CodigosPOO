package EInversionDependencias;

public class NotificadorEmail implements Notificador{
	@Override
	public void enviar(String mensaje) {
		// TODO Auto-generated method stub
		System.out.println("Enviado email: "+ mensaje);
	}

}
