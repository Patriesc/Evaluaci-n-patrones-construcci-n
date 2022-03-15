package Pc;

import components.*;

public class Pc {
    private final UnidadCentral uc;
    private final Impresora impresora;
    private final Raton raton;
    private final TabletaGrafica grafica;
    private final Teclado teclado;
    private final Pantalla pantalla;

    public Pc(UnidadCentral uc, Impresora impresora, Raton raton, TabletaGrafica grafica, Teclado teclado, Pantalla pantalla) {
        this.uc = uc;
        this.impresora = impresora;
        this.raton = raton;
        this.grafica = grafica;
        this.teclado = teclado;
        this.pantalla = pantalla;
    }

    public UnidadCentral getUc() {
        return uc;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public Raton getRaton() {
        return raton;
    }

    public TabletaGrafica getGrafica() {
        return grafica;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }
}
