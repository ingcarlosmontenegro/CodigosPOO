import java.awt.Button;
import java.awt.Event;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ArchivoSecuencial extends Frame{
	TextField nit, nombre, empresa, ciudad, telefono, credito;
	Button entradas, salidas;
	Label rotulon, rotulonm, rotuloe, rotuloc, rotulot, rotulocr;
	DataOutputStream salida;

	public ArchivoSecuencial(){
		super ("Crear un archivo de clientes");
	}
	
	public void adicionarregistros(){
		int cuenta=0;
		Double d;
		cuenta=(new Integer(nit.getText())).intValue();
		System.out.print(cuenta);
		try{

			if(cuenta>0){
				/*
				salida.writeInt(cuenta);
				salida.writeUTF(empresa.getText());
				salida.writeUTF(nombre.getText());
				salida.writeUTF(ciudad.getText());
				salida.writeUTF(telefono.getText());
				d=new Double(credito.getText());
				salida.writeDouble(d.doubleValue());
				*/
				//writeUTF() escribe la cadena en un formato conocido como 
				//UTF-8. Este formato incluye información sobre la longitud
				//exacta de la cadena.
				
				salida.writeChars(""+cuenta+"|");
				salida.writeChars(empresa.getText()+"|");
				salida.writeChars(nombre.getText()+"|");
				salida.writeChars(ciudad.getText()+"|");
				salida.writeChars(telefono.getText()+"|");
				d=new Double(credito.getText());
				salida.writeChars(""+d.doubleValue()+"|");
				
			}
		}
		catch(IOException e){
			System.err.println("\nError al escribir en el archivo\n"+e.toString());
			System.exit(1);		
		}
		nit.setText("0");
		//nit.setText("");
		empresa.setText("");
		nombre.setText("");
		ciudad.setText("");
		telefono.setText("");
		credito.setText("");
	}
	
	public void configurar (){
		resize(350,250);
		setLayout(new GridLayout(7,2));
		nit = new TextField(20);
		rotulon=new Label ("Identificacion:");
		rotuloe=new Label ("Empresa:");
		empresa=new TextField(40);
		nombre =new TextField(40);
		rotulonm=new Label ("representante");
		ciudad = new TextField (20);
		rotuloc=new Label("Ciudad");
		telefono =new TextField(20);
		rotulot = new Label("Telefono");
		credito = new TextField(20);
		rotulocr =new Label("Valor Maximo Credito");
		entradas =new Button ("Guardar");
		salidas =new Button ("Terminar");
		add(rotulon);;
		add(nit);
		add(rotuloe);
		add(empresa);
		add(rotulonm);
		add(nombre);
		add(rotuloc);
		add(ciudad);
		add(rotulot);
		add(telefono);
		add(rotulocr);
		add(credito);
		add(entradas);
		add(salidas);

		show();
		try{
			salida= new DataOutputStream(new FileOutputStream("clientes.txt")); 
		}
		catch(IOException e){
			System.err.println("\nNo se abrio bien el archivo\n"+e.toString());
			System.exit(1);
		}
	}
	
	public void limpiar(){
		if (!nit.getText().equals(""))
			adicionarregistros();
			try{
				salida.flush();
				salida.close();
			}
			catch(IOException e){
				System.err.println("\nNo se cerro Bien el Archivo\n"+e.toString());
				System.exit(1);	
			}
	}
	
	public boolean action(Event e, Object obj){
		if(e.target==salidas||e.id==Event.WINDOW_DESTROY){
			limpiar();
			hide();//Oculta un Marco
			dispose();//Liera la memoria utilziada por un marco
			System.exit(0);
			return true;
		}
		if(e.target==entradas){
				adicionarregistros();
				return true;
		}
		return true;
		//return super.handleEvent(e);
	}
	
	/*
	
	public boolean handleEvent(Event e){
		if(e.target==salidas||e.id==Event.WINDOW_DESTROY){
			limpiar();
			hide();//Oculta un Marco
			dispose();//Libera la memoria utilizada por un marco
			System.exit(0);
			return true;
		}
		if(e.target==entradas){
				adicionarregistros();
				return true;
		}
		return super.handleEvent(e);
	}
	
	*/
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArchivoSecuencial clientes=new ArchivoSecuencial();
		clientes.configurar();

	}

}
