package EInversionDependencias;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificadorWp noticia = new NotificadorWp();
		NotificadorEmail noticia2 = new NotificadorEmail();
		NotificadorSMS noticia3 = new NotificadorSMS();
		GestorNotificacioes notificacion = new GestorNotificacioes(noticia);
		notificacion.notificar("Mensaje enviado");
		GestorNotificacioes notificacion2 = new GestorNotificacioes(noticia2);
		notificacion2.notificar("Mensaje enviado");
		GestorNotificacioes notificacion3 = new GestorNotificacioes(noticia3);
		notificacion3.notificar("Mensaje enviado");
	}

}
