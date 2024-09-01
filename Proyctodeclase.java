/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyctodeclase;
import java.util.Scanner;
/**
 *
 * @author xavi
 */
public class Proyctodeclase {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int k = 5;
        
        System.out.println("seleccione la operacion");
        System.out.println("1. quiero cotizar un viaje");
        System.out.println("2. quiero solicitar un viaje");
        System.out.println("seleccione la opcion");
        int opcion = entrada.nextInt();
        
        System.out.println("ingrese la fecha");
        float fecha = entrada.nextFloat();
        System.out.println("ingrese los quilometros a recorrer");
        int km = entrada.nextInt();
        
        int resultado = 0;
        
        switch (opcion){
            case 1:
              
                resultado = Multiplicar(km,k);
                System.out.println("el precio del viaje es" + resultado);
            case 2:
                  resultado = sumar(km,k)
                 System.out.println("la cotización es de"+ sumar);
        }
        
        System.out.println("ingrese el tipo de unidad que desea");
        System.out.println("1. veinte pasajeros");
        System.out.println("2. treinta pasajeros");
        System.out.println("3. cuarenta pasajeros");
        System.out.println("4. cincuenta pasajeros");
        int opcio = entrada.nextInt();
        
        
    }
    public static int Multiplicar(int km, int k){
        return km * k;
    }
    public static int sumar(int km, int k) {
          return km * k;

}
}
