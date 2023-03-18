import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        try (Scanner tienda = new Scanner(System.in)) {
            System.out.println("Ingrese la cantidad de productos de la tienda: ");
            int n = tienda.nextInt();

            String[][] productos= new String[n][2];
            for (int i = 0; i<n; i++){
                System.out.println("Ingrese el nombre del producto "+ (i+1) + ":");
                productos[i][0] = tienda.next();
                System.out.println("Ingrese el precio del producto "+ (i+1) + ":");
                productos[i][1] = tienda.next();
            }

            for (int i = 0; i<n; i++){
                System.out.println(productos[i][0]+ ": $"+ productos[i][1]);
            }
        }
    }
}
