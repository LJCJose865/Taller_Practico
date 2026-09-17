/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;
import java.util.Scanner;

/**
 *
 * @author JoséDavidPerezTorres
 */
public class Parcial {
    
    
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double saldo = 500.000, consignar = 0, retirar = 0, saldoActual = 0, transaccion = 0, suma = 0;
       int opcion = 0;
       
       System.out.println("*****Cajero Automatico*****\n");
       do{
           System.out.println("=====Menu de Opciones =====\n");
           System.out.println("¿Que transacción deseas realizar?\n");
           System.out.println("1.Consignar a tu cuenta");
           System.out.println("2.Retirar de tu cuenta");
           System.out.println("3.Realizar una Tranzacción");
           System.out.println("4.Mostrar saldo Actual");
           System.out.println("5.Salir");
           
           opcion = scanner.nextInt();
           
           switch(opcion){
               case 1:
                   System.out.println("¿Cuanto deseas Consignar a tu cuenta");
                   consignar = scanner.nextDouble();
                   suma = saldo + consignar;
                   System.out.println("Tu saldo es " + suma);
                   System.out.println();
                break;
               case 2:
                   System.out.println("¿Cuanto deseas Retirar?");
                   retirar = scanner.nextDouble();
                   suma = saldo - retirar;
                   System.out.println("Haz Retirado " + retirar);
                   System.out.println("\nTu saldo es de: " + suma);
                break;
                
               case 3:
                   System.out.println("¿Cuanto deseas Transferir?");
                   transaccion = scanner.nextDouble();
                   suma = saldo - transaccion;
                   System.out.println("¡Tu transaccion a sido Exitosa!");
                   System.out.println("Tu saldo restante es " + suma);
                break;
                
               case 4: 
                   System.out.println("\nTu saldo Actual es de " + saldo);
                   
                   
                   
           }
           
       }while(opcion != 5);
      
      
   }
    
}
