package examentrimestral3;

/**
 * Clase Cafetera que implementa la interface Cafetería
 *
 * @author Victoria Moreno Luque
 * @version 1.0
 */

public class Cafetera implements Cafeteria {

    private int volumenTotalCafetera;
    private int cantidadCafe;
    
    /**
     * Método get de la variable volumenTotalCafetera
     * @return the volumenTotalCafetera
     */
    public int getVolumenTotalCafetera() {
        return volumenTotalCafetera;
    }

    /**
     * Método set de la variable volumenTotalCafetera
     * @param volumenTotalCafetera the volumenTotalCafetera to set
     */
    public void setVolumenTotalCafetera(int volumenTotalCafetera) {
        this.volumenTotalCafetera = volumenTotalCafetera;
    }

    /**
     * Método get de la variable cantidadCafe
     * @return the cantidadCafe
     */
    public int getCantidadCafe() {
        return cantidadCafe;
    }

    /**
     * Método set de la variable cantidadCafe
     * @param cantidadCafe the cantidadCafe to set
     */
    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }
    
    /**
     * Constructor de la clase Cafetera con dos parámetros
     * @param cantidadCafe Parámetro de tipo entero
     * @param volumenTotalCafetera Parámetro de tipo entero
     */
    public Cafetera(int cantidadCafe, int volumenTotalCafetera) {
        this.cantidadCafe = cantidadCafe;
        this.volumenTotalCafetera = Math.max(volumenTotalCafetera, cantidadCafe);
    }
    
    /**
     * Constructor de la clase Cafetera con un parámetro
     * @param volumenTotalCafetera Parámetro de tipo entero
     */
    public Cafetera(int volumenTotalCafetera) {
        this(volumenTotalCafetera, 0);
    }
    
    /**
     * Constructor de la clase Cafetera sin parámetros
     */
    public Cafetera() {
        this(1000, 0);
    }
    
    //Estos métodos get y set de la variable volumenTotalCafetera están repetidos
    //public int get_volumenTotalCafetera() {
    //    return getVolumenTotalCafetera();
    //}

    //public void set_volumenTotalCafetera(int volumenTotalCafetera) {
    //    this.setVolumenTotalCafetera(volumenTotalCafetera);
    //}
    
    /**
     * Método para llenar la cafetera
     */
    @Override
    public void llenarCafetera() {
        setCantidadCafe(getVolumenTotalCafetera());
    }

    /**
     * Método para servir una taza de café
     * @param tamanoTaza Parámetro de tipo entero
     * @throws Exception Indica que no hay café en la cafetera
     */
    @Override
    public void servirTaza(int tamanoTaza) throws Exception {
        setCantidadCafe(getCantidadCafe() - tamanoTaza);
        if (getCantidadCafe() < 0) {
            setCantidadCafe(0);
        } else {
            throw new Exception("No hay café");
        }
    }
    
    /**
     * Método para vaciar la cafetera
     */
    @Override
    public void vaciarCafetera() {
        setCantidadCafe(0);
    }
    
    /**
     * Método para servir una taza de café
     * @param cantidad Parámetro de tipo entero
     * @throws Exception Indica que el café rebosa de la cafetera
     */
    public void agregarCafe(int cantidad) throws Exception {
        setCantidadCafe(getCantidadCafe() + cantidad);
        if (getCantidadCafe() > getVolumenTotalCafetera()) {
            setCantidadCafe(getVolumenTotalCafetera());
        } else {
            throw new Exception("Rebosa");
        }

    }
}
