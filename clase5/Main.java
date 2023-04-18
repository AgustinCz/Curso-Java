package clase5;

public class Main {
    public static void main(String[] args) {
        Carrito carritoSuper = new Carrito();

        System.out.println("¡Ha ingresado al programa de asistencia del Supermercado!");
        System.out.println("- * - * - * - * - * - * - * - * - * -");
        System.out.println("Si realiza una compra mayor a $2000, se le asignará un descuento de 20%.");
        System.out.println("El total a pagar es de: $" + carritoSuper.precio());

        System.out.println("¡Muchas gracias por su compra!");
    }
}

