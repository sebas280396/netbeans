/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1programa;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Practica8 {
public static void main (String [] args ){    
Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese una frase de 8 caracteres de extension");
    String palabra = leer.nextLine();
    int longitud;
    longitud = palabra.length();
    
    if(longitud == 8){
        System.out.println("La frase ingresada es "+palabra+ " y tiene "+longitud+" caracteres");  
}
    else{
        System.out.println("la frase ingresa es "+palabra+" y tiene mas de 8 caracteres" );
    }
}
}
