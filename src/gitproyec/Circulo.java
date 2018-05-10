//Created dir: G:\DAM\Programacion\documentacion1\dist\javadoc

package gitproyec;
/** MODIFICO EN GigHub
 * @author Vicente Martinez Juan
 * @version circulo 26-04/2018
 */
public class Circulo {

    private double centroX;
    private double centroY;
    private double radio;

 /**
 * Constructor
 * @param x centro: coordenada X.
 * @param y centro: coordenada Y.
 * @param r radio. * 
 */
    public Circulo(double x, double y, double r) {
        centroX = x;
        centroY = y;
        radio = r;
    }
/**
* Getter.
* @return centro: coordenada X.
*/
    public double getCentroX() {
        return centroX;
    }
/**
* Método que Calcula la longitud de la circunferencia (perímetro del círculo).
* @return perímetro.
*/
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
/**
* Método que desplaza el círculo a otro lugar.
* @param despX movimiento en el eje X.
* @param despY movimiento en el eje Y.
*/
    public void mueve(double despX, double despY) {
        centroX = centroX + despX;
        centroY = centroY + despY;
    }
}
