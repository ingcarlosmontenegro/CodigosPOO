class ArregloNombres {

String[] nombres = { "Pedro", "Jorge", "Carlos", "Luis"};
String[] apellidos = new String[nombres.length];

void imprime() {
  int i = 0;

  System.out.println(nombres[i] + " " + apellidos[i]);
  i++;
  System.out.println(nombres[i] + " " + apellidos[i]);
  i++;
  System.out.println(nombres[i] + " " + apellidos[i]);
  i++;
  System.out.println(nombres[i] + " " + apellidos[i]);
}

public static void main (String arguments[]) {
  ArregloNombres a = new ArregloNombres();
  a.imprime();
  System.out.println("-----");
  a.apellidos[0] = "Perez";
  a.apellidos[1] = "Isaac";
  a.apellidos[2] = "Valderrama";
  a.apellidos[3] = "Garzon";
  a.imprime();
  }
} 