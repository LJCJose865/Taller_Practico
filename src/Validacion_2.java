import java.util.Scanner;

public class Validacion_2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        double nota = 0;

        System.out.println("===== Sistema de Ingreso de Notas =====");
        System.out.println("Ingresa tu nota entre (0.0 y 5.0) ");
        nota = scanner.nextDouble();

        while(nota < 0.0 || nota > 5.0){
            System.out.println("Nota NO valida ingresa una nota entre (0.0 y 5.0) ");
            nota = scanner.nextDouble();
            scanner.close();
        }
        System.out.println("Tu nota " + nota + " es valida");



    }
        
}
