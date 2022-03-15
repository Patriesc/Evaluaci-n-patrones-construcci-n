import Pc.Pc;
import builders.PcBuilder;
import director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        PcBuilder builder = new PcBuilder();
        director.contructPc(builder);

        Pc pc = builder.getResult();
        // No se muestra nada ya que el manual no está creado
        System.out.println(pc);
    }
}
