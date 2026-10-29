/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        String titular;
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        //Descuentos
        double dNetflix = 0.23;
        double dYoutube = 0.23;
        double dDropbox = 0.45;
        double dSpotify = 0;
        //finales
        double finalNetflix;
        double finalYoutube;
        double finalDropbox;
        double finalSpotify;
        //calculos
        double costoBruto;
        double ahorro;
        double finalTotal;
        
        
        
        
        System.out.println("Nombres del cliente:");
        titular = entrada.nextLine();
        System.out.println("Costo mensual de Netflix:");
        netflix = entrada.nextDouble();
        System.out.println("Costo mensual de YouTube:");
        youtube = entrada.nextDouble();
        System.out.println("Costo mensual de Dropbox:");
        dropbox = entrada.nextDouble();
        System.out.println("Costo mensual de Spotify:");
        spotify = entrada.nextDouble();
        
        finalNetflix = netflix - (netflix * dNetflix);
        finalYoutube = youtube - (youtube * dYoutube);
        finalDropbox = dropbox - (dropbox * dDropbox);
        finalSpotify = spotify - (spotify * dSpotify);
        
        costoBruto = netflix+youtube+dropbox+spotify;
        ahorro = (netflix * dNetflix) + (youtube * dYoutube) + (dropbox * dDropbox) + (spotify * dSpotify);
        finalTotal = costoBruto-ahorro;
        
        
        System.out.printf("Nombre del cliente: %s\n\n" +
        "Precios originales:\n" +
        "Costo mensual de Netflix: %.2f\n" +
        "Costo mensual de YouTube: %.2f\n" +
        "Costo mensual de Dropbox: %.2f\n" +
        "Costo mensual de Spotify: %.2f\n\n" +
        "Descuentos aplicados:\n" +
        "Descuento Netflix: %.2f\n" +
        "Descuento YouTube: %.2f\n" +
        "Descuento Dropbox: %.2f\n" +
        "Descuento Spotify: %.2f\n\n" +
        "Precios finales individuales:\n" +
        "Final Netflix: %.2f\n" +
        "Final YouTube: %.2f\n" +
        "Final Dropbox: %.2f\n" +
        "Final Spotify: %.2f\n\n" +
        "Resumen general:\n" +
        "Costo total sin descuento: %.2f\n" +
        "Ahorro obtenido: %.2f\n" +
        "Total a pagar: %.2f\n",
        titular, netflix, youtube, dropbox, spotify,
        netflix * dNetflix, youtube * dYoutube, dropbox * dDropbox, spotify * dSpotify,
        finalNetflix, finalYoutube, finalDropbox, finalSpotify,
        costoBruto, ahorro, finalTotal);
    }
    
}