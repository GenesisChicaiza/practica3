package src.mates;

import java.util.stream.IntStream;

/**
 * @author : Genesis Chicaiza
 * Contiene métodos que realizan operaciones usando streams.
 */
public class Matematicas {

    /**
     * Método que calcula una aproximación del valor de Pi utilizando el método de Montecarlo.
     * @param pasos
     * @return Una aproximación del valor de Pi.
     */

    public static double piLambda(long pasos) {
        long puntosDentroDelCirculo = IntStream.range(0, (int) pasos)
                .mapToObj(i -> new double[]{Math.random(), Math.random()})
                .filter(punto -> punto[0] * punto[0] + punto[1] * punto[1] <= 1)
                .count();
        return 4 * (double) puntosDentroDelCirculo / pasos;
    }

}
