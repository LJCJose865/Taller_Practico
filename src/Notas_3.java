import java.util.Scanner;

public class Notas_3 {
    public static void main(String[] args) throws Exception {

        String nombre = "null";
        double mosNota = 0;
        int estudiantes, aprobados = 0, reprobados = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== Sistema de Ingreso de Notas de Estudiantes =====");
        System.out.println("\n===== Cuantos estudiantes desea ingresar? =====");
        estudiantes = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        double[] notas = new double[estudiantes]; //para ingresar la cantidad deseada de estudiantes.
         for (int i = 0; i < estudiantes; i++){

            System.out.println("Ingrese es nombre del estudiante " + (i + 1) + ":");
            nombre = scanner.nextLine();


            System.out.println("Ingrese la Nota del estudiante " + (i + 1) + ":");
            mosNota = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer del scanner
            notas[i] = mosNota;
            //Para verificar si la nota es Valida
   
            while( mosNota < 0.0 || mosNota > 5.0){
                System.out.println("Nota NO valida ingresa una nota entre (0.0 y 5.0) ");
               mosNota = scanner.nextDouble();
               scanner.nextLine(); // Limpiar el buffer del scanner
            }
   
            if (mosNota < 3.0){
               System.out.println("El estudiante " + nombre + " con nota " + mosNota + " Ha Reprobado el Curso" );
               reprobados ++;   
            }else if (mosNota >= 3.0 && mosNota <= 5.0){
               System.out.println("El estudiante " + nombre + " con nota " + mosNota + " Ha Aprobado el Curso" );
               aprobados ++;
            }
         }


         System.out.println("\n===== Resultados finales del Curso =====");
         System.out.println("\nLa cantidad de estudiantes registrados es: " + estudiantes);
         System.out.println("\nLos estudiantes aprobados son: " + aprobados);
         System.out.println("Los estudiantes reprobados son: " + reprobados);
         scanner.close();




    }    
}
