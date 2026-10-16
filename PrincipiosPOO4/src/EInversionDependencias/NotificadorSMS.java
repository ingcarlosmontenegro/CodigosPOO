package EInversionDependencias;

public class NotificadorSMS implements Notificador {

	@Override
	public void enviar(String mensaje) {
		// TODO Auto-generated method stub
		System.out.println("Enviado SMS: "+ mensaje);

	}

}
