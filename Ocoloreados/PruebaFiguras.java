import java.util.Random;

public class PruebaFiguras {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random random = new Random();
        String[] colores = {"Rojo", "Azul", "Verde", "Amarillo", "Naranja"};

        for (int i = 0; i < figuras.length; i++) {
            int tipoFigura = random.nextInt(2) + 1; // 1 para Cuadrado, 2 para Circulo
            String colorAleatorio = colores[random.nextInt(colores.length)];

            if (tipoFigura == 1) {
                double ladoAleatorio = random.nextDouble() * 10 + 1; // Lado entre 1 y 11
                figuras[i] = new Cuadrado(colorAleatorio, ladoAleatorio);
            } else {
                double radioAleatorio = random.nextDouble() * 5 + 1; // Radio entre 1 y 6
                figuras[i] = new Circulo(colorAleatorio, radioAleatorio);
            }
        }
        // g) Mostrar área, perímetro y llamar a comoColorear si es posible
        for (Figura figura : figuras) {
            System.out.println(figura);
            System.out.println("Área: " + String.format("%.2f", figura.area()));
            System.out.println("Perímetro: " + String.format("%.2f", figura.perimetro()));

            if (figura instanceof Coloreado coloreado) {
                System.out.println("Cómo colorear: " + coloreado.comoColorear());
            }
            System.out.println("---");
        }
    }
}