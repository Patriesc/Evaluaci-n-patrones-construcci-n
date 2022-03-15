package builders;

import Pc.Pc;
import components.*;

public class PcBuilder implements Builder {

    private UnidadCentral uc;
    private Impresora impresora;
    private Raton raton;
    private TabletaGrafica grafica;
    private Teclado teclado;
    private Pantalla pantalla;
    private PantallaTactil tactil;


    @Override
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;

    }
    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

    public void setUCentral(UnidadCentral uc) {
        this.uc = uc;
    }

    @Override
    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public void setTabletaGrafica(TabletaGrafica tableta) {
        this.grafica = grafica;
    }

    @Override
    public void setPantallaTactil(PantallaTactil tactil) {
       this.tactil = tactil;
    }

    public Pc getResult() {
        return new Pc(uc, impresora, raton, grafica, teclado, pantalla);
    }

}

