/*
  Creamos la clase padre que es FiguraGeometrica
 */
public class FiguraGeometrica {
    private String nombre;
    private String color;

    /*
     Creamos un constructor para incializar los atributos
     * Complejidad temporal: O(1) Tiempo constante.
     */

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
/*
Creamos el metodo obtener area de las figuras que retorna 0.0
Complejidad temporal: O(1) Tiempo constante
 */
    public double obtenerArea() {
        return 0.0;
    }
/*
/*
Creamos el metodo obtener perimetro de las figuras que retorna 0.0
Complejidad temporal: O(1) Tiempo constante
 */

    public double obtenerPerimetro() {
        return 0.0;
    }
/*
Creamos los gets para mostrar el nombre y el color
 Complejidad temporal: O(1) Tiempo constante
 */
    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }
    /*
    Creamos los sets para darle valor al nombre y el color
     Complejidad temporal: O(1) Tiempo constante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

