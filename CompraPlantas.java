import java.util.Scanner;
import java.util.HashMap;

public class CompraPlantas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> catalogo = new HashMap<>();
        catalogo.put("Rosa", 15.0);
        catalogo.put("Orquídea", 20.0);
        catalogo.put("Cactus", 8.0);

        double total = 0.0;
        boolean seguirComprando = true;

        while (seguirComprando) {
            System.out.println("Catálogo de plantas:");
            for (String planta : catalogo.keySet()) {
                System.out.println("- " + planta + ": $" + catalogo.get(planta));
            }

            System.out.print("¿Qué planta deseas comprar? (o escribe 'salir' para finalizar): ");
            String planta = scanner.nextLine();
            if (planta.equalsIgnoreCase("salir")) {
                seguirComprando = false;
            } else if (catalogo.containsKey(planta)) {
                System.out.print("¿Cuántas unidades deseas? ");
                int cantidad = scanner.nextInt();
                double precio = catalogo.get(planta) * cantidad;
                total += precio;
                System.out.println("Se han agregado " + cantidad + " " + planta + " al carrito.");
            } else {
                System.out.println("Planta no encontrada.");
            }
        }

        System.out.println("Total a pagar: $" + total);
    }
}