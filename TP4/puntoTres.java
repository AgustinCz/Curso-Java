package TP4;
import java.util.*;

public class puntoTres {
    Scanner entrada = new Scanner (System.in);

    public void compra(){
        String producto;
        int cantidad;
        double precio;
        double subtotal;
        double neto = 0;
        double descuento;

        System.out.println("Ingrese el nombre del producto:");
        producto = entrada.next();
        System.out.println("Ingrese el precio unitario del producto:");
        precio = entrada.nextDouble();
        System.out.println("Ingrese la cantidad a comprar:");
        cantidad = entrada.nextInt();

        subtotal = precio*cantidad;
        descuento = subtotal*0.20;

        System.out.println("El subtotal de su compra es: " + subtotal);

        if (subtotal > 1000){
            System.out.println("Tiene un descuento de: " + descuento);
            neto = subtotal - descuento;
        }
        else {
            System.out.println("No tiene descuentos disponible.");
            neto = subtotal;
        }
        System.out.println("- - - - - - - - - - - - - - - - - ");
        System.out.println("El neto a pagar es: " + neto);
        System.out.println("¡Muchas gracias por su compra!");
    }

    public void opciones(){
        String cliente;
        System.out.println("Ingrese su nombre:");
        cliente = entrada.next();

        System.out.println("Ingrese el tipo de producto que desea comprar:");
        String tipo = " ";

        System.out.println("Lácteos");
        System.out.println("Frutas");
        System.out.println("Gaseosas");
        System.out.println("----------------------------------------");

        tipo = entrada.next();
        switch(tipo){
            case "Lácteos": compra();
            break;
            case "Frutas": compra();
            break;
            case "Gaseosas": compra();
            break;
            default:{
                System.out.println("Lo siento, no entendí lo que quiso escribir :(");
            }
        }
    }

    public static void main(String[] args) {
        puntoTres cp = new puntoTres();
        cp.opciones();
    }
}
