public class Calculadora {
  int numero;
  int resultado = 0;

  void suma (){
    resultado = resultado + numero;
  }

    void resta (){
    resultado = resultado - numero;

  }

    void mult (){
    resultado = resultado * numero;

  }

    void div (){
    resultado = resultado / numero;

  }

    void mod (){
    resultado = resultado % numero;

  }

  void setNumero (int num){
    this.numero = num;
  }

  int getResultado (){
    return resultado;
  }

  public static void main (String[] args){
    Calculadora calPanadera = new Calculadora();
    calPanadera.setNumero(5);
    calPanadera.suma();
    calPanadera.setNumero(5);
    calPanadera.suma();
    System.out.println (calPanadera.getResultado());
    calPanadera.setNumero(2);
    calPanadera.mult();
    System.out.println (calPanadera.getResultado());
    calPanadera.setNumero(5);
    calPanadera.resta();
    System.out.println (calPanadera.getResultado());
    calPanadera.setNumero(3);
    calPanadera.div();
    System.out.println (calPanadera.getResultado());
    calPanadera.setNumero(2);
    calPanadera.mod();
    System.out.println (calPanadera.getResultado());
  }



}