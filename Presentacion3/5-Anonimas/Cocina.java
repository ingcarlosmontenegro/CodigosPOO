
public class Cocina {

	
	public static void main (String[] args){
		 Chef objTortelini = new Chef(){
			public void metodo(){
				System.out.println("Clase anonima con metodo Chef con edad: "+edad);
			}
			public void metodo2(){
				System.out.println("Clase anonima con metodos2 Chef con edad: "+edad);
			}
		};
		objTortelini.metodo();
		objTortelini.metodo2();

    Chef objChefcito = new Chef();
    objChefcito.metodo();
    objChefcito.metodo2();
	}
}
