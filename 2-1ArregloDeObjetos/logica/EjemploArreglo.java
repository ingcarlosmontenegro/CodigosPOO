package logica;



public class EjemploArreglo {

    public static void main(String[] args) {
        Contacto[] c = new Contacto[2];
        
        c[0] = new Contacto();
        c[0].setNombre("Juan");
        c[0].setApellido("Diaz");
        c[0].setTelefono("2334567");
        
        c[1] = new Contacto();
        c[1].setNombre("Miguel");
        c[1].setApellido("Mendez");
        c[1].setTelefono("2378907");
        
        for(int i=0;i<c.length;i++){
            System.out.println(c[i].getApellido()+
                    " "+c[i].getNombre()+
                    " "+c[i].getTelefono());
        }
    }

}
