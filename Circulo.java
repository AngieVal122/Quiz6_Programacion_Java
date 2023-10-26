class Circulo extends FiguraGeometrica{
    // Creamos el atributo radio
    // complejidad temporal: O(1)Tiempo constante
    private double radio;

/*

    Creamos un constructor y llamamos los atributos de la clase padre por medio de super
    e inicializamos los atributos de rectangulo
    Complejidad temporal: O(1) Tiempo constante
     */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }
/*
Llamamos el método de obtenerArea y lo complementamos con la formula del area del circulo
Complejidad temporal: O(1) Tiempo constante
 */
    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    /*
    Llamamos el método de obtenerPerimetro y lo complementamos con la formula del perimetro del circulo
Complejidad temporal: O(1) Tiempo constante
     */

    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}