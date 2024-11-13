package org.lessons.java.security;

public class PasswordGenerator {
    public static void main(String[] args) {

        // Dati dell'utente
        // Definisco le variabili per tipo

        String name = "Danilo";
        String fistName = "Pirro";   
        String favoriteColor = "Verde";
        int dayBirth = 01;
        int monthBirth = 7;
        int yearBirth = 1990;

        // Calcolo la somma tra giorno, mese e anno di nascita

        int sommaData = dayBirth + monthBirth + yearBirth;

        // ! Chiedo di generare una password concatenando le informazioni richieste e separando con "-"

        String password = name + "-" + fistName + "-" + favoriteColor + "-" + sommaData;

        // Mando iin stampa la password generata

        System.out.println("La password generata è: " + password);
    }
}