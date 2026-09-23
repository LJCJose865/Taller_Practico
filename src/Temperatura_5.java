import java.util.Scanner;
import java.util.Arrays;

public class Temperatura_5 {
    
       
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        double[] temperaturas = new double[7];

        for (int i = 0; i < dias.length; i++){
            System.out.println("Ingrese la temperatura del " + dias[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        System.out.println("\n**** Temperaturas registradas durante la semana ****");
        for(int i = 0; i < dias.length; i++){
            System.out.println("\n" + dias[i] + ": " + temperaturas[i] + "°C");
        }

        double maximo = 0, minimo = 0, promedio = 0, suma = 0;

    
        
        for(int i = 0; i < temperaturas.length; i++){
            if (temperaturas[i] > maximo){
                maximo = temperaturas[i];
            }else if (temperaturas[i] < minimo){
                minimo = temperaturas[i];
            }

            suma += temperaturas[i];
            promedio = suma / temperaturas.length;
        }
        
        System.out.println("\n ***** Resultados de temperatura semalan ******");
        System.out.println("Temperatura maxima " + maximo + "°C");
        System.out.println("Temperatura minima " + minimo + "°C");
        System.out.println("Promedio de temperatura " + promedio + "°C");


    }
}
