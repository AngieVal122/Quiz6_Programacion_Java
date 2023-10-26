class Triangulo extends FiguraGeometrica {
    private double base;   // La base del triángulo
    private double altura; // La altura del triángulo

/*

    Creamos un constructor y llamamos los atributos de la clase padre por medio de super
     inicializamos los atributos de triangulo
    Complejidad temporal: O(1) Tiempo constante
 */
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
    /*
    Llamamos el método de obtenerArea y lo complementamos con la formula del area del triangulo
Complejidad temporal: O(1) Tiempo constante
     */

    @Override
    public double obtenerArea() {
        return (base * altura)/2;
    }
/*
Llamamos el método de obtenerPerimetro y lo complementamos con la formula del perimetro del triangulo
Complejidad temporal: O(1) Tiempo constante
 */
    @Override
    public double obtenerPerimetro() {
        return base + altura + Math.sqrt(base * base + altura * altura);
    }
}
