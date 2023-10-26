class Rectangulo extends FiguraGeometrica {
    /*
    Creamos los atributos lado1 y lado2
   Complejidad temporal: O(1) Tiempo constante
     */
    private double lado1;
    private double lado2;

    /*
    Creamos un constructor y llamamos los atributos de la clase padre por medio de super
    e inicializamos los atributos de rectangulo
    Complejidad temporal: O(1) Tiempo constante
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
/*
Llamamos el método de obtenerArea y lo complementamos con la formula del area del rectangulo
Complejidad temporal: O(1) Tiempo constante
 */
    @Override
    public double obtenerArea() {
        return lado1 * lado2;
    }
    /*
    Llamamos el método de obtenerPerimetro y lo complementamos con la formula del area del rectangulo
    Complejidad temporal: O(1) Tiempo constante
     */

    @Override
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }
}