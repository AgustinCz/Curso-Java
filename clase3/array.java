public class array {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        int i;

        for (i=0; i<15; i++){
            numeros[i]= i+1;
            System.out.println(numeros[i]);
        }
        for (i=0; i<15; i++){
            numeros[i]= (i+1)*5;
            System.out.println(numeros[i]);
        }
        puntoc();
    }
    public static void puntoc() {
        int[] numeros = new int[10];
        int i;

        for (i=0; i<10; i++){
            numeros[i]= i+1;
        }
        System.out.println(numeros[6]/3);
    }
}

