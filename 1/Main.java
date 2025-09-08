public class Main {
    public static void main(String[] args) {
        Formas circulo = new Circulo(3.0);
        Formas retangulo = new Retangulo(7.0, 5.0);

        System.out.println("======== Área das formas geométricas ========");
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}