package director;

import builders.Builder;
import components.*;

public class Director {
    public void contructPc(Builder builder){
        //Ordenador de ejemplo
        builder.setUCentral(new UnidadCentral());
        builder.setTeclado(new Teclado("asd", 50));
        builder.setImpresora(Impresora.INYECCION);
        builder.setImpresora(null);
        builder.setPantalla(null);
        builder.setRaton(null);
        builder.setPantallaTactil(null);

    }
}
