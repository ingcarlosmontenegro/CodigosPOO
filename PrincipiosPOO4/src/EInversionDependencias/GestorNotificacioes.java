package EInversionDependencias;

public class GestorNotificacioes {
	private Notificador notificador;
	
	public GestorNotificacioes(Notificador notificador){
		this.notificador = notificador;
	}
	
	public void notificar (String mensaje){
		this.notificador.enviar(mensaje);		
	}

}
