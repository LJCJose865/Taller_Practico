/*

* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

*/


 
/**

*

* @author JoséDavidPerezTorres

*/

public class Trabajos_Matrices {

    public static void reportePorProducto (int [][] inventario, String [] producto, String[] sucursales){

        for (int i = 0; i < producto.length; i++){

            System.out.println(producto[i] + ": ");

            for( int j = 0; j < sucursales.length; j++){

                System.out.println(sucursales [j] + " = " + inventario [i][j] + " ");

            }

            System.out.println();

        }

    }

    public static void reportePorSucursal (int [][] inventario, String [] producto, String[] sucursales){

        for (int j = 0; j < sucursales.length; j++){

            System.out.println(sucursales [j] + ": ");

            for (int i = 0; i < producto.length; i++) {

                System.out.println(producto[i] + " = " + inventario[i][j] + " ");

            }

            System.out.println();

        }

    }    

    public static void resumenInventario (int [][] inventario, String [] producto, String[] sucursales){

        int totalGeneral = 0;

        int [] totalProducto = new int [producto.length];

        int [] totalSucursal = new int [sucursales.length];

        for(int i = 0; i < producto.length; i++){

            for (int j = 0; j < sucursales.length; j++){

                totalGeneral += inventario [i][j];

                totalProducto [i] += inventario [i][j];

                totalSucursal [j] += inventario [i][j];

            }

        }

        System.out.println("Existencia total "+ totalGeneral + " Unidades");

        for(int i = 0; i < producto.length; i++){

            System.out.println(producto [i] + ": " + totalProducto[i] + " Unidades totales");

        }

        for (int j = 0; j < sucursales.length; j++){

            System.out.println(sucursales[j] + ": " + totalSucursal[j] + " Unidades totales");

        }

    }
 
    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        String [] producto = {"camisetas", "pantalones", "zapatos", "chaquetas"};

        String [] sucursales = {"norte", "sur", "centro"};

        int [][] inventario = {

            {50, 30, 10}, //camisieta

            {15, 20, 25}, // pantalones

            {60, 10, 35}, //Zapatos

            {5, 8, 12} //chaquetas


        };

        reportePorProducto (inventario, producto, sucursales);

        System.out.println("---------------");

        reportePorSucursal (inventario, producto, sucursales);

        System.out.println("---------------");




    }

}

 