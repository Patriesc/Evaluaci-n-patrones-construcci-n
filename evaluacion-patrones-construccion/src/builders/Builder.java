package builders;
import components.*;

public interface Builder {
    void setTeclado(Teclado teclado);
    void setRaton(Raton raton);
    void setPantalla(Pantalla pantalla);
    void setTabletaGrafica(TabletaGrafica tableta);
    public void setUCentral(UnidadCentral uc);
    public void setImpresora(Impresora impresora);
    public void setPantallaTactil(PantallaTactil tactil);




}
