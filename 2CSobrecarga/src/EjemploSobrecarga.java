class EjemploSobrecarga{
 
void hacerAlgo(Pepe pe){ 
	System.out.println("Procesando Pepe...");
}

void hacerAlgo(Humano hum){ 
	System.out.println("Procesando un Humano...");
}
 
public static void main(String[] args) { 
	Humano pepe; 
	pepe = new Pepe();
	new EjemploSobrecarga().hacerAlgo(pepe);
	}
}