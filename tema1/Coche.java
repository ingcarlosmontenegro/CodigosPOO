import java.awt.Color;

public class Coche {

  private Color color;
  private String placa;

  public Coche(){
  
  }

  public Color getColor(){
    return color;
  }

  public String getString(){
    return placa;
  }

  public void setColor(Color color){
    this.color = color;
  } 

  public void setString(String placa){
    this.placa = placa;
  }

  public static void main (String[] args){
    Coche renault = new Coche();
    renault.setString ("AAA555");
    System.out.print(renault.getString());
  }

}