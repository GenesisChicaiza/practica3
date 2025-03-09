package src.aplicacion;
import src.mates.Matematicas;


/**
 * @author Genesis Chicaiza
 * Clase principal que contiene el método main para ejecutar la aplicación.
 */
public class Principal {

    /**
     * Imprime el valor de PI calculado de forma recursiva.
     *
     * @param args argumentos de la línea de comandos
     */

    public static void main(String[] args) {
        System.out.println("El número PI es " + Matematicas.piLambda(100000));
    }

}
