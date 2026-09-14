import java.util.Scanner;
import java.util.Arrays;
public class Contador_4 {
    public static void main(String[] args) throws Exception {
        
        int numero = 0;
        int positivo = 0;
        int negativo = 0;
        int cero = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Contador de Numeros Positivos, Negativos y Ceros =====");
        System.out.println("\nIngresa 10 numeros aleatorios, entre positivos y negativos: ");
        numero = 10;

        int[] contador = new int[numero];
        for (int i = 0; i < numero; i++){
            contador[i] = scanner.nextInt();
            if(contador[i] > 0){
                positivo ++;
                
            }else if(contador[i] < 0){
                negativo ++;
                
            }else if (contador[i] == 0){
                cero ++;
            }
        }
        
        System.out.println("\n===== Resultados finales del Contador =====");
        System.out.println("\nLos numeros Ingresados son: " + Arrays.toString(contador));
        System.out.println("\nLa cantidad de nuemros positivos es : " + positivo);
        System.out.println("\nLa cantdad de numeros negativos encontados es: " + negativo);
        System.out.println("\nLa cantidad de numeros ceros encontados es: " + cero);
        scanner.close();


    }
}
