import java.awt.Color;

public class Carro {

  private Color color;
  private String placa;

  public Carro(){
  
  }

  public Color getColor(){
    return color;
  }

  public String getString(){
    return placa;
  }

  public void setColor(Color colorcito){
    this.color = colorcito;
  } 

  public void setString(String placa){
    this.placa = placa;
  }

  public static void main (String[] args){
    Carro renault = new Carro();
    renault.setString ("AAA555");
    System.out.print(renault.getString());
  }

}