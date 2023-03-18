package clase3;
import java.util.Scanner;

public class cursos {
    public static void main(String[] args) {
        try (Scanner cursos = new Scanner(System.in)) {
            double[][] notas = new double[3][3];
            for (int i = 0; i<3; i++){
                double promedio = 0;
                System.out.println("Ingrese las notas del curso " + (i+1)+ ": ");
                for (int j=0; j<3; j++){
                    notas[i][j] =cursos.nextDouble();
                    promedio= promedio+notas[i][j]; 
                }
                System.out.println("El promedio del curso "+ (i+1) +" es: "+promedio/3);
            }
        }
    }
}
