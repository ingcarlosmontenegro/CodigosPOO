

public class Paleta implements Cloneable {

	/** 
	 * @uml.property name="color"
	 */
	protected String color;

	/** 
	 * Getter of the property <tt>color</tt>
	 * @return  Returns the color.
	 * @uml.property  name="color"
	 */
	public String getColor() {
		return color;
	}

	/** 
	 * Setter of the property <tt>color</tt>
	 * @param color  The color to set.
	 * @uml.property  name="color"
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	 public Object clone() 
	    {
	        Object clone = null;
	         try 
	         {
	             clone = super.clone();
	         }
	         catch(CloneNotSupportedException e) 
	         {
	             // No deberia ocurrir
	         }
	         return clone;
	    }
}
