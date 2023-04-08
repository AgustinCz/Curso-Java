import java.util.Scanner;

public class puntoDos {
    public static void main(String[] args) {
            
            Scanner datos =  new Scanner (System.in); {
                System.out.println("Ingrese su nombre:");
                String nombre = datos.next();
                System.out.println("Ingrese su apellido:");
                String apellido = datos.next();
                System.out.println("Ingrese su edad:");
                int edad = datos.nextInt();
                System.out.println("Usted se llama " + nombre + " " + apellido + " y tiene " + edad +" años.");

            if (edad >= 18){
                System.out.println("Usted es mayor de edad");}
            else {
                System.out.println("Usted es menor de edad");
            }
        }
    }
}
